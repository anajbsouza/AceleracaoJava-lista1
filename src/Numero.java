/*
Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar, positivo ou negativo.
Java
Copy
// Exemplos de Saída
-5 é ímpar e negativo.
10 é par e positivo.
*/

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
