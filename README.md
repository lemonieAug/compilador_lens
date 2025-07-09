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

# Gerador de Código Intermediário (TACGenerator - Three-Address Code)


Este documento apresenta uma explicação clara e objetiva sobre o funcionamento do gerador de TAC para a linguagem Lens, utilizando como base o código da classe `TACGenerator`.

---

## 1. Objetivo Geral

O gerador de TAC tem como finalidade traduzir o código-fonte da linguagem Lens para um código intermediário em formato de Três Endereços (Three-Address Code), facilitando etapas posteriores como a geração de código de máquina.

---

## 2. Componentes Fundamentais

### 2.1. Temporários e Labels

```python
def new_temp(self):
    self.temp_counter += 1
    return f"_t{self.temp_counter}"

def new_label(self):
    self.label_counter += 1
    return f"L{self.label_counter}"
```

Essas funções são usadas para criar nomes únicos para variáveis temporárias (\_t1, \_t2, ...) e labels (L1, L2, ...) que são essenciais para controle de fluxo.

### 2.2. Emissão de Instruções

```python
def emit(self, op, arg1=None, arg2=None, result=None):
    instruction = {'op': op, 'arg1': arg1, 'arg2': arg2, 'result': result}
    self.instructions.append(instruction)
    return instruction
```

Essa função adiciona uma instrução TAC à lista principal. Cada instrução pode representar uma atribuição, operação aritmética, comparação, leitura, impressão ou salto condicional.

### 2.3. Formatação

```python
def format_instruction(self, instr):
    # Retorna a instrução em forma legível (ex: _t1 = a + b)
```

Serve para mostrar as instruções TAC em um formato compreensível para humanos, por exemplo:

```
3: _t1 = idade + 5
```

---

## 3. Geração de Código por Elemento da Linguagem

### 3.1. Declaração

```python
def visitDeclaracao(self, ctx):
    # Se houver expressão, visita e gera ASSIGN
```

Gera código para declaração de variável, incluindo inicialização.

### 3.2. Atribuição

```python
def visitAtribuicao(self, ctx):
    # Trata atribuições simples e compostas como idade += 5
```

Identifica se é uma atribuição simples (`x = y`) ou composta (`x += y`) e gera o TAC correspondente.

### 3.3. Impressão

```python
def visitImpressao(self, ctx):
    # print :: valor
```

Gera uma ou mais instruções `PRINT` para expressões.

### 3.4. Entrada de Dados

```python
def visitEntrada(self, ctx):
    self.emit('read', None, None, var_name)
```

Cria uma instrução `read` para entrada do usuário.

### 3.5. Expressões Aritméticas e Lógicas

```python
def visitExpressao_arit(self, ctx):
    # _t1 = a + b
```

```python
def visitExpressao_logica(self, ctx):
    # _t3 = _t1 && _t2
```

Essas funções geram código TAC para operações matemáticas e lógicas.

---

## 4. Controle de Fluxo

### 4.1. Condicionais

```python
def visitCondicional(self, ctx):
    # if, elseif, else com IF_FALSE e GOTO
```

Para if/elseif/else, labels são criados e usados para direcionar o fluxo com saltos condicionais.

### 4.2. Laços (While/For)

```python
def visitLacowhile(self, ctx):
    # while (cond) {...}
```

```python
def visitLacofor(self, ctx):
    # for i in a..b {...}
```

Usam `LABEL`, `IF_FALSE` e `GOTO` para simular os ciclos de repetição.

---

## 5. Exemplo de Saída TAC

Para o seguinte trecho da linguagem Lens:

```lens
let idade: int = 25
idade += 5
print :: idade
```

O TAC gerado seria:

```
1: _t1 = 25
2: idade = _t1
3: _t2 = idade + 5
4: idade = _t2
5: print idade
```

---

## 6. Conclusão

O TAC é uma representação intermediária fundamental para compiladores. Esse gerador é responsável por transformar a estrutura da linguagem Lens em uma forma que facilita a análise posterior pelo backend do compilador (LLVM IR, por exemplo).

Cada método "visit" corresponde a um nó da árvore sintática gerada pelo ANTLR. Isso garante modularidade e clareza na transformação do código-fonte.

Esse processo também ajuda o aluno a entender os conceitos de parsing, simbolização, e otimização de código.


---

## 2. Gerador de LLVM IR (LLVMIRGenerator)

# Visão Geral Simplificada da Geração de Código LLVM IR

Este documento apresenta de forma clara e direta como o compilador da linguagem Lens gera código intermediário em LLVM IR (Intermediate Representation), uma etapa fundamental no processo de compilação.

---

## Objetivo

Transformar o código da linguagem Lens em LLVM IR, que pode ser posteriormente compilado para um executável utilizando o compilador `clang`.

---

## Estrutura Geral

A geração é feita pela classe `LLVMIRGenerator`. A função principal aqui é construir o arquivo `.ll` com base nas instruções TAC previamente geradas.

---

## Cabeçalho do Arquivo LLVM IR

Logo no início do arquivo LLVM, é adicionado um cabeçalho com informações básicas de compilação:

```python
self.llvm_code.extend([
    "; Código LLVM IR gerado para a linguagem Lens",
    "; Gerado automaticamente pelo compilador",
    "",
    "target datalayout = \"e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128\"",
    "target triple = \"x86_64-pc-linux-gnu\"",
    ""
])
```

### Componentes:

* **Comentários**: Informações sobre a origem do código.
* **target datalayout**: Define o layout de dados na memória.
* **target triple**: Define o sistema alvo da compilação (`x86_64-pc-linux-gnu`, ou seja, Linux 64 bits).

---

## Função `_generate_header`

```python
def _generate_header(self):
    """Gera o cabeçalho do arquivo LLVM."""
    self.llvm_code.extend([...])
```

Esta função garante que o LLVM compreenda o ambiente alvo antes de iniciar a leitura das instruções da função `main`.

---

## Etapas de Geração

Após gerar as instruções TAC, o LLVMIRGenerator traduz essas instruções para LLVM IR.

### Exemplo de Tradução TAC → LLVM:

```python
if op == '+':
    llvm.append(f"%{res} = add i32 %{arg1}, %{arg2}")
elif op == 'ASSIGN':
    llvm.append(f"%{res} = add i32 0, %{arg1}")
```

* **Operação aritmética**: `t1 = a + b` vira `%t1 = add i32 %a, %b`
* **Atribuição simples**: `t2 = a` vira `%t2 = add i32 0, %a`

---

## Impressão de Strings

Strings são armazenadas como variáveis globais constantes:

```llvm
@.str_1 = private unnamed_addr constant [13 x i8] c"Resultado: %d\0A\00"
```

E são usadas com chamadas à função `printf` no corpo da função `main`.

---

## Estrutura da Função `main`

```llvm
define i32 @main() {
entry:
    ; instruções LLVM IR aqui
    ret i32 0
}
```

Todas as instruções TAC são convertidas para LLVM e inseridas dentro da função `main`.

---

## Como compilar com `clang`

Após gerar o arquivo `output.ll`, o código pode ser transformado em um executável:

```bash
clang output.ll -o output
```

---

## Considerações

* O `target triple` é fixo (não detectado automaticamente).
* O código gerado é compatível com sistemas Linux de 64 bits.
* As instruções são otimizadas para facilitar a leitura e posterior compilação.

---

## Conclusão

O gerador LLVM IR traduz o TAC para um formato compreendido por compiladores modernos como o `clang`. Isso permite compilar programas da linguagem Lens diretamente em código de máquina, integrando perfeitamente o pipeline do compilador.


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
