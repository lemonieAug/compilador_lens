// Código Intermediário TAC - Linguagem Lens
// Gerado automaticamente pelo compilador

idade = 25
altura = 175
nome = "João Silva"
contador = 0
peso = 70
sobrenome = "Santos"
t1 = idade + 5
idade = t1
t2 = altura - 5
altura = t2
t3 = contador * 2
contador = t3
t4 = peso / 2
peso = t4
print "=== DEMONSTRAÇÃO LENS ==="
print nome
print idade
print "Nome completo:"
print nome
print sobrenome
print "Idade atual:"
print idade
print "Altura:"
print altura
print "Peso:"
print peso
a = 10
b = 3
t5 = a + b
soma = t5
t6 = a - b
subtracao = t6
t7 = a * b
multiplicacao = t7
t8 = a / b
divisao = t8
print "Operações com"
print a
print "e"
print b
print "Soma:"
print soma
print "Subtração:"
print subtracao
print "Multiplicação:"
print multiplicacao
print "Divisão:"
print divisao
t9 = b * 2
t10 = a + t9
t11 = t10 - 1
resultado = t11
t12 = a + b
t13 = t12 * 2
complexo = t13
print "Resultado complexo:"
print resultado
print "Com parênteses:"
print complexo
t14 = a == b
igual = t14
t15 = a != b
diferente = t15
t16 = a < b
menor = t16
t17 = a > b
maior = t17
t18 = a <= b
menorIgual = t18
t19 = a >= b
maiorIgual = t19
print "=== COMPARAÇÕES ==="
print "10 == 3:"
print igual
print "10 != 3:"
print diferente
print "10 < 3:"
print menor
print "10 > 3:"
print maior
print "10 <= 3:"
print menorIgual
print "10 >= 3:"
print maiorIgual
condicao1 = 1
condicao2 = 0
t20 = condicao1 && condicao2
e_logico = t20
t21 = condicao1 || condicao2
ou_logico = t21
print "=== OPERAÇÕES LÓGICAS ==="
print "1 && 0:"
print e_logico
print "1 || 0:"
print ou_logico
t22 = a > b
t23 = soma > 10
t24 = t22 && t23
complexa = t24
print "Expressão complexa:"
print complexa
print "Digite um número:"
read entrada_usuario
print "Você digitou:"
print entrada_usuario
print "=== ESTRUTURAS CONDICIONAIS ==="
t25 = idade >= 18
if_false t25 goto L2
print "Maior de idade"
goto L1
L2:
L1:
t26 = idade < 13
if_false t26 goto L4
print "Criança"
goto L3
L4:
t27 = idade < 18
if_false t27 goto L5
print "Adolescente"
goto L3
L5:
t28 = idade < 60
if_false t28 goto L6
print "Adulto"
goto L3
L6:
print "Idoso"
L3:
print "=== LAÇOS FOR ==="
print "Contagem de 1 a 5:"
i = 1
L7:
t29 = i <= 5
if_false t29 goto L8
print "Número:"
print i
t30 = i + 1
i = t30
goto L7
L8:
print "Contagem regressiva:"
j = 10
L9:
t31 = j >= 7
if_false t31 goto L10
print "Contagem:"
print j
t32 = j - 1
j = t32
goto L9
L10:
inicio = 0
fim = 3
print "Range dinâmico:"
k = inicio
L11:
t33 = k <= fim
if_false t33 goto L12
print "Valor de k:"
print k
t34 = k * k
quadrado = t34
print "Quadrado:"
print quadrado
t35 = k + 1
k = t35
goto L11
L12:
print "=== LAÇOS WHILE ==="
cont = 0
print "Contagem while até 3:"
L13:
t36 = cont < 3
if_false t36 goto L14
print "Contador:"
print cont
t37 = cont + 1
cont = t37
goto L13
L14:
x = 10
y = 1
print "While com condição complexa:"
L15:
t38 = x > y
t39 = y < 5
t40 = t38 && t39
if_false t40 goto L16
print "x ="
print x
print "y ="
print y
t41 = x - 2
x = t41
t42 = y + 1
y = t42
goto L15
L16:
print "=== CASOS AVANÇADOS ==="
num1 = 15
num2 = 4
operacao = 1
t43 = operacao == 1
if_false t43 goto L18
t44 = num1 + num2
result = t44
print "Soma:"
print num1
print "+"
print num2
print "="
print result
goto L17
L18:
t45 = operacao == 2
if_false t45 goto L19
t46 = num1 - num2
result = t46
print "Subtração:"
print num1
print "-"
print num2
print "="
print result
goto L17
L19:
t47 = operacao == 3
if_false t47 goto L20
t48 = num1 * num2
result = t48
print "Multiplicação:"
print num1
print "*"
print num2
print "="
print result
goto L17
L20:
t49 = operacao == 4
if_false t49 goto L21
t50 = num2 != 0
if_false t50 goto L23
t51 = num1 / num2
result = t51
print "Divisão:"
print num1
print "/"
print num2
print "="
print result
goto L22
L23:
print "Erro: Divisão por zero!"
L22:
goto L17
L21:
L17:
n = 5
fatorial = 1
print "Calculando fatorial de"
print n
f = 1
L24:
t52 = f <= n
if_false t52 goto L25
t53 = fatorial * f
fatorial = t53
print "Passo"
print f
print ":"
print fatorial
t54 = f + 1
f = t54
goto L24
L25:
print "Fatorial final:"
print fatorial
fib1 = 0
fib2 = 1
fib_count = 0
print "Sequência de Fibonacci:"
print "F(0) ="
print fib1
print "F(1) ="
print fib2
L26:
t55 = fib_count < 8
if_false t55 goto L27
t56 = fib1 + fib2
proximo = t56
t57 = fib_count + 1
fib_count = t57
print "F("
t58 = fib_count + 1
print t58
print ") ="
print proximo
fib1 = fib2
fib2 = proximo
goto L26
L27:
nota = 8
frequencia = 85
print "=== VALIDAÇÃO DE APROVAÇÃO ==="
print "Nota:"
print nota
print "Frequência:"
print frequencia
t59 = nota >= 7
t60 = frequencia >= 75
t61 = t59 && t60
if_false t61 goto L29
print "APROVADO!"
goto L28
L29:
t62 = nota >= 5
t63 = frequencia >= 75
t64 = t62 && t63
if_false t64 goto L30
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
