package aula03;

import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = 10;
        int contador = 0;

        while (numero !=0) {
            System.out.println("digite um numero: ");
            numero = scanner.nextInt();
            if (numero != 0) {
                break;
            } else if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }
        System.out.printf("digite numeros de 100 a 200(ou 0 para sair): ", contador);
    }
}

