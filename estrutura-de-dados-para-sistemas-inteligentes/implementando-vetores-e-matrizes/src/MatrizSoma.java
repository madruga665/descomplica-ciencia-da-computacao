import javax.swing.*;

class MatrizSoma {
  public static void main(String args[]) {
    int MatSoma[][], a, b, soma = 0;
    MatSoma = new int[3][3];

    for (a = 0; a <= 2; a++) {
      for (b = 0; b <= 2; b++) {
        MatSoma[a][b] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));

        soma = soma + MatSoma[a][b];
      }
    }
    System.out.println("A soma dos valores digitados é: " + soma);
    System.exit(0);
  }
}