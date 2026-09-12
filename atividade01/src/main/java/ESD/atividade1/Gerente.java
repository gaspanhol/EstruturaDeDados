package ESD.atividade1;

public class Gerente extends Funcionario {

    public Gerente(String nome) {
        super(nome);
    }

    public void bonusGerente (int qtdFuncionarios) {
        this.bonus = (this.salarioBase * 0.01) * qtdFuncionarios;
        this.salario = salarioBase + bonus;
    }

    @Override
    public void bonusFinalizacao () {
        this.bonus += this.salarioBase * 0.10;
        this.salario = salarioBase + bonus;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
