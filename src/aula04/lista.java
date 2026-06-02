package aula04;

import java.util.ArrayList;
import java.util.List;

public class lista {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();

        System.out.println("Lista inicial: " + frutas);
        frutas.add("Maça");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add(0, "Morango");
        System.out.println("Lista após edição: " + frutas);

        String segundaFruta = frutas.get(1);

        System.out.println("A fruta na posição 1 é: " + segundaFruta);

        System.out.println("Tamanho da lista: " + frutas.size());

        frutas.remove("Banana");
        frutas.remove(1);
        System.out.println("Lista apos remoção: " + frutas);

        System.out.println("Percorrendo: ");
        for (String f : frutas) {
            System.out.println(f + " | ");
        }
    }
}
