package ESD;

public class Main {
    static void main() {
        Pilha<Integer> pilha = new Pilha<>(10);
        IO.println("A pilha esta vazia " + pilha.isEmpty());
        pilha.push(10);
        pilha.push(11);
        pilha.push(12);
        pilha.push(13);
        pilha.push(14);
        IO.println("A pilha esta vazia " + pilha.isEmpty());
        pilha.pop();
        int valor = pilha.pop();
        IO.println("A pilha esta vazia " + pilha.isEmpty());
        pilha.pop();
        pilha.pop();
        pilha.pop();
        IO.println("A pilha esta vazia " + pilha.isEmpty());
    }
}
