algoritmo "Comparacao"

funcao compara(c, f : real) : logico

inicio

   retorne c = f

fimfuncao

var n1, n2 : real

inicio

   escreva ("Informe o 1o. valor: " )

   leia (n1)

   escreva ("Informe o 2o. valor: ")

   leia (n2)

   se (compara(n1, n2)) entao

      escreval("Numeros iguais")

   senao

      escreval("Numeros diferentes")

   fimse

fimalgoritmo