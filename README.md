# Lens — Lightweight Efficient Neutral Syntax

> Uma linguagem de programação leve, eficiente, neutra e de sintaxe simples.

---

## ✨ Sobre a Lens

**Lens** é uma linguagem de programação fictícia, criada com o objetivo de ser:

* **Lightweight** — Estrutura minimalista e rápida de entender
* **Efficient** — Operações básicas feitas de forma direta e objetiva
* **Neutral** — Sem impor estilos de programação complexos ou paradigmas específicos
* **Syntax** — Focada em uma sintaxe intuitiva e limpa

A Lens possui **tipagem estática obrigatória**, e não possui funções ou objetos nesta versão. É ideal para fins **didáticos**, como ensino de lógica, criação de compiladores e exploradores de gramáticas com ANTLR.

---

## ⚙️ Analisador Semântico

Este repositório implementa um **Analisador Semântico** completo para programas Lens, com base no parser gerado pelo ANTLR4.

Ele realiza as seguintes validações:

| Verificação semântica                          | Suporte |
| ---------------------------------------------- | ------- |
| Uso de variáveis sem declaração                | ✔️      |
| Uso de variáveis antes de atribuição           | ✔️      |
| Declaração duplicada de variáveis              | ✔️      |
| Tipos incompatíveis em atribuições             | ✔️      |
| Operações aritméticas entre tipos inválidos    | ✔️      |
| Operações lógicas com não-booleanos            | ✔️      |
| Divisão por zero                               | ✔️      |
| Escopo correto em `if`, `else`, `for`, `while` | ✔️      |

---

## 📦 Estrutura de Arquivos

```
project/
├── main.py                  # Executa o analisador
├── SemanticAnalyzer.py      # Lógica do analisador semântico
├── ErrorHandler.py          # Tratamento de erros léxicos/sintáticos
├── lens.g4                  # Gramática ANTLR da linguagem Lens
├── generated/               # Arquivos gerados pelo ANTLR
│   ├── lensLexer.py
│   ├── lensParser.py
│   ├── lensVisitor.py
├── script.lens              # Código de teste
├── analisador.log           # Log da análise semântica
└── ast.png                  # Visualização da AST (opcional)
```

---

## 📅 Entrada e 📄 Saída na Lens

### 📄 print

```lens
print:: "Nome:", nome, idade
```

### 📅 input

```lens
input(nome)
```

---

## 🧬 Variáveis na Lens

### Declaração

```lens
let idade: int
let nome: String = "João"
```

### Atribuição e Operações

```lens
idade = 20
idade = idade + 5
```

---

## 🔁 Laços

### `for`

```lens
for i in 0..5 {
    print:: i
}
```

### `while`

```lens
while i < 10 {
    print:: i
}
```

---

## 🔀 Condicionais

```lens
if ativo && idade >= 18 {
    print:: "Maior de idade"
} elseif idade == 17 {
    print:: "Quase lá"
} else {
    print:: "Menor de idade"
}
```

---

## ✅ Exemplo de Análise semântica com erro

```lens
@start
    let nome: String
    print:: nome, idade
@end
```

Saída esperada:

```bash
[Erro Semântico] Linha 3: Variável 'idade' usada sem declaração.
```

---

## 🛠️ Como usar

1. Gere os arquivos do ANTLR:

```bash
antlr4 -Dlanguage=Python3 -visitor lens.g4 -o generated
```

2. Execute o analisador:

```bash
python main.py
```

3. Veja o log gerado:

* Terminal colorido com `colorama`
* Log salvo em `analisador.log`
* AST gerada com Graphviz (opcional)

---

## 📌 Requisitos

* Python 3.10+
* `colorama` (para mensagens coloridas)

```bash
pip install colorama
```

* ANTLR 4.13+
* (Opcional) Graphviz para visualização da AST

---

## 1. Gerador de Código Intermediário (TACGenerator)

A classe `TACGenerator` é responsável por converter a Árvore Sintática Abstrata (AST) da linguagem Lens em código intermediário no formato TAC (Three-Address Code).

### 1.1 Estrutura Geral

```python
class TACGenerator(lensVisitor):
    def __init__(self):
        self.instructions = []
        self.temp_counter = 0
        self.label_counter = 0
```

### 1.2 Geração de Temporários e Labels

```python
def new_temp(self):
    self.temp_counter += 1
    return f"_t{self.temp_counter}"

def new_label(self):
    self.label_counter += 1
    return f"L{self.label_counter}"
```

### 1.3 Emissão de Instruções TAC

```python
def emit(self, op, arg1=None, arg2=None, result=None):
    instruction = {'op': op, 'arg1': arg1, 'arg2': arg2, 'result': result}
    self.instructions.append(instruction)
```

### 1.4 Exemplo: Expressões Aritméticas

```python
def visitExpressao_arit(self, ctx):
    result = self.visit(ctx.termo_arit(0))
    for i in range(1, len(ctx.termo_arit())):
        op = ctx.op_adicao(i-1).getText()
        right = self.visit(ctx.termo_arit(i))
        temp = self.new_temp()
        self.emit(op, result, right, temp)
        result = temp
    return result
```

### 1.5 Exemplo: Estruturas Condicionais

```python
def visit_if_statement(self, ctx, end_label):
    else_label = self.new_label()
    condition = self.visit(ctx.condicao())
    self.emit('IF_FALSE', condition, None, else_label)
    # comandos do bloco
    self.emit('GOTO', None, None, end_label)
    self.emit('LABEL', None, None, else_label)
```

---

## 2. Gerador de LLVM IR (LLVMIRGenerator)

A classe `LLVMIRGenerator` transforma o código TAC gerado anteriormente em LLVM IR, um formato intermediário usado pelo compilador Clang.

### 2.1 Header Automático

```python
def get_target_triple():
    try:
        result = subprocess.run(["llvm-config", "--host-target"], capture_output=True, text=True, check=True)
        return result.stdout.strip()
    except:
        return "x86_64-pc-linux-gnu"

def _generate_header(self):
    target_triple = get_target_triple()
    self.llvm_code.extend([
        f"target triple = \"{target_triple}\""
    ])
```

### 2.2 Tradução de Instruções TAC

```python
if op == '+':
    llvm.append(f"%{res} = add i32 %{arg1}, %{arg2}")
elif op == 'ASSIGN':
    llvm.append(f"%{res} = add i32 0, %{arg1}")
```

### 2.3 Impressão de Strings

```llvm
@.str_1 = private unnamed_addr constant [13 x i8] c"Resultado: %d\0A\00"
```

### 2.4 Função Main LLVM

```llvm
define i32 @main() {
entry:
    ; instruções geradas aqui
    ret i32 0
}
```

---

## 3. Execução do Programa

### 3.1 Geração do Executável

```bash
clang output.ll -o output
```

### 3.2 Inspeção Opcional

```bash
llc output.ll -o output.s   # Assembly
clang -c output.ll -o output.o   # Objeto
```

---

## 4. Resumo do Pipeline

1. Parser (ANTLR) gera a AST.
2. `TACGenerator` converte AST em TAC:

   ```tac
   _t1 = 10 + 5
   print _t1
   ```
3. `LLVMIRGenerator` traduz TAC para LLVM IR:

   ```llvm
   %_t1 = add i32 10, 5
   call i32 (i8*, ...) @printf(i8* getelementptr ..., i32 %_t1)
   ```
4. Clang compila para binário:

   ```bash
   clang output.ll -o output
   ```

---

## 5. Dependências Necessárias

* **LLVM** (llvm-config, llc, clang)
* **Clang** (para compilar IR)
* **Opcional:** MinGW no Windows para gerar `.exe`

---

Este documento pode ser utilizado como base para apresentações, documentação do compilador ou manuais de uso.

---

## 💡 Contribuições e Licença

Este projeto tem fins educacionais. Sinta-se livre para explorar, adaptar e estender para estudos de compiladores.

---

> 🚀 Lens é mais do que uma linguagem: é uma porta de entrada para o estudo de como linguagens são construídas!
