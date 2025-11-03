package luis.CollectionsJava.ListCollections.ComparableComparator.MeuExercicios.AnoCarro;

public class Carro {
    private String nome;
    private String marca;
    private int anoFabricacao;
    private double preco;
    private double kilometragem;

    //Instanciando o carro
    public Carro(String no, String mar, int anoF, double pre, double km) {
        this.nome = no;
        this.marca = mar;
        this.anoFabricacao = anoF;
        this.preco = pre;
        this.kilometragem = km;
    }

    //metodos getters
    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public double getPreco() {
        return preco;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    //iniciando as tratativas do compareTo
    public int compareTo(Carro c) {          // meteodo para comparar
        int comparacaoAno = Integer.compare(c.anoFabricacao, this.anoFabricacao);//variavel para guardar a comparação pelo ano de fabricação
        if (comparacaoAno == 0)//se for igual a 0...
        {
            comparacaoAno = this.nome.compareTo(c.getNome());//a comaração é realizada pelo nome em ordem alfabetica...
        }
        return comparacaoAno;//e retorna a comparação
    }

}
