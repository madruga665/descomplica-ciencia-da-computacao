Algoritmo "Volume"

Var
   // Se��o de Declara��es das vari�veis
   r, V: real

funcao volume: real
var
   b: real;
inicio

   b <- r^3*(4/3)*pi
   retorne b
fimfuncao

Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc�

   Escreval("Insira o valor do raio em cm")
   leia(r)
   V <- r^3*(4/3)*pi
   Escreval("O Volume de uma esfera de raio ", r, " cm � ", V, " cm�")
Fimalgoritmo