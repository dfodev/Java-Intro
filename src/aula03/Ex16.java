package aula03;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;


        while (true) {
            System.out.println("digite um numero: ");
            numero = scanner.nextInt();
            if (numero < 0) {
                return;
            } else {
                System.out.printf("Dobro do %d = %d", numero, numero * 2);
            }
        }
    }
}

