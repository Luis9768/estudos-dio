package luis.ExerciciosAvulsos.Veiculos;

public class Carro extends Veiculo {

    public Carro(String modeloA, int anoA) {
        super(modeloA, anoA);
    }
    @Override
    public double calcularRevisao() {
        return 500.0;

    }
}
