package aula01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eleitores;
        int validos;
        int brancos;
        int nulos;


        System.out.println("digite a quantidade de eleitores: ");
        eleitores = scanner.nextInt();

        System.out.println("votos branos: ");
        validos = scanner.nextInt();

        System.out.println("votos branos: ");
        brancos = scanner.nextInt();

        System.out.println("votos branos: ");
        nulos = scanner.nextInt();

        System.out.printf("validos %.2f%%\n", (Double.valueOf(validos) / eleitores) * 100.0);
        System.out.printf("nulos %.2f%%\n", (Double.valueOf(nulos) / eleitores) * 100.0);
        System.out.printf("brancos %.2f%%\n", (Double.valueOf(brancos) / eleitores) * 100.0);

    }
}
