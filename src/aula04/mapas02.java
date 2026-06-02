package aula04;

import java.util.HashMap;
import java.util.Map;

public class mapas02 {
    public static void main(String[] args) {
        Map<String, Object> dadosUsuario = new HashMap<>();

        dadosUsuario.put("nome", "Lilly");
        dadosUsuario.put("idade", 4);
        dadosUsuario.put("ativo", true);

        String nome = (String) dadosUsuario.get("nome");
        int idade = (int) dadosUsuario.get("idade");
        boolean ativo = (Boolean) dadosUsuario.get("ativo");

        System.out.printf("Nome: %s%nIdade: %d%nAtivo?: %b%n", nome, idade, ativo);

    }
}
