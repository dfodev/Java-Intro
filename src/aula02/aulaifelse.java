package aula02;

import java.util.Scanner;

public class aulaifelse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        System.out.print("digite valor de A: ");
        a = scanner.nextInt();

        System.out.print("digite valor de B: ");
        b = scanner.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("valores A e B são múltiplos");
        } else {
            System.out.println("valores A e B não são múltiplos");
        }
    }
}
