import java.util.Scanner;

public class Numero {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) System.out.print(number + " é par e ");
        else System.out.print(number + " é ímpar e ");
        if (number < 0) System.out.println("negativo");
        else System.out.println("positivo");

        scanner.close();
    }
}
