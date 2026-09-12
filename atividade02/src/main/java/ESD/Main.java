package ESD;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    static void main() {
        Random random = new Random();

        Vetor<Integer> v1 = new Vetor<>(1000);
        Vetor<Integer> v2 = new Vetor<>(10000);
        Vetor<Integer> v3 = new Vetor<>(100000);

        //Preenchendo o v1
        for (int i = 0; i < v1.getLenght(); i++) {
            int valorSorteado = random.nextInt(10000000);
            v1.inserirOrdenado(valorSorteado);
        }
        //v1.imprimir();

        //Preenchendo o v2
        for (int i = 0; i < v2.getLenght(); i++) {
            int valorSorteado = random.nextInt(10000000);
            v2.inserirOrdenado(valorSorteado);
        }
        //v2.imprimir();

        //Preenchendo o v3
        for (int i = 0; i < v3.getLenght(); i++) {
            int valorSorteado = random.nextInt(10000000);
            v3.inserirOrdenado(valorSorteado);
        }
        //v3.imprimir();

        // ============ Valores para os testes ============
        int valorInicio1 = v1.ler(0);
        int valorMeio1 = v1.ler((v1.obterTamanho()/2));
        int valorFim1 = v1.ler(v1.obterTamanho() - 1);
        int[] alvosPossiveisV1 = {valorInicio1, valorMeio1, valorFim1};

        int valorInicio2 = v2.ler(0);
        int valorMeio2 = v2.ler(v2.obterTamanho()/2);
        int valorFim2 = v2.ler(v2.obterTamanho() - 1);
        int[] alvosPossiveisV2 = {valorInicio2, valorMeio2, valorFim2};

        int valorInicio3 = v3.ler(0);
        int valorMeio3 = v3.ler(v3.obterTamanho()/2);
        int valorFim3 = v3.ler(v3.obterTamanho() - 1);
        int[] alvosPossiveisV3 = {valorInicio3, valorMeio3, valorFim3};

        // ============ Busca Linear ============
        System.out.println("Busca linear:\n");

        System.out.println("Vetor 1 (1.000 elementos):");
        for (int i = 0; i < 3; i++) {
            long inicioL = System.nanoTime();
            v1.buscarLinearOrdenada(alvosPossiveisV1[i]);
            long fimL = System.nanoTime();
            long duracaoMsL = (fimL - inicioL) / 1000000;
            System.out.println("Tempo: " + duracaoMsL + " ms");
            System.out.println("indice do valor alvo v1: " + v1.buscarLinearOrdenada(alvosPossiveisV1[i]));
            System.out.println("Comparacoes realizadas v1: " + v1.mostrarComparacoes());
            System.out.println("====================================================");
        }

        System.out.println();
        System.out.println("Vetor 2 (10.000 elementos):");
        for (int i = 0; i < 3; i++) {
            long inicioL = System.nanoTime();
            v2.buscarLinearOrdenada(alvosPossiveisV2[i]);
            long fimL = System.nanoTime();
            long duracaoMsL = (fimL - inicioL) / 1000000;
            System.out.println("Tempo: " + duracaoMsL + " ms");
            System.out.println("indice do valor alvo v2: " + v2.buscarLinearOrdenada(alvosPossiveisV2[i]));
            System.out.println("Comparacoes realizadas v2: " + v2.mostrarComparacoes());
            System.out.println("====================================================");
        }

        System.out.println();
        System.out.println("Vetor 3 (100.000 elementos):");
        for (int i = 0; i < 3; i++) {
            long inicioL = System.nanoTime();
            v3.buscarLinearOrdenada(alvosPossiveisV3[i]);
            long fimL = System.nanoTime();
            long duracaoMsL = (fimL - inicioL) / 1000000;
            System.out.println("Tempo: " + duracaoMsL + " ms");
            System.out.println("indice do valor alvo v3: " + v3.buscarLinearOrdenada(alvosPossiveisV3[i]));
            System.out.println("Comparacoes realizadas v3: " + v3.mostrarComparacoes());
            System.out.println("====================================================");
        }

        // ============ Busca Binaria ============

        System.out.println();
        System.out.println("Busca Binaria:\n");

        System.out.println("Vetor 1 (1.000 elementos):");
        for (int i = 0; i < 3; i++) {
            long inicioL = System.nanoTime();
            v1.buscarBinaria(alvosPossiveisV1[i]);
            long fimL = System.nanoTime();
            long duracaoMsL = (fimL - inicioL) / 1000000;
            System.out.println("Tempo: " + duracaoMsL + " ms");
            System.out.println("indice do valor alvo v1: " + v1.buscarBinaria(alvosPossiveisV1[i]));
            System.out.println("Comparacoes realizadas v1: " + v1.mostrarComparacoes());
            System.out.println("====================================================");
        }

        System.out.println();
        System.out.println("Vetor 2 (10.000 elementos):");
        for (int i = 0; i < 3; i++) {
            long inicioL = System.nanoTime();
            v2.buscarBinaria(alvosPossiveisV2[i]);
            long fimL = System.nanoTime();
            long duracaoMsL = (fimL - inicioL) / 1000000;
            System.out.println("Tempo: " + duracaoMsL + " ms");
            System.out.println("indice do valor alvo v2: " + v2.buscarBinaria(alvosPossiveisV2[i]));
            System.out.println("Comparacoes realizadas v2: " + v2.mostrarComparacoes());
            System.out.println("====================================================");
        }

        System.out.println();
        System.out.println("Vetor 3 (100.000 elementos):");
        for (int i = 0; i < 3; i++) {
            long inicioL = System.nanoTime();
            v3.buscarBinaria(alvosPossiveisV3[i]);
            long fimL = System.nanoTime();
            long duracaoMsL = (fimL - inicioL) / 1000000;
            System.out.println("Tempo: " + duracaoMsL + " ms");
            System.out.println("indice do valor alvo v3: " + v3.buscarBinaria(alvosPossiveisV3[i]));
            System.out.println("Comparacoes realizadas v3: " + v3.mostrarComparacoes());
            System.out.println("====================================================");
        }

        // ============ Analise final ============

        Vetor<Integer> v4 = new Vetor<>(100000);

        for (int i = 0; i < 100000; i++) {
            int valorSorteado = random.nextInt(10000000);
            v4.inserirOrdenado(valorSorteado);
        }

        int[] ArrayV4 = new int[v4.obterTamanho()];
        for (int i = 0; i < ArrayV4.length; i++) {
            ArrayV4[i] = v4.ler(i);
        }

        long inicio = System.nanoTime();
        int pos = Arrays.binarySearch(ArrayV4, ArrayV4[ArrayV4.length - 1]);
        long fim = System.nanoTime();
        long duracaoMs = (fim- inicio) / 1000000;
        System.out.println("Tempo Arrays.binarySearch: " + duracaoMs + " ms");

    }
}
