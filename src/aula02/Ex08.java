package aula02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio, comp;

        System.out.println("digite o valor do raio: ");
        raio = scanner.nextDouble();

        comp = 2 * Math.PI * raio;

        System.out.printf("Circunfência: %.2f", comp);
    }
}
