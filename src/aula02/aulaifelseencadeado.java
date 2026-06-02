package aula02;

import java.util.Scanner;

public class aulaifelseencadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite sua nota: ");
        double nota = scanner.nextDouble();

        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Bom!");
        } else if (nota >= 5) {
            System.out.println("Regular!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
