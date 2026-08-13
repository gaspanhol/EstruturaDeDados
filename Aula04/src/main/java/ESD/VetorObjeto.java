package ESD;

public class VetorObjeto {
    private Object[] elementos;
    private int tamanho;

    public VetorObjeto(int capacidade) {
        elementos = new Object[capacidade];
        this.tamanho=0;
    }


    public void inserir(Object elemento) {
        if (tamanho == elementos.length) {
            IO.println("tá cheio");
            return;
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    public Object ler(int indice) {
        return elementos[indice];
    }



}
