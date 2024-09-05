import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberList {

  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Quantos números você deseja inserir?");
    int n = scanner.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("Digite o número " + (i + 1) + ": ");
      int number = scanner.nextInt();
      numbers.add(number);
    }

    System.out.println("\nNúmeros armazenados:");
    for (int number : numbers) {
      System.out.print(number + " ");
    }

    int sum = 0;
    for (int number : numbers) {
      sum += number;
    }
    System.out.println("\n\nSoma total dos números: " + sum);

    scanner.close();
  }
}