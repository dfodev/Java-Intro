package aula02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.print("digite um numero: ");
        num1 = scanner.nextInt();

        if (num1 == 0) {
            System.out.println("numero é zero!");
        } else if (num1 > 0) {
            System.out.println("numero é positivo");
        } else {
            System.out.println("numero é negativo");
        }
    }
}