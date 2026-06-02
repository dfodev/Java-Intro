package aula01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoMercadria;
        int quantidade;
        double valorFinal;

        System.out.println("digite o preço da mercadoria : ");
        precoMercadria = scanner.nextDouble();

        System.out.println("digite a quantidade da mercadoria");
        quantidade = scanner.nextInt();

        valorFinal = precoMercadria * quantidade;

        System.out.printf("valor total das compras: R$ %.2f", valorFinal);

    }
}
