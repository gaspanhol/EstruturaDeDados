package ESD;

public class VetorDinamico {

    private String[] elementos;
    private int tamanho;

    public VetorDinamico(int quantidade) {
        elementos = new String[quantidade];
        this.tamanho = 0;
    }

    public void inserir(String elemento) {
        if (tamanho == elementos.length) {
            expandir();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    private void expandir() {
            String[] novo = new String[elementos.length*2];

        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        this.elementos = novo;
    }

    public void imprimir() {
        IO.print("[");
        for (int i = 0; i < elementos.length; i++) {
            IO.print(elementos[i]);
            if (i < elementos.length - 1) {
                IO.print(", ");
            }
        }
        IO.println("]");
    }

    private void reduzir() {
        if (tamanho <= elementos.length/4) {
            String[] novo = new String[elementos.length/2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
            this.elementos = novo;
        }
    }

    public void remover (int indice) {
        if (indice < 0 || indice >= tamanho) {
            IO.println("indice inválido");
            return;
        }

        for (int i = indice; i < tamanho; i++) {
            elementos[i] = elementos[i+1];
        }

        elementos[tamanho-1] = null;
        tamanho--;
        reduzir();
    }

}
