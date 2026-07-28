package ESD.atividade1;

public class Gerente {
    private String nome;
    private double salarioBase;
    protected double salario;

    public Gerente(String nome) {
        this.nome = nome;
        this.salarioBase = SalarioBase.BASE.getValor();
        this.salario = salarioBase;
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
