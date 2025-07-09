// Código Intermediário TAC - Linguagem Lens
// Gerado automaticamente pelo compilador

idade = 25
altura = 175
nome = "João Silva"
contador = 0
peso = 70
sobrenome = "Santos"
_t1 = idade + 5
idade = _t1
_t2 = altura - 5
altura = _t2
_t3 = contador * 2
contador = _t3
_t4 = peso / 2
peso = _t4
print "=== DEMONSTRAÇÃO LENS ==="
print nome
print idade
print_multi "Nome completo:", nome, sobrenome
print_multi "Idade atual:", idade
print_multi "Altura:", altura
print_multi "Peso:", peso
a = 10
b = 3
_t5 = a + b
soma = _t5
_t6 = a - b
subtracao = _t6
_t7 = a * b
multiplicacao = _t7
_t8 = a / b
divisao = _t8
print_multi "Operações com", a, "e", b
print_multi "Soma:", soma
print_multi "Subtração:", subtracao
print_multi "Multiplicação:", multiplicacao
print_multi "Divisão:", divisao
_t9 = b * 2
_t10 = a + _t9
_t11 = _t10 - 1
resultado = _t11
_t12 = a + b
_t13 = _t12 * 2
complexo = _t13
print_multi "Resultado complexo:", resultado
print_multi "Com parênteses:", complexo
_t14 = a == b
igual = _t14
_t15 = a != b
diferente = _t15
_t16 = a < b
menor = _t16
_t17 = a > b
maior = _t17
_t18 = a <= b
menorIgual = _t18
_t19 = a >= b
maiorIgual = _t19
print "=== COMPARAÇÕES ==="
print_multi "10 == 3:", igual
print_multi "10 != 3:", diferente
print_multi "10 < 3:", menor
print_multi "10 > 3:", maior
print_multi "10 <= 3:", menorIgual
print_multi "10 >= 3:", maiorIgual
condicao1 = 1
condicao2 = 0
_t20 = condicao1 && condicao2
e_logico = _t20
_t21 = condicao1 || condicao2
ou_logico = _t21
print "=== OPERAÇÕES LÓGICAS ==="
print_multi "1 && 0:", e_logico
print_multi "1 || 0:", ou_logico
_t22 = a > b
_t23 = soma > 10
_t24 = _t22 && _t23
complexa = _t24
print_multi "Expressão complexa:", complexa
print "Digite um número:"
read entrada_usuario
print_multi "Você digitou:", entrada_usuario
print "=== ESTRUTURAS CONDICIONAIS ==="
_t25 = idade >= 18
if_false _t25 goto L2
print "Maior de idade"
goto L1
L2:
L1:
_t26 = idade < 13
if_false _t26 goto L4
print "Criança"
goto L3
L4:
_t27 = idade < 18
if_false _t27 goto L5
print "Adolescente"
goto L3
L5:
_t28 = idade < 60
if_false _t28 goto L6
print "Adulto"
goto L3
L6:
print "Idoso"
L3:
print "=== LAÇOS FOR ==="
print "Contagem de 1 a 5:"
i = 1
L7:
_t29 = i <= 5
if_false _t29 goto L8
print_multi "Número:", i
_t30 = i + 1
i = _t30
goto L7
L8:
print "Contagem regressiva:"
j = 10
L9:
_t31 = j >= 7
if_false _t31 goto L10
print_multi "Contagem:", j
_t32 = j - 1
j = _t32
goto L9
L10:
inicio = 0
fim = 3
print "Range dinâmico:"
k = inicio
L11:
_t33 = k <= fim
if_false _t33 goto L12
print_multi "Valor de k:", k
_t34 = k * k
quadrado = _t34
print_multi "Quadrado:", quadrado
_t35 = k + 1
k = _t35
goto L11
L12:
print "=== LAÇOS WHILE ==="
cont = 0
print "Contagem while até 3:"
L13:
_t36 = cont < 3
if_false _t36 goto L14
print_multi "Contador:", cont
_t37 = cont + 1
cont = _t37
goto L13
L14:
x = 10
y = 1
print "While com condição complexa:"
L15:
_t38 = x > y
_t39 = y < 5
_t40 = _t38 && _t39
if_false _t40 goto L16
print_multi "x =", x, "y =", y
_t41 = x - 2
x = _t41
_t42 = y + 1
y = _t42
goto L15
L16:
print "=== CASOS AVANÇADOS ==="
num1 = 15
num2 = 4
operacao = 1
_t43 = operacao == 1
if_false _t43 goto L18
_t44 = num1 + num2
result = _t44
print_multi "Soma:", num1, "+", num2, "=", result
goto L17
L18:
_t45 = operacao == 2
if_false _t45 goto L19
_t46 = num1 - num2
result = _t46
print_multi "Subtração:", num1, "-", num2, "=", result
goto L17
L19:
_t47 = operacao == 3
if_false _t47 goto L20
_t48 = num1 * num2
result = _t48
print_multi "Multiplicação:", num1, "*", num2, "=", result
goto L17
L20:
_t49 = operacao == 4
if_false _t49 goto L21
_t50 = num2 != 0
if_false _t50 goto L23
_t51 = num1 / num2
result = _t51
print_multi "Divisão:", num1, "/", num2, "=", result
goto L22
L23:
print "Erro: Divisão por zero!"
L22:
goto L17
L21:
L17:
n = 5
fatorial = 1
print_multi "Calculando fatorial de", n
f = 1
L24:
_t52 = f <= n
if_false _t52 goto L25
_t53 = fatorial * f
fatorial = _t53
print_multi "Passo", f, ":", fatorial
_t54 = f + 1
f = _t54
goto L24
L25:
print_multi "Fatorial final:", fatorial
fib1 = 0
fib2 = 1
fib_count = 0
print "Sequência de Fibonacci:"
print_multi "F(0) =", fib1
print_multi "F(1) =", fib2
L26:
_t55 = fib_count < 8
if_false _t55 goto L27
_t56 = fib1 + fib2
proximo = _t56
_t57 = fib_count + 1
fib_count = _t57
_t58 = fib_count + 1
print_multi "F(", _t58, ") =", proximo
fib1 = fib2
fib2 = proximo
goto L26
L27:
nota = 8
frequencia = 85
print "=== VALIDAÇÃO DE APROVAÇÃO ==="
print_multi "Nota:", nota
print_multi "Frequência:", frequencia
_t59 = nota >= 7
_t60 = frequencia >= 75
_t61 = _t59 && _t60
if_false _t61 goto L29
print "APROVADO!"
goto L28
L29:
_t62 = nota >= 5
_t63 = frequencia >= 75
_t64 = _t62 && _t63
if_false _t64 goto L30
print "RECUPERAÇÃO"
goto L28
L30:
print "REPROVADO!"
L28:
print "=========================="
print "Demonstração finalizada!"
print "Todas as funcionalidades foram testadas:"
print "Tipos: int, String"
print "Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||"
print "Estruturas: if/elseif/else, for, while"
print "E/S: print, input"
print "Expressões complexas e precedência"
print "=========================="
