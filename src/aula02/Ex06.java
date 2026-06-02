package aula02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double PROD;

        System.out.println("Digite o valor de A: ");
        a = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        b = scanner.nextDouble();

        PROD = a * b;

        System.out.println("O produto de " + a + " e " + b + " é: " + PROD);
    }
}
