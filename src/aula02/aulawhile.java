package aula02;

import java.util.Scanner;

public class aulawhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("digite um numero positivo(ou 0 para sair): ");
        numero = scanner.nextInt();

        while (numero != 0 ) {
            System.out.println("você digitou: " + numero);
            System.out.println("digite um numero positivo(ou 0 para sair): ");
            numero = scanner.nextInt();
        }

        System.out.println("programa encerrado");
        scanner.close();
    }
}
