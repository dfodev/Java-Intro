package aula02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double comp;
        double lagura;
        double area;
        double perimetro;

        System.out.println("Digite o valor do comprimetno do retangulo: ");
        lagura = scanner.nextDouble();

        System.out.println("Digite o valor do largura do retangulo: ");
        comp = scanner.nextDouble();

        perimetro = (lagura + comp) * 2;
        area =  comp * lagura;

        System.out.printf("Perimetro do retangulo é: %.2f", perimetro);
        System.out.printf(" A area do retangulo é: %.2f", area);
    }
}
