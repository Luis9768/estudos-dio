package luis.ExerciciosAvulsos.SistemaFuncionarios;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public double getSalarioBase() {
        return salarioBase;
    }

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();

    public void exibirResumo(){
        System.out.println("Nome: "+nome+" Salario Base: "+salarioBase);
    }

}
