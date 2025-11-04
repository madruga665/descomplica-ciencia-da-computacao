public class Programa02 {
  public static void main(String entrada[]) {
    int numero1, numero2;
    int mod, div;
    double raiz, pot;
    String msg = "";

    numero1 = Integer.parseInt(entrada[0]);
    numero2 = Integer.parseInt(entrada[1]);

    mod = numero1 % numero2;
    div = (int) numero1 / (int) numero2;
    raiz = Math.sqrt(numero1);
    pot = Math.pow(numero1, numero2);

    msg = "numero 1 = " + numero1 + " numero 2 = " + numero2 + "\n";
    msg = msg + "resto da divisao de numero 1 por numero 2 = " + mod + "\n";
    msg = msg + "quociente da divisao de numero 1 por numero 2 = " + div + "\n";
    msg = msg + "raiz quadadra de numero 1 = " + raiz + "\n";
    msg = msg + "potencia de numero 1 e numero 2 = " + pot + "\n";

    System.out.println(msg);
    System.exit(0);
  }
}
