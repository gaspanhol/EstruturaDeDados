package ESD.atividade1;

import java.util.ArrayList;

public class Projeto {
    private String nomeProjeto;
    private Gerente gerente;
    private ArrayList<Funcionario> funcionarios;
    private double custoTotalequipe;

    public Projeto(String nomeProjeto, Gerente gerente, ArrayList<Funcionario> funcionarios) {
        this.nomeProjeto = nomeProjeto;
        this.gerente = gerente;
        this.funcionarios = funcionarios;
    }

    public double getSalarioFinalGerente () {
        this.gerente.salario += (gerente.getSalarioBase()*0.01)*funcionarios.size();
        return gerente.salario;
    }

    public double getSalarioFinalEquipe () {
        double salarioFinalEquipe = 0;
        for (Funcionario f : funcionarios) {
            custoTotalequipe += f.getSalarioBase();
            salarioFinalEquipe = custoTotalequipe + f.getSalarioBase();
        }
        return salarioFinalEquipe;
    }

    public void adicionarFuncionarios (Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void finalizarProjeto () {
        this.gerente.salario += gerente.getSalarioBase()*0.10;
        for (Funcionario f : funcionarios) {
            f.salario += f.getSalarioBase()*0.10;
            custoTotalequipe += f.getSalarioBase()*0.10;
        }
    }

    @Override
    public String toString() {
        return "nomeProjeto = " + nomeProjeto + "\n" +
                "Gerente = " + getSalarioFinalGerente() + "\n" +
                "Funcionarios = " + funcionarios.toString() + "\n" +
                "Custo total do projeto = " + (getSalarioFinalGerente() + getSalarioFinalEquipe())
                ;
    }
}
