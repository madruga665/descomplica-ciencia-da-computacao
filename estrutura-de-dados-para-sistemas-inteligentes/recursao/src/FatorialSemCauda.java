import javax.swing.JOptionPane;

public class FatorialSemCauda {
  static void fatorialSemCauda(int n, int x, int f) {
    if (x == 0 || x == 1) {
      System.out.println("O fatorial de " + n + " é " + f); // regra 1
    } else {
      fatorialSemCauda(n, x - 1, f * x); // regra 2 e 3
    }
  }

  public static void main(String[] args) throws Exception {
    int number;
    number = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor que você desaja saber o fatorial"));

    if (number < 0) {
      System.out.println("Valor inváligo para cálculo de fatorial, o valor precisa ser maior ou igual a zero");
      System.exit(0);
    } else {
      fatorialSemCauda(number, number, 1);
    }

    System.exit(0);
  }
}
