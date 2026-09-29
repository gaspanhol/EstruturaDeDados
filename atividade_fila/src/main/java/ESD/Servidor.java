package ESD;

import java.util.Random;

public class Servidor {
    private int totalReqGeradas = 0;
    private int totalReqAtendidas = 0;
    private int totalReqPerdidas = 0;
    private Random aleatorio = new Random();
    private Fila<Requisicao> fila;
    private int numProcessadores;
    private int n;

    public Servidor(int capacidade, int n, int numProcessadores) {
        this.fila = new Fila<>(capacidade);
        this.numProcessadores = numProcessadores;
        this.n = n;
    }

    public void executar(int ciclos) {
        for (int ciclo = 1; ciclo <= ciclos; ciclo++) {

            int novasReq = aleatorio.nextInt(1,n);
            for (int i = 0; i < novasReq; i++) {
                totalReqGeradas++;
                if(fila.isFull()){
                    totalReqPerdidas++;
                } else {
                    fila.enfileirar(new Requisicao(aleatorio.nextInt()));
                }
            }


            for (int i = 0; i < numProcessadores; i++) {
                if(!fila.isEmpty()) {
                    fila.desenfileirar();
                    totalReqAtendidas++;
                }
            }
        }
    }

    public void analiseProbabilidade(){
        double porcentagemPerdidas = ((double) totalReqPerdidas /totalReqGeradas)*100;
        double porcentagemAtendidas = ((double) totalReqAtendidas /totalReqGeradas)*100;
        System.out.println("Total de requisições geradas: " + totalReqGeradas + "\n" +
                "Total de processadores: " + numProcessadores + "\n" +
                "Total de n: " + n + "\n" +
                "Total de requisições atendidas: " + totalReqAtendidas + "\n" +
                "Total de requisições perdidas: " + totalReqPerdidas + "\n" +
                "Porcentagem de requisições atendidas: " + porcentagemAtendidas + "\n" +
                "Porcentagem de requisições perdidas: " + porcentagemPerdidas + "\n"
        );

    }

}
