package ESD;

public class Vetor<T> {
    private T[] elementos;
    private int tamanho;

    @SuppressWarnings("unchecked")
    public Vetor(int quantidade){
        elementos = (T[]) new Object[quantidade];
        tamanho = 0;
    }

    public void inserir(T elemento) {
        if (tamanho == elementos.length) {
            IO.println("tá cheio");
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

//    public void inserir(T elemento, int posicao){
//        if (tamanho == elementos.length) {
//            IO.println("tá cheio");
//            return;
//        }
//        int i;
//        for(i = tamanho - 1; i>=0; i--) {
//            Integer atual = (Integer) elementos[i];
//            if (atual > (Integer) elemento) {
//                elementos[i+1] = elementos[i];
//            }
//        }
//        elementos[posicao] =
//    }

    public boolean valorUnico(T elemento){
        for (int i = 0; i < tamanho; i++) {
            if(elemento == elementos[i]){
                return false;
            }
        }
        return true;
    }

    public void ordenarPorCrescente(T numero) {
        for (int i = 0; i < tamanho; i++) {
            if((Integer)numero < (Integer)elementos[i]){
                inserir(numero);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void expandir() {
        T[] novo = (T[]) new Object[elementos.length*2];
        for (int i = 0; i < elementos.length; i++) {
            novo[i] = elementos[i];
        }
        this.elementos = novo;
    }

    public void imprimir() {
        IO.print("[");
        for (int i = 0; i < tamanho; i++) {
            IO.print(elementos[i]);
            if (i < tamanho - 1) {
                IO.print(", ");
            }
        }
        IO.println("]");
    }

    @SuppressWarnings("unchecked")
    private void reduzir() {
        if (tamanho <= elementos.length/4) {
            T[] novo = (T[]) new Object[elementos.length/2];
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

    public int getTamanho() {
        return tamanho;
    }
}
