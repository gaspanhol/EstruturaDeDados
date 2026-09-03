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

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }

        }



    }
}
