package aula02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        double hora, salario, qtdeHora;

        System.out.println("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite suas horas trabalhas: ");
        hora = scanner.nextDouble();

        System.out.println("Digite suas horas trabalhas: ");
        qtdeHora = scanner.nextDouble();

        salario = hora * qtdeHora;

        System.out.printf("%s Vai ganhar R$ %.2f", nome, salario);
    }
}
