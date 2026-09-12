package ESD.atividade1;

public enum SalarioBase {
    BASE(2000);

    private double valor;

    SalarioBase(double valor) {
        this.valor=valor;
    }

    public double getValor() {
        return valor;
    }
}
