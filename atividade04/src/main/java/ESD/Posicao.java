package ESD;

public class Posicao implements Comparable<Posicao>{
    int linha;
    int coluna;
    Posicao posicaoAnterior;

    public Posicao(int linha, int coluna, Posicao posicaoAnterior) {
        this.linha = linha;
        this.coluna = coluna;
        this.posicaoAnterior = posicaoAnterior;
    }



    @Override
    public int compareTo(Posicao o) {
        return 0;
    }
}
