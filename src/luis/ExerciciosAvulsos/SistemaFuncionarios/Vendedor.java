package luis.ExerciciosAvulsos.SistemaFuncionarios;

import luis.ExerciciosAvulsos.Veiculos.Veiculo;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, double salarioBase){
        super(nome, salarioBase);
    }

    public double calcularSalario(){
        return getSalarioBase()*1.2;
    }
}
