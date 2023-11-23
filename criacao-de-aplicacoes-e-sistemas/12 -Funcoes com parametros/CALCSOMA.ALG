algoritmo "CalcSoma"

funcao soma(A, B : real) : real
var
   resultado: real
inicio

   resultado <- A + B

   retorne resultado

fimfuncao

var
   NUM1, NUM2, somaaux : real

inicio
   escreval("Informe o 1o. valor: " )
   leia(NUM1)

   escreval("Informe o 2o. valor: " )
   leia(NUM2)

   somaaux <- soma(NUM1, NUM2)
   escreval("Soma = ", somaaux)

fimalgoritmo