package ESD;

public class Main {
    static void main() {
//        Fila<String> fila = new Fila<>(10);
//        fila.enfileirar("A");
//        fila.enfileirar("B");
//
//        fila.enfileirar("C");
//        fila.imprimir();
//
//        fila.enfileirar("D");
//        fila.enfileirar("E");
//
//        fila.desenfileirar();
//        fila.imprimir();

        Fila<Pacote> fila = new Fila<Pacote>(10);

        Produtor p1 = new Produtor("Produtor 1", "PC-A");
        Produtor p2 = new Produtor("Produtor 1", "PC-B");

        p1.produzirPacote(fila, 1, "Login", "Servidor 1", "AAAA");
        p1.produzirPacote(fila, 2, "imagem", "Servidor 2", "AAAA");
        p2.produzirPacote(fila, 3, "imagem", "Servidor 3", "AAAA");

        System.out.println("FILA DE PACOTES");
        fila.imprimir();

        fila.desenfileirar();
        fila.imprimir();

    }
}
