package ESD;

public class Main {
    static void main() {

        VetorDinamico v1 = new VetorDinamico(2);

        v1.inserir("Ana");
        v1.inserir("Ana");
        v1.imprimir();

        // Expandir
        v1.inserir("Ana");
        v1.imprimir();
        v1.inserir("Ana");
        v1.inserir("Ana");
        v1.inserir("Ana");

        // Expandir
        v1.inserir("Ana");
        v1.imprimir();

    }
}
