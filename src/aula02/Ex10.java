package aula02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3, menor;

        System.out.print("digite o 1º numero: ");
        num1 = scanner.nextInt();

        System.out.print("digite o 2º numero: ");
        num2 = scanner.nextInt();

        System.out.print("digite o 3º numero: ");
        num3 = scanner.nextInt();

        menor = Math.min(num1, num2);
        menor = Math.min(menor, num3);

        System.out.printf("o menor numero é: %d", menor);
    }
}
