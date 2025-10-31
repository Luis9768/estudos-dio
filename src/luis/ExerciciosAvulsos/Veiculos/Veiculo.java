package luis.ExerciciosAvulsos.Veiculos;

public abstract class Veiculo {
    private String modelo;
    private int ano;

    public Veiculo(String modeloA, int anoA) {
        this.modelo = modeloA;
        this.ano = anoA;
    }

    public abstract double calcularRevisao();

    public void exibirResumo(){
        System.out.println("Modelo: " + modelo + " Ano: " + ano);
    }
}
