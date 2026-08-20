package ESD;

public class Main {
    static void main() {
        Agenda minhaAgenda = new Agenda(10);
        Contato contato1 = new Contato("Jorge", "48999999999", "viuads@gmail.com");
        Contato contato2 = new Contato("Jorge", "48999999999", "viuads@gmail.com");
        Contato contato3 = new Contato("Maria", "48999999777", "vastgyadhjadf@gmail.com");
        Contato contato4 = new Contato("Laura", "48777777777", "aiouhnaodfgh@gmail.com");

        minhaAgenda.inserirContato(contato1);
        minhaAgenda.inserirContato(contato2);
        minhaAgenda.inserirContato(contato3);
        minhaAgenda.inserirContato(contato4);
        minhaAgenda.ListarTodosContatos();
        minhaAgenda.remover("Maria", "48999999777");
        minhaAgenda.ListarTodosContatos();
        minhaAgenda.removerUltimo();
        minhaAgenda.ListarTodosContatos();
        minhaAgenda.inserirContato(contato3);
        minhaAgenda.inserirContato(contato4);
        minhaAgenda.buscarContato("Laura");
        minhaAgenda.buscarContato("Marcos");
        minhaAgenda.atualizarContato(0, new Contato("Joao", "48111111111", "lphbiopjsandf@gmail.com"));
        minhaAgenda.buscarContatoIndice(0);
        minhaAgenda.ListarTodosContatos();
        minhaAgenda.atualizarContato(contato4, new Contato("Davi", "48555555555", "ijdnogaga@gmail.com"));
        minhaAgenda.ListarTodosContatos();
        minhaAgenda.buscaPorPrefixo("Jorge");


    }
}
