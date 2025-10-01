package luis.Desafios.DesafioConcessionaria;

public class CaracteristicasDoVeiculo {
    String marcaDoCarro;
    int anoDeFabricacao;
    String nomeDoCarro;
    String tipoDoCarro;//SEDAN,SUV,PICKUP,HATCH
    double motorDoCarro;//1.0, 1.4, 2.0, 3.0, 4.8 e etc...
    int quantidadeDePortas;//2 ou 4
    int quantidadeDeLugares;
    float valorDoVeiculo;

    public void exibirOferta() {
        System.out.println("Oferta do dia: " + marcaDoCarro + " " + nomeDoCarro +
                ", motor " + motorDoCarro + ", " + quantidadeDePortas + " portas, " +
                quantidadeDeLugares + " lugares, por apenas R$" + valorDoVeiculo +
                ". Não perca essa oportunidade!!!");
    }
}


