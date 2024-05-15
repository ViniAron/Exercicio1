public class Main {
    public static void main(String[] args) {
        Funcionario peao = new Funcionario("João", 10.0, 160);
        Lider lider = new Lider("Maria", 15.0, 160);
        Gerente gerente = new Gerente("José", 20.0, 160);

        System.out.println("Salário de " + peao.getNome() + ": R$" + peao.calcularSalario());
        System.out.println("Salário de " + lider.getNome() + ": R$" + lider.calcularSalario());
        System.out.println("Salário de " + gerente.getNome() + ": R$" + gerente.calcularSalario());
    }
}