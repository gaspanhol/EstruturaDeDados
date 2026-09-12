package ESD.atividade1;

public class Funcionario{
    protected String nome;
    protected double salarioBase;
    protected double salario;
    protected double bonus;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioBase = SalarioBase.BASE.getValor();
        this.salario = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalario() {return salario;}

    public double getBonus() {
        return bonus;
    }

    public void bonusFinalizacao () {
        this.bonus = this.salarioBase * 0.10;
        this.salario = salarioBase +  bonus;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
