package aula05;

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distancia, tempo;

        distancia = scanner.nextInt();

        tempo = distancia * 2;

        System.out.println(tempo + " minutos");

    }
}
