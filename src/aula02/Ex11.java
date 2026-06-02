package aula02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1;

        System.out.print("digite o numero: ");
        num1 = scanner.nextInt();

        if (num1 % 2 == 0 ) {
            System.out.println("numero é par!");
        } else {
            System.out.println("numero é impar");
        }
    }
}
