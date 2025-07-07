import logging
from antlr4 import *
from generated.lensLexer import lensLexer
from generated.lensParser import lensParser
from ErrorHandler import CustomErrorListener
from SemanticAnalyzer import SemanticAnalyzer
from ASTDotVisitor import ASTDotVisitor
from TACGenerator import TACGenerator
from LLVMIRGenerator import LLVMIRGenerator
import subprocess

# Configuração do logging - APENAS para arquivo
logging.basicConfig(
    filename='analisador.log',
    filemode='w',
    encoding='utf-8',
    level=logging.INFO,
    format='%(asctime)s - %(levelname)s - %(message)s'
)

def analisar_arquivo(caminho_arquivo):
    try:
        logging.info(f"Iniciando análise do arquivo: {caminho_arquivo}")

        with open(caminho_arquivo, "r", encoding="utf-8") as f:
            codigo = f.read()

        logging.info("Código carregado com sucesso.")
        print("📥 Código carregado:\n" + "-"*40)
        print(codigo)
        print("-"*40)

        # ========================================
        # 🔍 FASE 1: ANÁLISE LÉXICA
        # ========================================
        print("\n🔍 FASE 1: Análise Léxica")
        
        input_stream = InputStream(codigo)
        lexer = lensLexer(input_stream)

        error_listener_lexer = CustomErrorListener()
        lexer.removeErrorListeners()
        lexer.addErrorListener(error_listener_lexer)

        token_stream = CommonTokenStream(lexer)
        token_stream.fill()

        if error_listener_lexer.tem_erro:
            logging.warning("Erro léxico detectado. Encerrando análise.")
            print("❌ Erros léxicos encontrados. Encerrando análise.")
            return
        
        print("✅ Análise léxica concluída sem erros.")

        # 📊 RESULTADO DA ANÁLISE LÉXICA - TOKENS
        logging.info("Tokens analisados com sucesso. Imprimindo tokens:")
        print("\n🔎 Tokens identificados:")
        for i, token in enumerate(token_stream.tokens):
            if token.type != Token.EOF:
                nome = (lexer.symbolicNames[token.type] 
                       if token.type < len(lexer.symbolicNames) and lexer.symbolicNames[token.type] 
                       else f"TOKEN_{token.type}")
                print(f"{i+1:3d}. <{nome}, '{token.text}', L{token.line}, C{token.column}>")
                logging.info(f"Token: <{nome}, {token.text}, Linha {token.line}, Coluna {token.column}>")

        # ========================================
        # 🔍 FASE 2: ANÁLISE SINTÁTICA
        # ========================================
        print("\n🔍 FASE 2: Análise Sintática")
        
        parser = lensParser(token_stream)

        error_listener_parser = CustomErrorListener()
        parser.removeErrorListeners()
        parser.addErrorListener(error_listener_parser)

        arvore = parser.lens()

        if error_listener_parser.tem_erro:
            logging.warning("Erro sintático detectado. Encerrando análise.")
            print("❌ Erros sintáticos encontrados. Encerrando análise.")
            return
        
        print("✅ Análise sintática concluída sem erros.")

        # 🌳 RESULTADO DA ANÁLISE SINTÁTICA - AST
        print("\n🌳 Gerando AST...")
        
        visitor = ASTDotVisitor()
        visitor.visit(arvore)
        logging.info("AST gerada com sucesso.")

        with open("ast.dot", "w", encoding="utf-8") as f:
            f.write(visitor.get_dot())
        logging.info("Arquivo 'ast.dot' salvo com sucesso.")
        print("✅ Arquivo 'ast.dot' salvo com sucesso.")

        # Tentar gerar imagem PNG da AST
        dot_paths = [
            r"C:\Program Files\Graphviz\bin\dot.exe",
            r"C:\Program Files (x86)\Graphviz\bin\dot.exe",
            "dot"  # Caso esteja no PATH
        ]

        imagem_gerada = False
        for dot_path in dot_paths:
            try:
                subprocess.run([dot_path, "-Tpng", "ast.dot", "-o", "ast.png"], 
                             check=True, capture_output=True, text=True)
                logging.info("Imagem 'ast.png' gerada com sucesso.")
                print("🖼️ AST gerada com sucesso em 'ast.png'.")
                imagem_gerada = True
                break
            except FileNotFoundError:
                continue
            except subprocess.CalledProcessError as e:
                logging.error(f"Erro ao executar dot: {e.stderr}")
                print("❌ Erro ao executar o comando 'dot'. Verifique a sintaxe do arquivo 'ast.dot'.")
                break

        if not imagem_gerada:
            print("⚠️ Graphviz não encontrado. AST salva apenas como .dot")
            print("💡 Instale o Graphviz para gerar imagens: https://graphviz.org/download/")

        # ========================================
        # 🔍 FASE 3: ANÁLISE SEMÂNTICA
        # ========================================
        print("\n🔍 FASE 3: Análise Semântica")
        
        logging.info("Iniciando análise semântica.")
        semantic = SemanticAnalyzer()
        semantic.visit(arvore)
        semantic.report()

        if semantic.errors_found:
            print("❌ Erros semânticos encontrados:")
            print(f"   • Consulte 'analisador.log' para detalhes completos")
            print("📊 Tokens e AST foram gerados com sucesso (veja acima).")
            print("\n🛑 COMPILAÇÃO INTERROMPIDA - Código não será gerado devido a erros semânticos.")
            print("💡 Corrija os erros semânticos e execute novamente.")
            return

        print("✅ Análise semântica concluída sem erros.")

        # ========================================
        # 🔧 FASE 4: GERAÇÃO DE CÓDIGO (Só se sem erros)
        # ========================================
        print("\n🔧 FASE 4: Geração de Código Intermediário (TAC)")
        
        # Só chega aqui se NÃO houver erros semânticos
        logging.info("Iniciando geração de código TAC.")
        tac_generator = TACGenerator()
        tac_generator.visit(arvore)
        
        print("✅ Código TAC gerado com sucesso.")
        print("\n📝 Código TAC:")
        print("-" * 50)
        print(tac_generator.get_tac_code())
        print("-" * 50)
        
        if tac_generator.save_to_file("output.tac"):
            print("✅ Código TAC salvo em 'output.tac'.")

        # ========================================
        # 🔧 FASE 5: GERAÇÃO DE LLVM IR
        # ========================================
        print("\n🔧 FASE 5: Escolha do Backend de Geração")
        print("2. LLVM IR (.ll)")
        
        arquivos_gerados = []

        logging.info("Iniciando geração de código LLVM IR.")
        llvm_generator = LLVMIRGenerator(tac_generator.instructions)
            
        print("✅ Código LLVM IR gerado com sucesso.")
        print("\n🦙 Código LLVM IR:")
        print("-" * 60)
        print(llvm_generator.generate())
        print("-" * 60)
            
        if llvm_generator.save_to_file("output.ll"):
            print("✅ Código LLVM IR salvo em 'output.ll'.")
            arquivos_gerados.append("output.ll")

        # ========================================
        # 🎉 FINALIZAÇÃO
        # ========================================
        print("\n🎉 COMPILAÇÃO COMPLETA! Pipeline finalizado com sucesso!")
        print("🚀 Arquivos gerados:")
        print("   • analisador.log  - Log detalhado")
        print("   • ast.dot/.png    - Árvore Sintática")
        print("   • output.tac      - Código Intermediário")
        
        for arquivo in arquivos_gerados:
            if arquivo == "output.ll":
                print("   • output.ll       - LLVM IR")

        # ========================================
        # 💡 INSTRUÇÕES DE EXECUÇÃO
        # ========================================
        print("\n💡 Instruções de execução:")
        
        if "output.ll" in arquivos_gerados:
            print("\n📋 LLVM IR (output.ll):")
            print("   # Execução direta:")
            print("   clang output.ll -o output.exe")

        print("\n🔧 Dependências necessárias:")
        if "output.ll" in arquivos_gerados:
            print("   • LLVM (clang)")
            print("   • MinGW (GCC)")

    except Exception as e:
        logging.exception(f"Erro durante a análise: {e}")
        print(f"❌ Erro durante a análise: {e}")

if __name__ == "__main__":
    print("🚀 COMPILADOR LENS - Pipeline Completo")
    print("📋 Fases: Léxica → Sintática → Semântica → TAC → LLVM")
    print("=" * 80)
    
    # caminho = str(input("Digite o nome do arquivo Lens: "))
    caminho = "script"
    analisar_arquivo(f'{caminho}.lens')