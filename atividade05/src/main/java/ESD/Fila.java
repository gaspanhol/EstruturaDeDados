package ESD;

public class Fila<T extends Comparable<T>> {

    private T[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        this.elementos = (T[]) new Comparable[capacidade];
        this.tamanho = 0;
        fim = -1;
        inicio = 0;
    }

    public void enfileirar(T elemento) {
        if (tamanho == elementos.length) {
            throw  new RuntimeException("Fila cheia");
        }
        fim = (fim + 1) % elementos.length;
        elementos[fim] = elemento;
        tamanho++;

    }

    public int getTamanho(){
        return tamanho;
    }

    public int capacidade() {
        return elementos.length;
    }

    public boolean isFull(){return tamanho == elementos.length;}

    public boolean isEmpty() {
        return tamanho==0;
    }

    public T desenfileirar() {
        if (isEmpty()) {
            throw new RuntimeException("Fila vazia");
        }
        T valor = elementos[inicio];
        elementos[inicio] = null;

        inicio = (inicio +1) % elementos.length;
        tamanho--;
        return valor;
    }

    public void imprimir() {
        System.out.print("Fila: ");
        for (int i = 0; i < tamanho ; i++) {
            int indice = (inicio + i) % elementos.length;
            System.out.print(elementos[indice] + " ");
        }
        System.out.println();
    }
}
