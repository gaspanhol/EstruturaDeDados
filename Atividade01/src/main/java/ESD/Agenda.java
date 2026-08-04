package ESD;

public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda(int quantidade) {
        this.contatos = new Contato[quantidade];
    }

    public boolean verificarContato(Contato contato) {
        for (int i = 0; i < contatos.length; i++) {
            if ( (contatos[i].getNome()).equals(contato.getNome()) || (contatos[i].getTelefone()).equals(contato.getTelefone()) ) {
                return false;
            }
        }
        return true;
    }

    public void inserirContato (Contato contato) {
        if (verificarContato(contato)) {
            if(tamanho < contatos.length) {
                contatos[tamanho] = contato;
                tamanho++;
            } else {
                IO.println("Vetor ta cheio!");
            }
        }
    }

    public void inserirContato (int indice, Contato contato) {
        if (tamanho >= contatos.length) {
            IO.println("Vetor Cheio!");
            return;
        }

        if (indice < 0 || indice > contatos.length){
            IO.println("Posição Inválida!");
            return;
        }

        for (int i = tamanho; i > indice ; i--) {
            contatos[i] = contatos[i-1];
        }
        contatos[indice] = contato;
        tamanho++;
    }

    public void removerUltimo() {
        if (tamanho > 0) {
            contatos[tamanho - 1] = null;
            tamanho--;
        }
    }

    public void remover(int indice) {
        if (indice < 0 || indice >= tamanho) {
            System.out.println("indice inválido");
            return;
        }

        for (int i = indice; i < tamanho; i++) {
            contatos[i] = contatos[i+1];
        }

        contatos[tamanho-1] = null;
        tamanho--;
    }

    public void remover(String nome, String telefone) {
        for (int i = 0; i < tamanho; i++) {
            if ((contatos[i].getNome()).equals(nome) && (contatos[i].getTelefone()).equals(telefone)) {
                remover(i);
                return;
            }
        }
        contatos[tamanho-1] = null;
        tamanho--;
    }

    public void buscarContato (String nomeOuTelefone) {
        for (int i = 0; i < contatos.length; i++) {
            if ((contatos[i].getNome()).equals(nomeOuTelefone) || (contatos[i].getTelefone()).equals(nomeOuTelefone)) {
                IO.print(contatos[i]);
                return;
            }
        }
        IO.print("Contato não encontrado!");
    }

    public void atualizarContato (int indice, Contato contato) {
        if (verificarContato(contato)) {
            contatos[indice].setNome(contato.getNome());
            contatos[indice].setTelefone(contato.getTelefone());
            contatos[indice].setEmail(contato.getEmail());
            IO.println("Contato modificado!");
        } else {
            IO.println("Não é possível adicionar dados repetidos a um contato");
        }
    }

    public void atualizarContato (Contato contatoExistente, Contato contatoAtualizado) {
        for (int i = 0; i < contatos.length; i++) {
            if (contatos[i].equals(contatoExistente)) {
                contatos[i].setNome(contatoAtualizado.getNome());
                contatos[i].setTelefone(contatoAtualizado.getTelefone());
                contatos[i].setEmail(contatoAtualizado.getEmail());
                IO.println("Contato modificado!");
            }
        }
    }

    public void ListarTodosContatos() {
        IO.print("[");
        for (int i = 0; i < contatos.length; i++) {
            IO.print(contatos[i]);
            IO.print(",");
        }
        IO.println("]");
    }

    public void obterTamanhoAgenda() {
        IO.println(tamanho);
    }


}

