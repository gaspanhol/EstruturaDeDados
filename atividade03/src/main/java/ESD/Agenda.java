package ESD;

public class Agenda {

    private Vetor<Contato>[] vetorPrincipal;

    public Agenda(int quantidade) {
        this.vetorPrincipal = (Vetor<Contato>[]) new Vetor[26];
        for (int i = 0; i < 26; i++) {
            vetorPrincipal[i] = new Vetor<>(quantidade);
        }
    }

    private int obterIndice(String nome) {
        char letraInicial = Character.toUpperCase(nome.charAt(0));
        return  letraInicial - 'A';
    }

    public boolean inserirContato (Contato contato) {
        int indiceAZ= obterIndice(contato.getNome());

        if (indiceAZ == -1) {
            IO.println("Nome inválido.");
            return false;
        }

        Vetor<Contato> vetorContato = this.vetorPrincipal[indiceAZ];

        if (vetorContato.contem(contato)) {
            IO.println("Contato ja existente");
            return false;
        }

        vetorContato.inserirOrdenado(contato);
        IO.println("Contato " +  contato.getNome() + " adicionado com sucesso na letra '" + contato.getNome().charAt(0) + "' (indice " + indiceAZ + ")!" );
        return true;

    }

    public boolean remover(String nome, String telefone) {
        int indiceAZ= obterIndice(nome);

        if (indiceAZ == -1) {
            IO.println("Nome inválido.");
            return false;
        }

        Vetor<Contato> vetorContato = this.vetorPrincipal[indiceAZ];

        for (int i = 0; i < vetorContato.obterTamanho(); i++) {
            Contato contato = vetorContato.ler(i);
            if (contato.getNome().equals(nome) && (contato.getTelefone().equals(telefone))) {
                vetorContato.remover(i);
                IO.println("Contato " +  contato.getNome() + " removido com sucesso do vetor '" + contato.getNome().charAt(0) + "'!\n" );
                return true;
            }
        }
        IO.println("Contato nao encontrado");
        return false;
    }

    public Contato buscarContato (String nome) {
        int indiceAZ= obterIndice(nome);

        if (indiceAZ == -1) {
            IO.println("Nome inválido.");
            return null;
        }

        Vetor<Contato> vetorContato = vetorPrincipal[indiceAZ];

        for (int i = 0; i < vetorContato.obterTamanho(); i++) {
            Contato contato = vetorContato.ler(i);
            if ((contato.getNome()).equals(nome)) {
                IO.println("Contato " +  contato.getNome() + " encontrado no Vetor '" + contato.getNome().charAt(0) + "': " +  contato.getNome() + ", Telefone: " + contato.getTelefone() + "\n" );
                return contato;
            }
        }
        IO.println("\n Contato não encontrado \n");
        return null;
    }

    public boolean atualizarContato (String nomeAtual, Contato contatoAtualizado) {
        int indiceAntigo= obterIndice(nomeAtual);

        if (indiceAntigo == -1) {
            IO.println("Nome inválido.");
            return false;
        }

        Vetor<Contato> vetorAntigo = vetorPrincipal[indiceAntigo];

        for (int i = 0; i < vetorAntigo.obterTamanho(); i++) {
            Contato contato = vetorAntigo.ler(i);
            if (contato.getNome().equals(nomeAtual)) {
                int novoIndice = obterIndice(contatoAtualizado.getNome());

                if (novoIndice == -1) {
                    IO.println("Novo nome inválido.");
                    return false;
                }

                vetorAntigo.remover(i);
                contato.setNome(contatoAtualizado.getNome());
                contato.setTelefone(contatoAtualizado.getTelefone());
                contato.setEmail(contatoAtualizado.getEmail());
                vetorPrincipal[novoIndice].inserirOrdenado(contato);
                IO.println("Contato " +  contato.getNome() + " atualizado com sucesso!\n" );
                return true;
            }
        }
        IO.println("Contato não encontrado.");
        return false;
    }

}
