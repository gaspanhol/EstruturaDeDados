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

        //Removendo
        System.out.println("removendo na posição 2");
        vetor.remover(2);

        System.out.println("Arranjo após a remoção");
        vetor.imprimir();

        //Removendo pelo objeto
        System.out.println("removendo o elemento B");
        vetor.remover("B");
        System.out.println("Arranjo após a remoção");
        vetor.imprimir();
    }
}
