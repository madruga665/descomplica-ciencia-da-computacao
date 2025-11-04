import javax.swing.JOptionPane;

public class ProgramaJavaFluxoDeDados {
  public static void main(String entradas[]) {
    int numero1, numero2, div;
    double pot;
    String msg = "";

    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero1"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero2"));

    div = (int) numero1 / (int) numero2;
    pot = Math.pow(numero1, numero2);

    msg = "o quociente da divisao dos dois numeros: " + div + "\n";
    msg = msg + "a potencia do primeiro numero pelo segundo numero: " + pot + "\n";

    JOptionPane.showMessageDialog(null, msg);
    System.exit(0);
  }
}
