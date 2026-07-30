package ESD.vetor;

public class Testes {
    static void main() {
        VetorEstatico vetor = new VetorEstatico(10);
        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("D");
        vetor.inserir(2,"E");
        vetor.imprimir();
        vetor.removerUltimo();
        vetor.imprimir();
        vetor.obterTamanho();
    }
}
