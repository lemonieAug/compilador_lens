; Código LLVM IR gerado para a linguagem Lens
; Gerado automaticamente pelo compilador

target datalayout = "e-m:w-p270:32:32-p271:32:32-p272:64:64-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-pc-windows-gnu"

; Declarações de funções externas
declare i32 @printf(i8*, ...)
declare i32 @scanf(i8*, ...)
declare i32 @puts(i8*)
declare i8* @malloc(i64)
declare void @free(i8*)

; Strings globais
@str_1 = private unnamed_addr constant [28 x i8] c"=== DEMONSTRAÇÃO LENS ===\00", align 1
@str_2 = private unnamed_addr constant [15 x i8] c"Nome completo:\00", align 1
@str_3 = private unnamed_addr constant [13 x i8] c"Idade atual:\00", align 1
@str_4 = private unnamed_addr constant [8 x i8] c"Altura:\00", align 1
@str_5 = private unnamed_addr constant [6 x i8] c"Peso:\00", align 1
@str_6 = private unnamed_addr constant [16 x i8] c"Operações com\00", align 1
@str_7 = private unnamed_addr constant [2 x i8] c"e\00", align 1
@str_8 = private unnamed_addr constant [6 x i8] c"Soma:\00", align 1
@str_9 = private unnamed_addr constant [13 x i8] c"Subtração:\00", align 1
@str_10 = private unnamed_addr constant [17 x i8] c"Multiplicação:\00", align 1
@str_11 = private unnamed_addr constant [10 x i8] c"Divisão:\00", align 1
@str_12 = private unnamed_addr constant [20 x i8] c"Resultado complexo:\00", align 1
@str_13 = private unnamed_addr constant [17 x i8] c"Com parênteses:\00", align 1
@str_14 = private unnamed_addr constant [22 x i8] c"=== COMPARAÇÕES ===\00", align 1
@str_15 = private unnamed_addr constant [9 x i8] c"10 == 3:\00", align 1
@str_16 = private unnamed_addr constant [9 x i8] c"10 != 3:\00", align 1
@str_17 = private unnamed_addr constant [8 x i8] c"10 < 3:\00", align 1
@str_18 = private unnamed_addr constant [8 x i8] c"10 > 3:\00", align 1
@str_19 = private unnamed_addr constant [9 x i8] c"10 <= 3:\00", align 1
@str_20 = private unnamed_addr constant [9 x i8] c"10 >= 3:\00", align 1
@str_21 = private unnamed_addr constant [29 x i8] c"=== OPERAÇÕES LÓGICAS ===\00", align 1
@str_22 = private unnamed_addr constant [8 x i8] c"1 && 0:\00", align 1
@str_23 = private unnamed_addr constant [8 x i8] c"1 || 0:\00", align 1
@str_24 = private unnamed_addr constant [21 x i8] c"Expressão complexa:\00", align 1
@str_25 = private unnamed_addr constant [19 x i8] c"Digite um número:\00", align 1
@str_26 = private unnamed_addr constant [15 x i8] c"Você digitou:\00", align 1
@str_27 = private unnamed_addr constant [32 x i8] c"=== ESTRUTURAS CONDICIONAIS ===\00", align 1
@str_28 = private unnamed_addr constant [15 x i8] c"Maior de idade\00", align 1
@str_29 = private unnamed_addr constant [9 x i8] c"Criança\00", align 1
@str_30 = private unnamed_addr constant [12 x i8] c"Adolescente\00", align 1
@str_31 = private unnamed_addr constant [7 x i8] c"Adulto\00", align 1
@str_32 = private unnamed_addr constant [6 x i8] c"Idoso\00", align 1
@str_33 = private unnamed_addr constant [19 x i8] c"=== LAÇOS FOR ===\00", align 1
@str_34 = private unnamed_addr constant [19 x i8] c"Contagem de 1 a 5:\00", align 1
@str_35 = private unnamed_addr constant [9 x i8] c"Número:\00", align 1
@str_36 = private unnamed_addr constant [21 x i8] c"Contagem regressiva:\00", align 1
@str_37 = private unnamed_addr constant [10 x i8] c"Contagem:\00", align 1
@str_38 = private unnamed_addr constant [17 x i8] c"Range dinâmico:\00", align 1
@str_39 = private unnamed_addr constant [12 x i8] c"Valor de k:\00", align 1
@str_40 = private unnamed_addr constant [10 x i8] c"Quadrado:\00", align 1
@str_41 = private unnamed_addr constant [21 x i8] c"=== LAÇOS WHILE ===\00", align 1
@str_42 = private unnamed_addr constant [23 x i8] c"Contagem while até 3:\00", align 1
@str_43 = private unnamed_addr constant [10 x i8] c"Contador:\00", align 1
@str_44 = private unnamed_addr constant [31 x i8] c"While com condição complexa:\00", align 1
@str_45 = private unnamed_addr constant [4 x i8] c"x =\00", align 1
@str_46 = private unnamed_addr constant [4 x i8] c"y =\00", align 1
@str_47 = private unnamed_addr constant [25 x i8] c"=== CASOS AVANÇADOS ===\00", align 1
@str_48 = private unnamed_addr constant [2 x i8] c"+\00", align 1
@str_49 = private unnamed_addr constant [2 x i8] c"=\00", align 1
@str_50 = private unnamed_addr constant [2 x i8] c"-\00", align 1
@str_51 = private unnamed_addr constant [2 x i8] c"*\00", align 1
@str_52 = private unnamed_addr constant [2 x i8] c"/\00", align 1
@str_53 = private unnamed_addr constant [25 x i8] c"Erro: Divisão por zero!\00", align 1
@str_54 = private unnamed_addr constant [23 x i8] c"Calculando fatorial de\00", align 1
@str_55 = private unnamed_addr constant [6 x i8] c"Passo\00", align 1
@str_56 = private unnamed_addr constant [2 x i8] c":\00", align 1
@str_57 = private unnamed_addr constant [16 x i8] c"Fatorial final:\00", align 1
@str_58 = private unnamed_addr constant [25 x i8] c"Sequência de Fibonacci:\00", align 1
@str_59 = private unnamed_addr constant [7 x i8] c"F(0) =\00", align 1
@str_60 = private unnamed_addr constant [7 x i8] c"F(1) =\00", align 1
@str_61 = private unnamed_addr constant [3 x i8] c"F(\00", align 1
@str_62 = private unnamed_addr constant [4 x i8] c") =\00", align 1
@str_63 = private unnamed_addr constant [35 x i8] c"=== VALIDAÇÃO DE APROVAÇÃO ===\00", align 1
@str_64 = private unnamed_addr constant [6 x i8] c"Nota:\00", align 1
@str_65 = private unnamed_addr constant [13 x i8] c"Frequência:\00", align 1
@str_66 = private unnamed_addr constant [10 x i8] c"APROVADO!\00", align 1
@str_67 = private unnamed_addr constant [14 x i8] c"RECUPERAÇÃO\00", align 1
@str_68 = private unnamed_addr constant [11 x i8] c"REPROVADO!\00", align 1
@str_69 = private unnamed_addr constant [27 x i8] c"==========================\00", align 1
@str_70 = private unnamed_addr constant [27 x i8] c"Demonstração finalizada!\00", align 1
@str_71 = private unnamed_addr constant [41 x i8] c"Todas as funcionalidades foram testadas:\00", align 1
@str_72 = private unnamed_addr constant [19 x i8] c"Tipos: int, String\00", align 1
@str_73 = private unnamed_addr constant [53 x i8] c"Operadores: +, -, *, /, ==, !=, <, >, <=, >=, &&, ||\00", align 1
@str_74 = private unnamed_addr constant [39 x i8] c"Estruturas: if/elseif/else, for, while\00", align 1
@str_75 = private unnamed_addr constant [18 x i8] c"E/S: print, input\00", align 1
@str_76 = private unnamed_addr constant [37 x i8] c"Expressões complexas e precedência\00", align 1
@int_format = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@int_format_newline = private unnamed_addr constant [4 x i8] c"%d\0A\00", align 1
@string_format = private unnamed_addr constant [3 x i8] c"%s\00", align 1
@string_format_newline = private unnamed_addr constant [4 x i8] c"%s\0A\00", align 1
@scanf_int = private unnamed_addr constant [3 x i8] c"%d\00", align 1
@newline = private unnamed_addr constant [2 x i8] c"\0A\00", align 1
@str_77 = private unnamed_addr constant [12 x i8] c"João Silva\00", align 1
@str_78 = private unnamed_addr constant [7 x i8] c"Santos\00", align 1

; Função principal
define i32 @main() {
entry:
  %idade = alloca i32
  %altura = alloca i32
  %nome = alloca i8*
  %contador = alloca i32
  %peso = alloca i32
  %sobrenome = alloca i8*
  %t1 = alloca i32
  %t2 = alloca i32
  %t3 = alloca i32
  %t4 = alloca i32
  %a = alloca i32
  %b = alloca i32
  %t5 = alloca i32
  %soma = alloca i32
  %t6 = alloca i32
  %subtracao = alloca i32
  %t7 = alloca i32
  %multiplicacao = alloca i32
  %t8 = alloca i32
  %divisao = alloca i32
  %t9 = alloca i32
  %t10 = alloca i32
  %t11 = alloca i32
  %resultado = alloca i32
  %t12 = alloca i32
  %t13 = alloca i32
  %complexo = alloca i32
  %t14 = alloca i32
  %igual = alloca i32
  %t15 = alloca i32
  %diferente = alloca i32
  %t16 = alloca i32
  %menor = alloca i32
  %t17 = alloca i32
  %maior = alloca i32
  %t18 = alloca i32
  %menorIgual = alloca i32
  %t19 = alloca i32
  %maiorIgual = alloca i32
  %condicao1 = alloca i32
  %condicao2 = alloca i32
  %t20 = alloca i32
  %e_logico = alloca i32
  %t21 = alloca i32
  %ou_logico = alloca i32
  %t22 = alloca i32
  %t23 = alloca i32
  %t24 = alloca i32
  %complexa = alloca i32
  %entrada_usuario = alloca i32
  %t25 = alloca i32
  %t26 = alloca i32
  %t27 = alloca i32
  %t28 = alloca i32
  %i = alloca i32
  %t29 = alloca i32
  %t30 = alloca i32
  %j = alloca i32
  %t31 = alloca i32
  %t32 = alloca i32
  %inicio = alloca i32
  %fim = alloca i32
  %k = alloca i32
  %t33 = alloca i32
  %t34 = alloca i32
  %quadrado = alloca i32
  %t35 = alloca i32
  %cont = alloca i32
  %t36 = alloca i32
  %t37 = alloca i32
  %x = alloca i32
  %y = alloca i32
  %t38 = alloca i32
  %t39 = alloca i32
  %t40 = alloca i32
  %t41 = alloca i32
  %t42 = alloca i32
  %num1 = alloca i32
  %num2 = alloca i32
  %operacao = alloca i32
  %t43 = alloca i32
  %t44 = alloca i32
  %result = alloca i32
  %t45 = alloca i32
  %t46 = alloca i32
  %t47 = alloca i32
  %t48 = alloca i32
  %t49 = alloca i32
  %t50 = alloca i32
  %t51 = alloca i32
  %n = alloca i32
  %fatorial = alloca i32
  %f = alloca i32
  %t52 = alloca i32
  %t53 = alloca i32
  %t54 = alloca i32
  %fib1 = alloca i32
  %fib2 = alloca i32
  %fib_count = alloca i32
  %t55 = alloca i32
  %t56 = alloca i32
  %proximo = alloca i32
  %t57 = alloca i32
  %t58 = alloca i32
  %nota = alloca i32
  %frequencia = alloca i32
  %t59 = alloca i32
  %t60 = alloca i32
  %t61 = alloca i32
  %t62 = alloca i32
  %t63 = alloca i32
  %t64 = alloca i32
  store i32 25, i32* %idade
  store i32 175, i32* %altura
  store i8* getelementptr inbounds ([15 x i8], [15 x i8]* @str_77, i64 0, i64 0), i8** %nome
  store i32 0, i32* %contador
  store i32 70, i32* %peso
  store i8* getelementptr inbounds ([11 x i8], [11 x i8]* @str_78, i64 0, i64 0), i8** %sobrenome
  %temp_425 = load i32, i32* %idade
  %temp_426 = load i32, i32* %idade
  %temp_427 = add i32 %temp_426, 5
  store i32 %temp_427, i32* %t1
  %temp_428 = load i32, i32* %t1
  store i32 %temp_428, i32* %idade
  %temp_429 = load i32, i32* %altura
  %temp_430 = load i32, i32* %altura
  %temp_431 = sub i32 %temp_430, 5
  store i32 %temp_431, i32* %t2
  %temp_432 = load i32, i32* %t2
  store i32 %temp_432, i32* %altura
  %temp_433 = load i32, i32* %contador
  %temp_434 = load i32, i32* %contador
  %temp_435 = mul i32 %temp_434, 2
  store i32 %temp_435, i32* %t3
  %temp_436 = load i32, i32* %t3
  store i32 %temp_436, i32* %contador
  %temp_437 = load i32, i32* %peso
  %temp_438 = load i32, i32* %peso
  %temp_439 = sdiv i32 %temp_438, 2
  store i32 %temp_439, i32* %t4
  %temp_440 = load i32, i32* %t4
  store i32 %temp_440, i32* %peso
  call i32 @puts(i8* getelementptr inbounds ([30 x i8], [30 x i8]* @str_1, i64 0, i64 0))
  %temp_441 = load i8*, i8** %nome
  call i32 @puts(i8* %temp_441)
  %temp_442 = load i32, i32* %idade
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_442)
  call i32 @puts(i8* getelementptr inbounds ([19 x i8], [19 x i8]* @str_2, i64 0, i64 0))
  %temp_443 = load i8*, i8** %nome
  call i32 @puts(i8* %temp_443)
  %temp_444 = load i8*, i8** %sobrenome
  call i32 @puts(i8* %temp_444)
  call i32 @puts(i8* getelementptr inbounds ([17 x i8], [17 x i8]* @str_3, i64 0, i64 0))
  %temp_445 = load i32, i32* %idade
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_445)
  call i32 @puts(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @str_4, i64 0, i64 0))
  %temp_446 = load i32, i32* %altura
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_446)
  call i32 @puts(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @str_5, i64 0, i64 0))
  %temp_447 = load i32, i32* %peso
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_447)
  store i32 10, i32* %a
  store i32 3, i32* %b
  %temp_448 = load i32, i32* %a
  %temp_449 = load i32, i32* %b
  %temp_450 = load i32, i32* %a
  %temp_451 = load i32, i32* %b
  %temp_452 = add i32 %temp_450, %temp_451
  store i32 %temp_452, i32* %t5
  %temp_453 = load i32, i32* %t5
  store i32 %temp_453, i32* %soma
  %temp_454 = load i32, i32* %a
  %temp_455 = load i32, i32* %b
  %temp_456 = load i32, i32* %a
  %temp_457 = load i32, i32* %b
  %temp_458 = sub i32 %temp_456, %temp_457
  store i32 %temp_458, i32* %t6
  %temp_459 = load i32, i32* %t6
  store i32 %temp_459, i32* %subtracao
  %temp_460 = load i32, i32* %a
  %temp_461 = load i32, i32* %b
  %temp_462 = load i32, i32* %a
  %temp_463 = load i32, i32* %b
  %temp_464 = mul i32 %temp_462, %temp_463
  store i32 %temp_464, i32* %t7
  %temp_465 = load i32, i32* %t7
  store i32 %temp_465, i32* %multiplicacao
  %temp_466 = load i32, i32* %a
  %temp_467 = load i32, i32* %b
  %temp_468 = load i32, i32* %a
  %temp_469 = load i32, i32* %b
  %temp_470 = sdiv i32 %temp_468, %temp_469
  store i32 %temp_470, i32* %t8
  %temp_471 = load i32, i32* %t8
  store i32 %temp_471, i32* %divisao
  call i32 @puts(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @str_6, i64 0, i64 0))
  %temp_472 = load i32, i32* %a
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_472)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_7, i64 0, i64 0))
  %temp_473 = load i32, i32* %b
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_473)
  call i32 @puts(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @str_8, i64 0, i64 0))
  %temp_474 = load i32, i32* %soma
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_474)
  call i32 @puts(i8* getelementptr inbounds ([15 x i8], [15 x i8]* @str_9, i64 0, i64 0))
  %temp_475 = load i32, i32* %subtracao
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_475)
  call i32 @puts(i8* getelementptr inbounds ([19 x i8], [19 x i8]* @str_10, i64 0, i64 0))
  %temp_476 = load i32, i32* %multiplicacao
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_476)
  call i32 @puts(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str_11, i64 0, i64 0))
  %temp_477 = load i32, i32* %divisao
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_477)
  %temp_478 = load i32, i32* %b
  %temp_479 = load i32, i32* %b
  %temp_480 = mul i32 %temp_479, 2
  store i32 %temp_480, i32* %t9
  %temp_481 = load i32, i32* %a
  %temp_482 = load i32, i32* %t9
  %temp_483 = load i32, i32* %a
  %temp_484 = load i32, i32* %t9
  %temp_485 = add i32 %temp_483, %temp_484
  store i32 %temp_485, i32* %t10
  %temp_486 = load i32, i32* %t10
  %temp_487 = load i32, i32* %t10
  %temp_488 = sub i32 %temp_487, 1
  store i32 %temp_488, i32* %t11
  %temp_489 = load i32, i32* %t11
  store i32 %temp_489, i32* %resultado
  %temp_490 = load i32, i32* %a
  %temp_491 = load i32, i32* %b
  %temp_492 = load i32, i32* %a
  %temp_493 = load i32, i32* %b
  %temp_494 = add i32 %temp_492, %temp_493
  store i32 %temp_494, i32* %t12
  %temp_495 = load i32, i32* %t12
  %temp_496 = load i32, i32* %t12
  %temp_497 = mul i32 %temp_496, 2
  store i32 %temp_497, i32* %t13
  %temp_498 = load i32, i32* %t13
  store i32 %temp_498, i32* %complexo
  call i32 @puts(i8* getelementptr inbounds ([24 x i8], [24 x i8]* @str_12, i64 0, i64 0))
  %temp_499 = load i32, i32* %resultado
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_499)
  call i32 @puts(i8* getelementptr inbounds ([20 x i8], [20 x i8]* @str_13, i64 0, i64 0))
  %temp_500 = load i32, i32* %complexo
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_500)
  %temp_501 = load i32, i32* %a
  %temp_502 = load i32, i32* %b
  %temp_503 = load i32, i32* %a
  %temp_504 = load i32, i32* %b
  %temp_505 = icmp eq i32 %temp_503, %temp_504
  %temp_506 = zext i1 %temp_505 to i32
  store i32 %temp_506, i32* %t14
  %temp_507 = load i32, i32* %t14
  store i32 %temp_507, i32* %igual
  %temp_508 = load i32, i32* %a
  %temp_509 = load i32, i32* %b
  %temp_510 = load i32, i32* %a
  %temp_511 = load i32, i32* %b
  %temp_512 = icmp ne i32 %temp_510, %temp_511
  %temp_513 = zext i1 %temp_512 to i32
  store i32 %temp_513, i32* %t15
  %temp_514 = load i32, i32* %t15
  store i32 %temp_514, i32* %diferente
  %temp_515 = load i32, i32* %a
  %temp_516 = load i32, i32* %b
  %temp_517 = load i32, i32* %a
  %temp_518 = load i32, i32* %b
  %temp_519 = icmp slt i32 %temp_517, %temp_518
  %temp_520 = zext i1 %temp_519 to i32
  store i32 %temp_520, i32* %t16
  %temp_521 = load i32, i32* %t16
  store i32 %temp_521, i32* %menor
  %temp_522 = load i32, i32* %a
  %temp_523 = load i32, i32* %b
  %temp_524 = load i32, i32* %a
  %temp_525 = load i32, i32* %b
  %temp_526 = icmp sgt i32 %temp_524, %temp_525
  %temp_527 = zext i1 %temp_526 to i32
  store i32 %temp_527, i32* %t17
  %temp_528 = load i32, i32* %t17
  store i32 %temp_528, i32* %maior
  %temp_529 = load i32, i32* %a
  %temp_530 = load i32, i32* %b
  %temp_531 = load i32, i32* %a
  %temp_532 = load i32, i32* %b
  %temp_533 = icmp sle i32 %temp_531, %temp_532
  %temp_534 = zext i1 %temp_533 to i32
  store i32 %temp_534, i32* %t18
  %temp_535 = load i32, i32* %t18
  store i32 %temp_535, i32* %menorIgual
  %temp_536 = load i32, i32* %a
  %temp_537 = load i32, i32* %b
  %temp_538 = load i32, i32* %a
  %temp_539 = load i32, i32* %b
  %temp_540 = icmp sge i32 %temp_538, %temp_539
  %temp_541 = zext i1 %temp_540 to i32
  store i32 %temp_541, i32* %t19
  %temp_542 = load i32, i32* %t19
  store i32 %temp_542, i32* %maiorIgual
  call i32 @puts(i8* getelementptr inbounds ([24 x i8], [24 x i8]* @str_14, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str_15, i64 0, i64 0))
  %temp_543 = load i32, i32* %igual
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_543)
  call i32 @puts(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str_16, i64 0, i64 0))
  %temp_544 = load i32, i32* %diferente
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_544)
  call i32 @puts(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @str_17, i64 0, i64 0))
  %temp_545 = load i32, i32* %menor
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_545)
  call i32 @puts(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @str_18, i64 0, i64 0))
  %temp_546 = load i32, i32* %maior
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_546)
  call i32 @puts(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str_19, i64 0, i64 0))
  %temp_547 = load i32, i32* %menorIgual
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_547)
  call i32 @puts(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str_20, i64 0, i64 0))
  %temp_548 = load i32, i32* %maiorIgual
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_548)
  store i32 1, i32* %condicao1
  store i32 0, i32* %condicao2
  %temp_549 = load i32, i32* %condicao1
  %temp_550 = load i32, i32* %condicao2
  %temp_551 = load i32, i32* %condicao1
  %temp_552 = load i32, i32* %condicao2
  %temp_553 = icmp ne i32 %temp_551, 0
  %temp_554 = icmp ne i32 %temp_552, 0
  %temp_555 = and i1 %temp_553, %temp_554
  %temp_556 = zext i1 %temp_555 to i32
  store i32 %temp_556, i32* %t20
  %temp_557 = load i32, i32* %t20
  store i32 %temp_557, i32* %e_logico
  %temp_558 = load i32, i32* %condicao1
  %temp_559 = load i32, i32* %condicao2
  %temp_560 = load i32, i32* %condicao1
  %temp_561 = load i32, i32* %condicao2
  %temp_562 = icmp ne i32 %temp_560, 0
  %temp_563 = icmp ne i32 %temp_561, 0
  %temp_564 = or i1 %temp_562, %temp_563
  %temp_565 = zext i1 %temp_564 to i32
  store i32 %temp_565, i32* %t21
  %temp_566 = load i32, i32* %t21
  store i32 %temp_566, i32* %ou_logico
  call i32 @puts(i8* getelementptr inbounds ([30 x i8], [30 x i8]* @str_21, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @str_22, i64 0, i64 0))
  %temp_567 = load i32, i32* %e_logico
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_567)
  call i32 @puts(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @str_23, i64 0, i64 0))
  %temp_568 = load i32, i32* %ou_logico
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_568)
  %temp_569 = load i32, i32* %a
  %temp_570 = load i32, i32* %b
  %temp_571 = load i32, i32* %a
  %temp_572 = load i32, i32* %b
  %temp_573 = icmp sgt i32 %temp_571, %temp_572
  %temp_574 = zext i1 %temp_573 to i32
  store i32 %temp_574, i32* %t22
  %temp_575 = load i32, i32* %soma
  %temp_576 = load i32, i32* %soma
  %temp_577 = icmp sgt i32 %temp_576, 10
  %temp_578 = zext i1 %temp_577 to i32
  store i32 %temp_578, i32* %t23
  %temp_579 = load i32, i32* %t22
  %temp_580 = load i32, i32* %t23
  %temp_581 = load i32, i32* %t22
  %temp_582 = load i32, i32* %t23
  %temp_583 = icmp ne i32 %temp_581, 0
  %temp_584 = icmp ne i32 %temp_582, 0
  %temp_585 = and i1 %temp_583, %temp_584
  %temp_586 = zext i1 %temp_585 to i32
  store i32 %temp_586, i32* %t24
  %temp_587 = load i32, i32* %t24
  store i32 %temp_587, i32* %complexa
  call i32 @puts(i8* getelementptr inbounds ([24 x i8], [24 x i8]* @str_24, i64 0, i64 0))
  %temp_588 = load i32, i32* %complexa
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_588)
  call i32 @puts(i8* getelementptr inbounds ([22 x i8], [22 x i8]* @str_25, i64 0, i64 0))
  call i32 (i8*, ...) @scanf(i8* getelementptr inbounds ([3 x i8], [3 x i8]* @scanf_int, i64 0, i64 0), i32* %entrada_usuario)
  call i32 @puts(i8* getelementptr inbounds ([18 x i8], [18 x i8]* @str_26, i64 0, i64 0))
  %temp_589 = load i32, i32* %entrada_usuario
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_589)
  call i32 @puts(i8* getelementptr inbounds ([36 x i8], [36 x i8]* @str_27, i64 0, i64 0))
  %temp_590 = load i32, i32* %idade
  %temp_591 = load i32, i32* %idade
  %temp_592 = icmp sge i32 %temp_591, 18
  %temp_593 = zext i1 %temp_592 to i32
  store i32 %temp_593, i32* %t25
  %temp_594 = load i32, i32* %t25
  %temp_595 = icmp eq i32 %temp_594, 0
  br i1 %temp_595, label %L2, label %label_19
label_19:
  call i32 @puts(i8* getelementptr inbounds ([19 x i8], [19 x i8]* @str_28, i64 0, i64 0))
  br label %L1
L2:
  br label %L1
L1:
  %temp_596 = load i32, i32* %idade
  %temp_597 = load i32, i32* %idade
  %temp_598 = icmp slt i32 %temp_597, 13
  %temp_599 = zext i1 %temp_598 to i32
  store i32 %temp_599, i32* %t26
  %temp_600 = load i32, i32* %t26
  %temp_601 = icmp eq i32 %temp_600, 0
  br i1 %temp_601, label %L4, label %label_20
label_20:
  call i32 @puts(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @str_29, i64 0, i64 0))
  br label %L3
L4:
  %temp_602 = load i32, i32* %idade
  %temp_603 = load i32, i32* %idade
  %temp_604 = icmp slt i32 %temp_603, 18
  %temp_605 = zext i1 %temp_604 to i32
  store i32 %temp_605, i32* %t27
  %temp_606 = load i32, i32* %t27
  %temp_607 = icmp eq i32 %temp_606, 0
  br i1 %temp_607, label %L5, label %label_21
label_21:
  call i32 @puts(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @str_30, i64 0, i64 0))
  br label %L3
L5:
  %temp_608 = load i32, i32* %idade
  %temp_609 = load i32, i32* %idade
  %temp_610 = icmp slt i32 %temp_609, 60
  %temp_611 = zext i1 %temp_610 to i32
  store i32 %temp_611, i32* %t28
  %temp_612 = load i32, i32* %t28
  %temp_613 = icmp eq i32 %temp_612, 0
  br i1 %temp_613, label %L6, label %label_22
label_22:
  call i32 @puts(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @str_31, i64 0, i64 0))
  br label %L3
L6:
  call i32 @puts(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @str_32, i64 0, i64 0))
  br label %L3
L3:
  call i32 @puts(i8* getelementptr inbounds ([22 x i8], [22 x i8]* @str_33, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([23 x i8], [23 x i8]* @str_34, i64 0, i64 0))
  store i32 1, i32* %i
  br label %L7
L7:
  %temp_614 = load i32, i32* %i
  %temp_615 = load i32, i32* %i
  %temp_616 = icmp sle i32 %temp_615, 5
  %temp_617 = zext i1 %temp_616 to i32
  store i32 %temp_617, i32* %t29
  %temp_618 = load i32, i32* %t29
  %temp_619 = icmp eq i32 %temp_618, 0
  br i1 %temp_619, label %L8, label %label_23
label_23:
  call i32 @puts(i8* getelementptr inbounds ([12 x i8], [12 x i8]* @str_35, i64 0, i64 0))
  %temp_620 = load i32, i32* %i
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_620)
  %temp_621 = load i32, i32* %i
  %temp_622 = load i32, i32* %i
  %temp_623 = add i32 %temp_622, 1
  store i32 %temp_623, i32* %t30
  %temp_624 = load i32, i32* %t30
  store i32 %temp_624, i32* %i
  br label %L7
L8:
  call i32 @puts(i8* getelementptr inbounds ([25 x i8], [25 x i8]* @str_36, i64 0, i64 0))
  store i32 10, i32* %j
  br label %L9
L9:
  %temp_625 = load i32, i32* %j
  %temp_626 = load i32, i32* %j
  %temp_627 = icmp sge i32 %temp_626, 7
  %temp_628 = zext i1 %temp_627 to i32
  store i32 %temp_628, i32* %t31
  %temp_629 = load i32, i32* %t31
  %temp_630 = icmp eq i32 %temp_629, 0
  br i1 %temp_630, label %L10, label %label_24
label_24:
  call i32 @puts(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @str_37, i64 0, i64 0))
  %temp_631 = load i32, i32* %j
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_631)
  %temp_632 = load i32, i32* %j
  %temp_633 = load i32, i32* %j
  %temp_634 = sub i32 %temp_633, 1
  store i32 %temp_634, i32* %t32
  %temp_635 = load i32, i32* %t32
  store i32 %temp_635, i32* %j
  br label %L9
L10:
  store i32 0, i32* %inicio
  store i32 3, i32* %fim
  call i32 @puts(i8* getelementptr inbounds ([20 x i8], [20 x i8]* @str_38, i64 0, i64 0))
  %temp_636 = load i32, i32* %inicio
  store i32 %temp_636, i32* %k
  br label %L11
L11:
  %temp_637 = load i32, i32* %k
  %temp_638 = load i32, i32* %fim
  %temp_639 = load i32, i32* %k
  %temp_640 = load i32, i32* %fim
  %temp_641 = icmp sle i32 %temp_639, %temp_640
  %temp_642 = zext i1 %temp_641 to i32
  store i32 %temp_642, i32* %t33
  %temp_643 = load i32, i32* %t33
  %temp_644 = icmp eq i32 %temp_643, 0
  br i1 %temp_644, label %L12, label %label_25
label_25:
  call i32 @puts(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @str_39, i64 0, i64 0))
  %temp_645 = load i32, i32* %k
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_645)
  %temp_646 = load i32, i32* %k
  %temp_647 = load i32, i32* %k
  %temp_648 = load i32, i32* %k
  %temp_649 = load i32, i32* %k
  %temp_650 = mul i32 %temp_648, %temp_649
  store i32 %temp_650, i32* %t34
  %temp_651 = load i32, i32* %t34
  store i32 %temp_651, i32* %quadrado
  call i32 @puts(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @str_40, i64 0, i64 0))
  %temp_652 = load i32, i32* %quadrado
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_652)
  %temp_653 = load i32, i32* %k
  %temp_654 = load i32, i32* %k
  %temp_655 = add i32 %temp_654, 1
  store i32 %temp_655, i32* %t35
  %temp_656 = load i32, i32* %t35
  store i32 %temp_656, i32* %k
  br label %L11
L12:
  call i32 @puts(i8* getelementptr inbounds ([24 x i8], [24 x i8]* @str_41, i64 0, i64 0))
  store i32 0, i32* %cont
  call i32 @puts(i8* getelementptr inbounds ([26 x i8], [26 x i8]* @str_42, i64 0, i64 0))
  br label %L13
L13:
  %temp_657 = load i32, i32* %cont
  %temp_658 = load i32, i32* %cont
  %temp_659 = icmp slt i32 %temp_658, 3
  %temp_660 = zext i1 %temp_659 to i32
  store i32 %temp_660, i32* %t36
  %temp_661 = load i32, i32* %t36
  %temp_662 = icmp eq i32 %temp_661, 0
  br i1 %temp_662, label %L14, label %label_26
label_26:
  call i32 @puts(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @str_43, i64 0, i64 0))
  %temp_663 = load i32, i32* %cont
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_663)
  %temp_664 = load i32, i32* %cont
  %temp_665 = load i32, i32* %cont
  %temp_666 = add i32 %temp_665, 1
  store i32 %temp_666, i32* %t37
  %temp_667 = load i32, i32* %t37
  store i32 %temp_667, i32* %cont
  br label %L13
L14:
  store i32 10, i32* %x
  store i32 1, i32* %y
  call i32 @puts(i8* getelementptr inbounds ([33 x i8], [33 x i8]* @str_44, i64 0, i64 0))
  br label %L15
L15:
  %temp_668 = load i32, i32* %x
  %temp_669 = load i32, i32* %y
  %temp_670 = load i32, i32* %x
  %temp_671 = load i32, i32* %y
  %temp_672 = icmp sgt i32 %temp_670, %temp_671
  %temp_673 = zext i1 %temp_672 to i32
  store i32 %temp_673, i32* %t38
  %temp_674 = load i32, i32* %y
  %temp_675 = load i32, i32* %y
  %temp_676 = icmp slt i32 %temp_675, 5
  %temp_677 = zext i1 %temp_676 to i32
  store i32 %temp_677, i32* %t39
  %temp_678 = load i32, i32* %t38
  %temp_679 = load i32, i32* %t39
  %temp_680 = load i32, i32* %t38
  %temp_681 = load i32, i32* %t39
  %temp_682 = icmp ne i32 %temp_680, 0
  %temp_683 = icmp ne i32 %temp_681, 0
  %temp_684 = and i1 %temp_682, %temp_683
  %temp_685 = zext i1 %temp_684 to i32
  store i32 %temp_685, i32* %t40
  %temp_686 = load i32, i32* %t40
  %temp_687 = icmp eq i32 %temp_686, 0
  br i1 %temp_687, label %L16, label %label_27
label_27:
  call i32 @puts(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str_45, i64 0, i64 0))
  %temp_688 = load i32, i32* %x
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_688)
  call i32 @puts(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str_46, i64 0, i64 0))
  %temp_689 = load i32, i32* %y
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_689)
  %temp_690 = load i32, i32* %x
  %temp_691 = load i32, i32* %x
  %temp_692 = sub i32 %temp_691, 2
  store i32 %temp_692, i32* %t41
  %temp_693 = load i32, i32* %t41
  store i32 %temp_693, i32* %x
  %temp_694 = load i32, i32* %y
  %temp_695 = load i32, i32* %y
  %temp_696 = add i32 %temp_695, 1
  store i32 %temp_696, i32* %t42
  %temp_697 = load i32, i32* %t42
  store i32 %temp_697, i32* %y
  br label %L15
L16:
  call i32 @puts(i8* getelementptr inbounds ([28 x i8], [28 x i8]* @str_47, i64 0, i64 0))
  store i32 15, i32* %num1
  store i32 4, i32* %num2
  store i32 1, i32* %operacao
  %temp_698 = load i32, i32* %operacao
  %temp_699 = load i32, i32* %operacao
  %temp_700 = icmp eq i32 %temp_699, 1
  %temp_701 = zext i1 %temp_700 to i32
  store i32 %temp_701, i32* %t43
  %temp_702 = load i32, i32* %t43
  %temp_703 = icmp eq i32 %temp_702, 0
  br i1 %temp_703, label %L18, label %label_28
label_28:
  %temp_704 = load i32, i32* %num1
  %temp_705 = load i32, i32* %num2
  %temp_706 = load i32, i32* %num1
  %temp_707 = load i32, i32* %num2
  %temp_708 = add i32 %temp_706, %temp_707
  store i32 %temp_708, i32* %t44
  %temp_709 = load i32, i32* %t44
  store i32 %temp_709, i32* %result
  call i32 @puts(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @str_8, i64 0, i64 0))
  %temp_710 = load i32, i32* %num1
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_710)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_48, i64 0, i64 0))
  %temp_711 = load i32, i32* %num2
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_711)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_49, i64 0, i64 0))
  %temp_712 = load i32, i32* %result
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_712)
  br label %L17
L18:
  %temp_713 = load i32, i32* %operacao
  %temp_714 = load i32, i32* %operacao
  %temp_715 = icmp eq i32 %temp_714, 2
  %temp_716 = zext i1 %temp_715 to i32
  store i32 %temp_716, i32* %t45
  %temp_717 = load i32, i32* %t45
  %temp_718 = icmp eq i32 %temp_717, 0
  br i1 %temp_718, label %L19, label %label_29
label_29:
  %temp_719 = load i32, i32* %num1
  %temp_720 = load i32, i32* %num2
  %temp_721 = load i32, i32* %num1
  %temp_722 = load i32, i32* %num2
  %temp_723 = sub i32 %temp_721, %temp_722
  store i32 %temp_723, i32* %t46
  %temp_724 = load i32, i32* %t46
  store i32 %temp_724, i32* %result
  call i32 @puts(i8* getelementptr inbounds ([15 x i8], [15 x i8]* @str_9, i64 0, i64 0))
  %temp_725 = load i32, i32* %num1
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_725)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_50, i64 0, i64 0))
  %temp_726 = load i32, i32* %num2
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_726)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_49, i64 0, i64 0))
  %temp_727 = load i32, i32* %result
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_727)
  br label %L17
L19:
  %temp_728 = load i32, i32* %operacao
  %temp_729 = load i32, i32* %operacao
  %temp_730 = icmp eq i32 %temp_729, 3
  %temp_731 = zext i1 %temp_730 to i32
  store i32 %temp_731, i32* %t47
  %temp_732 = load i32, i32* %t47
  %temp_733 = icmp eq i32 %temp_732, 0
  br i1 %temp_733, label %L20, label %label_30
label_30:
  %temp_734 = load i32, i32* %num1
  %temp_735 = load i32, i32* %num2
  %temp_736 = load i32, i32* %num1
  %temp_737 = load i32, i32* %num2
  %temp_738 = mul i32 %temp_736, %temp_737
  store i32 %temp_738, i32* %t48
  %temp_739 = load i32, i32* %t48
  store i32 %temp_739, i32* %result
  call i32 @puts(i8* getelementptr inbounds ([19 x i8], [19 x i8]* @str_10, i64 0, i64 0))
  %temp_740 = load i32, i32* %num1
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_740)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_51, i64 0, i64 0))
  %temp_741 = load i32, i32* %num2
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_741)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_49, i64 0, i64 0))
  %temp_742 = load i32, i32* %result
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_742)
  br label %L17
L20:
  %temp_743 = load i32, i32* %operacao
  %temp_744 = load i32, i32* %operacao
  %temp_745 = icmp eq i32 %temp_744, 4
  %temp_746 = zext i1 %temp_745 to i32
  store i32 %temp_746, i32* %t49
  %temp_747 = load i32, i32* %t49
  %temp_748 = icmp eq i32 %temp_747, 0
  br i1 %temp_748, label %L21, label %label_31
label_31:
  %temp_749 = load i32, i32* %num2
  %temp_750 = load i32, i32* %num2
  %temp_751 = icmp ne i32 %temp_750, 0
  %temp_752 = zext i1 %temp_751 to i32
  store i32 %temp_752, i32* %t50
  %temp_753 = load i32, i32* %t50
  %temp_754 = icmp eq i32 %temp_753, 0
  br i1 %temp_754, label %L23, label %label_32
label_32:
  %temp_755 = load i32, i32* %num1
  %temp_756 = load i32, i32* %num2
  %temp_757 = load i32, i32* %num1
  %temp_758 = load i32, i32* %num2
  %temp_759 = sdiv i32 %temp_757, %temp_758
  store i32 %temp_759, i32* %t51
  %temp_760 = load i32, i32* %t51
  store i32 %temp_760, i32* %result
  call i32 @puts(i8* getelementptr inbounds ([13 x i8], [13 x i8]* @str_11, i64 0, i64 0))
  %temp_761 = load i32, i32* %num1
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_761)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_52, i64 0, i64 0))
  %temp_762 = load i32, i32* %num2
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_762)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_49, i64 0, i64 0))
  %temp_763 = load i32, i32* %result
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_763)
  br label %L22
L23:
  call i32 @puts(i8* getelementptr inbounds ([28 x i8], [28 x i8]* @str_53, i64 0, i64 0))
  br label %L22
L22:
  br label %L17
L21:
  br label %L17
L17:
  store i32 5, i32* %n
  store i32 1, i32* %fatorial
  call i32 @puts(i8* getelementptr inbounds ([27 x i8], [27 x i8]* @str_54, i64 0, i64 0))
  %temp_764 = load i32, i32* %n
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_764)
  store i32 1, i32* %f
  br label %L24
L24:
  %temp_765 = load i32, i32* %f
  %temp_766 = load i32, i32* %n
  %temp_767 = load i32, i32* %f
  %temp_768 = load i32, i32* %n
  %temp_769 = icmp sle i32 %temp_767, %temp_768
  %temp_770 = zext i1 %temp_769 to i32
  store i32 %temp_770, i32* %t52
  %temp_771 = load i32, i32* %t52
  %temp_772 = icmp eq i32 %temp_771, 0
  br i1 %temp_772, label %L25, label %label_33
label_33:
  %temp_773 = load i32, i32* %fatorial
  %temp_774 = load i32, i32* %f
  %temp_775 = load i32, i32* %fatorial
  %temp_776 = load i32, i32* %f
  %temp_777 = mul i32 %temp_775, %temp_776
  store i32 %temp_777, i32* %t53
  %temp_778 = load i32, i32* %t53
  store i32 %temp_778, i32* %fatorial
  call i32 @puts(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @str_55, i64 0, i64 0))
  %temp_779 = load i32, i32* %f
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_779)
  call i32 @puts(i8* getelementptr inbounds ([6 x i8], [6 x i8]* @str_56, i64 0, i64 0))
  %temp_780 = load i32, i32* %fatorial
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_780)
  %temp_781 = load i32, i32* %f
  %temp_782 = load i32, i32* %f
  %temp_783 = add i32 %temp_782, 1
  store i32 %temp_783, i32* %t54
  %temp_784 = load i32, i32* %t54
  store i32 %temp_784, i32* %f
  br label %L24
L25:
  call i32 @puts(i8* getelementptr inbounds ([20 x i8], [20 x i8]* @str_57, i64 0, i64 0))
  %temp_785 = load i32, i32* %fatorial
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_785)
  store i32 0, i32* %fib1
  store i32 1, i32* %fib2
  store i32 0, i32* %fib_count
  call i32 @puts(i8* getelementptr inbounds ([28 x i8], [28 x i8]* @str_58, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @str_59, i64 0, i64 0))
  %temp_786 = load i32, i32* %fib1
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_786)
  call i32 @puts(i8* getelementptr inbounds ([11 x i8], [11 x i8]* @str_60, i64 0, i64 0))
  %temp_787 = load i32, i32* %fib2
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_787)
  br label %L26
L26:
  %temp_788 = load i32, i32* %fib_count
  %temp_789 = load i32, i32* %fib_count
  %temp_790 = icmp slt i32 %temp_789, 8
  %temp_791 = zext i1 %temp_790 to i32
  store i32 %temp_791, i32* %t55
  %temp_792 = load i32, i32* %t55
  %temp_793 = icmp eq i32 %temp_792, 0
  br i1 %temp_793, label %L27, label %label_34
label_34:
  %temp_794 = load i32, i32* %fib1
  %temp_795 = load i32, i32* %fib2
  %temp_796 = load i32, i32* %fib1
  %temp_797 = load i32, i32* %fib2
  %temp_798 = add i32 %temp_796, %temp_797
  store i32 %temp_798, i32* %t56
  %temp_799 = load i32, i32* %t56
  store i32 %temp_799, i32* %proximo
  %temp_800 = load i32, i32* %fib_count
  %temp_801 = load i32, i32* %fib_count
  %temp_802 = add i32 %temp_801, 1
  store i32 %temp_802, i32* %t57
  %temp_803 = load i32, i32* %t57
  store i32 %temp_803, i32* %fib_count
  call i32 @puts(i8* getelementptr inbounds ([7 x i8], [7 x i8]* @str_61, i64 0, i64 0))
  %temp_804 = load i32, i32* %fib_count
  %temp_805 = load i32, i32* %fib_count
  %temp_806 = add i32 %temp_805, 1
  store i32 %temp_806, i32* %t58
  %temp_807 = load i32, i32* %t58
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_807)
  call i32 @puts(i8* getelementptr inbounds ([8 x i8], [8 x i8]* @str_62, i64 0, i64 0))
  %temp_808 = load i32, i32* %proximo
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_808)
  %temp_809 = load i32, i32* %fib2
  store i32 %temp_809, i32* %fib1
  %temp_810 = load i32, i32* %proximo
  store i32 %temp_810, i32* %fib2
  br label %L26
L27:
  store i32 8, i32* %nota
  store i32 85, i32* %frequencia
  call i32 @puts(i8* getelementptr inbounds ([35 x i8], [35 x i8]* @str_63, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([10 x i8], [10 x i8]* @str_64, i64 0, i64 0))
  %temp_811 = load i32, i32* %nota
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_811)
  call i32 @puts(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @str_65, i64 0, i64 0))
  %temp_812 = load i32, i32* %frequencia
  call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @int_format_newline, i64 0, i64 0), i32 %temp_812)
  %temp_813 = load i32, i32* %nota
  %temp_814 = load i32, i32* %nota
  %temp_815 = icmp sge i32 %temp_814, 7
  %temp_816 = zext i1 %temp_815 to i32
  store i32 %temp_816, i32* %t59
  %temp_817 = load i32, i32* %frequencia
  %temp_818 = load i32, i32* %frequencia
  %temp_819 = icmp sge i32 %temp_818, 75
  %temp_820 = zext i1 %temp_819 to i32
  store i32 %temp_820, i32* %t60
  %temp_821 = load i32, i32* %t59
  %temp_822 = load i32, i32* %t60
  %temp_823 = load i32, i32* %t59
  %temp_824 = load i32, i32* %t60
  %temp_825 = icmp ne i32 %temp_823, 0
  %temp_826 = icmp ne i32 %temp_824, 0
  %temp_827 = and i1 %temp_825, %temp_826
  %temp_828 = zext i1 %temp_827 to i32
  store i32 %temp_828, i32* %t61
  %temp_829 = load i32, i32* %t61
  %temp_830 = icmp eq i32 %temp_829, 0
  br i1 %temp_830, label %L29, label %label_35
label_35:
  call i32 @puts(i8* getelementptr inbounds ([14 x i8], [14 x i8]* @str_66, i64 0, i64 0))
  br label %L28
L29:
  %temp_831 = load i32, i32* %nota
  %temp_832 = load i32, i32* %nota
  %temp_833 = icmp sge i32 %temp_832, 5
  %temp_834 = zext i1 %temp_833 to i32
  store i32 %temp_834, i32* %t62
  %temp_835 = load i32, i32* %frequencia
  %temp_836 = load i32, i32* %frequencia
  %temp_837 = icmp sge i32 %temp_836, 75
  %temp_838 = zext i1 %temp_837 to i32
  store i32 %temp_838, i32* %t63
  %temp_839 = load i32, i32* %t62
  %temp_840 = load i32, i32* %t63
  %temp_841 = load i32, i32* %t62
  %temp_842 = load i32, i32* %t63
  %temp_843 = icmp ne i32 %temp_841, 0
  %temp_844 = icmp ne i32 %temp_842, 0
  %temp_845 = and i1 %temp_843, %temp_844
  %temp_846 = zext i1 %temp_845 to i32
  store i32 %temp_846, i32* %t64
  %temp_847 = load i32, i32* %t64
  %temp_848 = icmp eq i32 %temp_847, 0
  br i1 %temp_848, label %L30, label %label_36
label_36:
  call i32 @puts(i8* getelementptr inbounds ([16 x i8], [16 x i8]* @str_67, i64 0, i64 0))
  br label %L28
L30:
  call i32 @puts(i8* getelementptr inbounds ([15 x i8], [15 x i8]* @str_68, i64 0, i64 0))
  br label %L28
L28:
  call i32 @puts(i8* getelementptr inbounds ([31 x i8], [31 x i8]* @str_69, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([29 x i8], [29 x i8]* @str_70, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([45 x i8], [45 x i8]* @str_71, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([23 x i8], [23 x i8]* @str_72, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([57 x i8], [57 x i8]* @str_73, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([43 x i8], [43 x i8]* @str_74, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([22 x i8], [22 x i8]* @str_75, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([39 x i8], [39 x i8]* @str_76, i64 0, i64 0))
  call i32 @puts(i8* getelementptr inbounds ([31 x i8], [31 x i8]* @str_69, i64 0, i64 0))
  ret i32 0
}