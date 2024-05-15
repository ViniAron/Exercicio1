class Lider extends Funcionario {
    public Lider(String nome, double valorHora, int horasTrabalhadas) {
        super(nome, valorHora, horasTrabalhadas);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.02; // Incremento de 2%
    }
}
