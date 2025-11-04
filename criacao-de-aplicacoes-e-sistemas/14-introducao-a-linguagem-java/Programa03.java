import javax.swing.JOptionPane;

public class Programa03 {
  public static void main(String entrada[]) {
    int numero1, numero2, mod;
    double raiz, raiz2;
    String msg = "";

    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));

    mod = numero1 % numero2;
    raiz = Math.sqrt(numero1);
    raiz2 = Math.sqrt(numero2);

    msg = msg + "resto da divisao de numero1 por numero2 = " + mod + "\n";
    msg = msg + "raiz quadadra de numero1 = " + raiz + "\n";
    msg = msg + "raiz quadadra de numero2 = " + raiz2 + "\n";

    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);
  }
}
