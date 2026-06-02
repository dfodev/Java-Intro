package aula02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.print("digite o numero: ");
        num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.printf("o %d é o dobro %d", num1 / 2, num1);
        } else {
            System.out.printf("o %d não é o drobro de qualquer numero", num1);
        }
    }
}
