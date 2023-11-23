Algoritmo "multiplicacao2"

Var
   controle: inteiro
   numero: inteiro
   resultado: inteiro

Inicio
   resultado <- 1
   para controle de 1 ate 10 faça
      escreval("digite um numero:")
      leia(numero)
      resultado <- resultado * numero
      escreval("resultado: ", resultado)
      controle <- controle + 1
   fimpara
Fimalgoritmo