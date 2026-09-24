package ESD;

public class Produtor {

    private String nome;
    private String conteudo;

    public Produtor(String nome, String conteudo) {
        this.nome = nome;
        this.conteudo = conteudo;
    }

    public void produzirPacote(Fila<Pacote> fila, int numero, String origem, String destino, String dados) {
        Pacote pacote = new Pacote(numero,origem,destino,dados);
        fila.enfileirar(pacote);
        System.out.println(nome + "produziu " + pacote);
    }

}
