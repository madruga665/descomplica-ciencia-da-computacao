Algoritmo "multiplicacao"

Var
   controle: inteiro
   numero: inteiro
   resultado: inteiro

Inicio
   resultado <- 1
   enquanto controle < 10 faça
      escreval("digite um numero")
      leia(numero)

      resultado <- resultado * numero
      escreval("resultado: ", resultado)
      controle <- controle +1
   fimenquanto

Fimalgoritmo