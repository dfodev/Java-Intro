package aula02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota01;
        double nota02;
        double mediaFinal;

        System.out.println("Digite sua nota 1: ");
        nota01 = scanner.nextDouble();

        System.out.println("Digite sua nota 2: ");
        nota02 = scanner.nextDouble();

        mediaFinal = ((nota01 * 2) + (nota02 * 3)) / 5;

        System.out.printf("Média: %.2f ", mediaFinal);

    }
}
