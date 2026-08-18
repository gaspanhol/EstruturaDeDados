package ESD;

import java.util.Random;

public class Main {
    static void main() {
        Random random = new Random();

        int quantidade = 10;

        Vetor<Integer> v1 = new Vetor<>(10);

        for (int i = 0; i < quantidade; i++) {
            int valorSorteado = random.nextInt(100);

            if (v1.valorUnico(valorSorteado)){
                v1.inserir(valorSorteado);
            } else {
                while (!v1.valorUnico(valorSorteado)){
                    valorSorteado = random.nextInt(100);
                }
                v1.inserir(valorSorteado);
            }
        }















        v1.imprimir();

    }
}
