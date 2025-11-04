import javax.swing.JOptionPane;

public class FatorialComCauda {
  static int fatorialComCauda(int n) {
    if (n == 0) {
      return 1; // regra 1
    } else {
      int f = n * fatorialComCauda(n -1); // regra 2 e 3

      return f;
    }
  }

  public static void main(String[] args) throws Exception {
    int f, number;

    number = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você desaja saber o fatorial"));

    if (number < 0) {
      System.out.println("Valor inváligo para cálculo de fatorial, o valor precisa ser maior ou igual a zero");
      System.exit(0);
    } else {
      f = fatorialComCauda(number);
      System.out.println("O fatorial de " + number + " é " + f);
    }
  }
}
