package ESD.atividade1;

import java.util.ArrayList;

public class Projeto {
    private String nomeProjeto;
    private Gerente gerente;
    private ArrayList<Funcionario> funcionarios;
    private double custoTotalequipe;
    private boolean projetoAtivo = true;

    public Projeto(String nomeProjeto, Gerente gerente, ArrayList<Funcionario> funcionarios) {
        this.nomeProjeto = nomeProjeto;
        this.gerente = gerente;
        this.funcionarios = funcionarios;
        gerente.bonusGerente(funcionarios.size());
    }

    public double getSalarioGerente () {
        return gerente.salario;
    }

    public double getSalarioEquipe () {
        return custoTotalequipe;
    }

    public void adicionarFuncionarios (Funcionario funcionario) {
        if (projetoAtivo) {
            funcionarios.add(funcionario);
            gerente.bonusGerente(funcionarios.size());
            custoTotalequipe += funcionario.getSalario();
        }
    }

    public void finalizarProjeto () {
        if (projetoAtivo) {
            gerente.bonusFinalizacao();
            for (Funcionario f : funcionarios) {
                f.bonusFinalizacao();
                custoTotalequipe += f.getBonus();
            }
            projetoAtivo = false;
        }

    }

    @Override
    public String toString() {
        return  "==========================================" + "\n" +
                "nomeProjeto = " + nomeProjeto + "\n" +
                "Gerente = " + getSalarioGerente() + "\n" +
                "Funcionarios = " + funcionarios.toString() + "\n" +
                "Custo total do projeto = " + (getSalarioGerente() + getSalarioEquipe())
                ;
    }
}
