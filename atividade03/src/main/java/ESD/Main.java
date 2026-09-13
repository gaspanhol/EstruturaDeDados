package ESD;

public class Main {
    static void main() {
        Agenda minhaAgenda = new Agenda(10);

        int posicao = 0;

        while (posicao != 5) {
            IO.println("--- MENU DA AGENDA DE CONTATOS -- \n" +
                    "1 - adicionar Contato (Ordenado) \n" +
                    "2 - Remover Contato \n" +
                    "3 - Buscar Contato \n" +
                    "4 - Atualizar contato \n" +
                    "5 - Sair \n");
            posicao = Integer.parseInt(IO.readln("Escolha uma opcao: "));

            switch (posicao) {
                case 1:
                    String nome = IO.readln("Digite o nome do contato: ");
                    String telefone = IO.readln("Digite o Telefone: ");
                    String email = IO.readln("Digite o Email: ");
                    Contato contato = new Contato(nome, telefone, email);
                    minhaAgenda.inserirContato(contato);
                    break;
                case 2:
                    String nomeRemover = IO.readln("Digite o nome do contato a remover: ");
                    String telefoneRemover = IO.readln("Digite o telefone do contato a remover: ");
                    minhaAgenda.remover(nomeRemover, telefoneRemover);
                    break;
                case 3:
                    String buscarNome = IO.readln("Digite o nome do contato a buscar: ");
                    minhaAgenda.buscarContato(buscarNome);
                    break;
                case 4:
                    String nomeAtual = IO.readln("Digite o nome do contato a atualizar: ");
                    String nomeNovo = IO.readln("Digite o nome do contato: ");
                    String telefoneNovo = IO.readln("Digite o Telefone: ");
                    String emailNovo = IO.readln("Digite o Email: ");
                    Contato contatoNovo = new Contato(nomeNovo, telefoneNovo, emailNovo);
                    minhaAgenda.atualizarContato(nomeAtual, contatoNovo);
                    break;
            }

        }



    }
}
