package ESD;

public class Main {
    static void main() {

        Vetor<Produto> v1 = new Vetor<>(10);
        Produto mouse = new Produto(1, "mouse razer", 200);
        Produto computador = new Produto(1, "PC gamer", 4000);
        Produto monitor = new Produto(1, "monitor LG", 1200);

        v1.inserirOrdenado(mouse);
        v1.inserirOrdenado(computador);
        v1.inserirOrdenado(monitor);

        IO.println(mouse.compareTo(computador));

    }
}
