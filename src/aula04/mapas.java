package aula04;

import java.util.HashMap;
import java.util.Map;

public class mapas {
    public static void main(String[] args) {
        Map<String, Integer> estoque = new HashMap<>();

        estoque.put("Notebook", 50);
        estoque.put("Mouse", 120);
        estoque.put("Teclado", 75);

        estoque.put("Notebook", 45);

        System.out.println("Mapa após put e atualização: " + estoque);

        int qtdNotebook = estoque.get("Notebook");
        System.out.println("Quantidade de Notebook: " + qtdNotebook);

        boolean temMouse = estoque.containsKey("Mouse");
        boolean temMonitor = estoque.containsKey("Monitor");

        System.out.println("Tem mouse? " + temMouse);
        System.out.println("Tem monitor? " + temMonitor);

        System.out.println("\n--- Mapa Detalhado ---");
        for (String produto : estoque.keySet()) {
            int quantidade = estoque.get(produto);
            System.out.println(produto + ": " + quantidade + " unidades.");
        }
    }
}
