package aula04;

import java.util.ArrayDeque;
import java.util.Deque;

public class pilha {
    public static void main(String[] args) {
        Deque<Integer> pilha = new ArrayDeque<>();

        System.out.println("Pilha inicial: " + pilha);
        pilha.push(101);
        pilha.push(202);
        pilha.push(303);
        System.out.println("Pilha após empilhamento: " + pilha);

        int topo = pilha.peek();
        System.out.println("Elemento do topo (sem remover): " + topo);
        System.out.println("Pilha após peek: " + pilha);

        int removido1 = pilha.pop();
        int removido2 = pilha.pop();

        System.out.println("Elemento removido 1 " + removido1);
        System.out.println("Elemento removido 2 " + removido2);
        System.out.println("Pilha após pop: " + pilha);

    }
}
