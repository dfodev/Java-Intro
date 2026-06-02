package aula02;

import java.util.Scanner;

public class aulaswitchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero do dia: ");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda-feira");
                break;
            case 3:
                System.out.println("terça-feira");
                break;
            case 4:
                System.out.println("quarta-feira");
                break;
            default:
                System.out.println("Dia inválido");
                break;
        }
    }
}
