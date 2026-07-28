package ESD.atividade1;

public class Funcionario{
    private String nome;
    private double salarioBase;
    protected double salario;

    public Funcionario(String nome) {
        this.nome = nome;
        this.salarioBase = SalarioBase.BASE.getValor();
        this.salario = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
