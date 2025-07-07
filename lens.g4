grammar lens;

// =====================================================
// TOKENS LÉXICOS
// =====================================================

// Palavras-chave (ordem importa para precedência!)
START       : '@start';
END         : '@end';
LET         : 'let';
PRINT       : 'print';
INPUT       : 'input';
IF          : 'if';
ELSEIF      : 'elseif';
ELSE        : 'else';
FOR         : 'for';
WHILE       : 'while';
IN          : 'in';

// Tipos primitivos básicos
INT_TYPE    : 'int';
STRING_TYPE : 'String';

// Símbolos e operadores
DUPONT      : '::';         // print :: "mensagem"
POINT2      : ':';          // let x: int
DOT2        : '..';         // for i in 0..10
VIRG        : ',';          // separador
EQUALS      : '=';          // atribuição
P_N         : '(';          // parêntese abertura
P_I         : ')';          // parêntese fechamento  
C_N         : '{';          // chave abertura
C_I         : '}';          // chave fechamento

// Operadores aritméticos (precedência: * / > + -)
MUL         : '*';
DIV         : '/';
ADD         : '+';
SUB         : '-';

// Operadores de comparação
EQ          : '==';
NEQ         : '!=';
LT          : '<';
GT          : '>';
LTE         : '<=';
GTE         : '>=';

// Operadores lógicos
AND         : '&&';
OR          : '||';

// Literais e identificadores (sempre por último!)
STRING      : '"' (~["\\] | '\\' .)* '"';   // strings com escape
INT         : '-'?[0-9]+;                   // números inteiros
VAR         : [a-zA-Z_][a-zA-Z_0-9]*;       // identificadores

// Ignorados
COMENTARIO  : '//' ~[\r\n]* -> skip;        // comentários de linha
WS          : [ \t\r\n]+ -> skip;           // espaços em branco

// =====================================================
// REGRAS SINTÁTICAS
// =====================================================

// Programa principal: @start comandos @end
lens
    : START comando* END 
    ;

// Comandos válidos na linguagem
comando
    : declaracao          // let x: int = 5
    | atribuicao         // x = 10 ou x += 5
    | impressao          // print :: "hello"
    | entrada            // input(x)
    | condicional        // if/elseif/else
    | lacofor           // for i in 0..10
    | lacowhile         // while (condicao)
    ;

// =====================================================
// ENTRADA E SAÍDA
// =====================================================

// Impressão: print :: valor1, valor2, ...
impressao
    : PRINT DUPONT expressao (VIRG expressao)*
    ;

// Entrada: input(variavel)    
entrada
    : INPUT P_N VAR P_I
    ;

// =====================================================
// ESTRUTURAS DE CONTROLE
// =====================================================

// Estrutura condicional completa
condicional
    : if_stmt elseif_stmt* else_stmt?
    ;
    
// if (condicao) { comandos }
if_stmt
    : IF P_N condicao P_I C_N comando* C_I
    ;
    
// elseif (condicao) { comandos }
elseif_stmt
    : ELSEIF P_N condicao P_I C_N comando* C_I
    ;
    
// else { comandos }
else_stmt
    : ELSE C_N comando* C_I
    ;

// for variavel in inicio..fim { comandos }
lacofor
    : FOR VAR IN expressao_arit DOT2 expressao_arit C_N comando* C_I
    ;

// while (condicao) { comandos }
lacowhile
    : WHILE P_N condicao P_I C_N comando* C_I
    ;

// =====================================================
// EXPRESSÕES (Hierarquia de Precedência)
// =====================================================

// Expressão principal (mais baixa precedência)
expressao
    : expressao_logica
    ;

// Operações lógicas: && ||
expressao_logica
    : expressao_comparacao (op_logico expressao_comparacao)*
    ;

// Operações de comparação: == != < > <= >=
expressao_comparacao  
    : expressao_arit (op_comparacao expressao_arit)?
    ;

// Operações aritméticas: + - (menor precedência)
expressao_arit
    : termo_arit (op_adicao termo_arit)*
    ;

// Operações aritméticas: * / (maior precedência)  
termo_arit
    : fator (op_multiplicacao fator)*
    ;

// Elementos básicos e agrupamento
fator
    : literal               // 42, "hello", True
    | VAR                  // variavel
    | P_N expressao P_I    // (expressao)
    ;

// Valores literais
literal
    : INT 
    | STRING
    ;

// Condições (devem retornar boolean)
condicao
    : expressao_logica
    ;

// =====================================================
// OPERADORES
// =====================================================

op_adicao
    : ADD | SUB           // + -
    ;

op_multiplicacao  
    : MUL | DIV           // * /
    ;

op_logico
    : AND | OR            // && ||
    ;
    
op_comparacao
    : EQ | NEQ | LT | GT | LTE | GTE    // == != < > <= >=
    ;

// =====================================================
// DECLARAÇÕES E ATRIBUIÇÕES
// =====================================================

// Declaração: let nome: tipo = valor?
declaracao
    : LET VAR POINT2 tipo (EQUALS expressao)?
    ;
    
// Tipos disponíveis
tipo
    : INT_TYPE | STRING_TYPE
    ;

// Atribuição simples ou composta
atribuicao
    : VAR EQUALS expressao                    // x = 5
    | VAR op_adicao EQUALS expressao         // x += 5  
    | VAR op_multiplicacao EQUALS expressao  // x *= 5
    ;