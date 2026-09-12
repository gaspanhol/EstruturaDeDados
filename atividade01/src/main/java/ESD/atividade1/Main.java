package ESD.atividade1;

import java.util.ArrayList;

public class Main {
    static void main() {
        Projeto projeto1 = new Projeto("avião a jato", new Gerente("Jorge"), new ArrayList<>());

        IO.println(projeto1.toString());

        projeto1.adicionarFuncionarios(new Funcionario("Marcos"));
        projeto1.adicionarFuncionarios(new Funcionario("Lucas"));
        projeto1.adicionarFuncionarios(new Funcionario("Davi"));
        projeto1.adicionarFuncionarios(new Funcionario("Gustavo"));
        projeto1.adicionarFuncionarios(new Funcionario("Guilherme"));

        IO.println(projeto1.toString());

        projeto1.finalizarProjeto();

        IO.println(projeto1.toString());
    }
}
