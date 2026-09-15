package ESD;

public class decToBin {

    static void main() {
        Stack<Integer> pilha = new Stack<>(50);
        int numero = 19;

        while (numero > 0) {
            int resto = numero % 2;
            pilha.push(resto);
            numero = numero/2;
        }

        // Desempilhar para formar o binario
        StringBuilder binario = new StringBuilder();
        while ( (!pilha.isEmpty())) {
            binario.append(pilha.pop());
        }
        IO.println(binario.toString());

    }
}
