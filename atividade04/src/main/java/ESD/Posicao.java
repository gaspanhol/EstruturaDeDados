package ESD;

public class Posicao {
    private char[][] cima;
    private char[][] baixo;
    private char[][] esq;
    private char[][] dir;

    public Posicao(int linhaposicaoInicial, int colunaPosicaoInicial) {
        this.cima = new char[linhaposicaoInicial- 1][colunaPosicaoInicial];
        this.baixo = baixo;
        this.esq = esq;
        this.dir = dir;
    }
}
