package ESD;

public class VetorDeListas {

    private VetorEstatico[] nomesLetras;

    public VetorDeListas() {
        nomesLetras = new VetorEstatico[26];
        for (int i = 0; i < nomesLetras.length; i++) {
            nomesLetras[i] = new VetorEstatico(20);
        }
    }

    public void inserir(String nome) {
        char letra = Character.toUpperCase(nome.charAt(0));
        int indice = letra - 'A';
        nomesLetras[indice].inserir(nome);
    }

    public void imprimir() {
        for (int i = 0; i < 26; i++) {
            char letra = (char) ('A' + i);
            IO.println(letra + " ");
            nomesLetras[i].imprimir();
        }
    }
}
