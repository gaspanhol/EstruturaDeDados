package ESD;

import java.lang.foreign.ValueLayout;
import java.util.Random;

public class Main {
    static void main() {
        long inicio = System.nanoTime();

        // Algoritmo aqui
        Random random = new Random();

        Vetor<Integer> v1 = new Vetor<>(10);
        Vetor<Integer> v2 = new Vetor<>(100);
        Vetor<Integer> v3 = new Vetor<>(1000);

        //Preenchendo o v1
        for (int i = 0; i < v1.getLenght(); i++) {
            int valorSorteado = random.nextInt(10);
            v1.inserirOrdenado(valorSorteado);
        }
        v1.imprimir();

        //Preenchendo o v2
        for (int i = 0; i < v2.getLenght(); i++) {
            int valorSorteado = random.nextInt(100);
            v2.inserirOrdenado(valorSorteado);
        }
        v2.imprimir();

        //Preenchendo o v3
        v3.inserirOrdenado(70);
        for (int i = 0; i < v3.getLenght(); i++) {
            int valorSorteado = random.nextInt(1000);
            v3.inserirOrdenado(valorSorteado);
        }
        v3.imprimir();

        IO.println(v1.buscarBinaria(70));
        IO.println(v1.mostrarComparacoes());

        IO.println(v2.buscarBinaria(70));
        IO.println(v2.mostrarComparacoes());

        IO.println(v3.buscarBinaria(70));
        IO.println(v3.mostrarComparacoes());

        long fim = System.nanoTime();
        long duracaoMs = (fim - inicio) / 1000000;
        System.out.println("Tempo: " + duracaoMs + " ms");
    }
}
