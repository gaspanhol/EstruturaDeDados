package ESD;

public class Main {
    static void main() {
        Servidor servidor1 = new Servidor(100000, 2000, 12);

        servidor1.executar(2000);
        servidor1.analiseProbabilidade();

        Servidor servidor2 = new Servidor(100000, 20, 24);

        servidor2.executar(2000);
        servidor2.analiseProbabilidade();

        Servidor servidor3 = new Servidor(100000, 20000, 2);

        servidor3.executar(2000);
        servidor3.analiseProbabilidade();
    }
}
