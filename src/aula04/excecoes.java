package aula04;

import java.lang.foreign.SymbolLookup;
import java.util.Scanner;

public class excecoes {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            int numerador = sc.nextInt();
            int denominador = sc.nextInt();

            System.out.println("Iniciando a operação de divisão...");
            System.out.println("Tentando dividir " + numerador + " por " + denominador);

            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {

            System.err.println("\n--- Exceção Capturada ---");
            System.err.println("ERRO: Não é possivel  dividir  por zero.");
            System.err.println("Mensagem: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("\n--- Bloco Finaly ---");
            System.out.println("Operação de limpeza  ou finalização concluída.");
            System.out.println("O programa pode continuar normalmente.");
        }
    }

}
