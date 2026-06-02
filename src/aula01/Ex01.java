package aula01;

import java.util.Scanner;


public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioBase;
        double salarioLiquido;

        System.out.println("digite seu salário-base: ");
        salarioBase = scanner.nextDouble();
        salarioLiquido = salarioBase + salarioBase*(5/100.0) - salarioBase*(7/100.0);

        System.out.printf("salario liquido é: R$ %.2f", salarioLiquido);
    }
}
