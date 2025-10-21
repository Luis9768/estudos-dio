package luis.CollectionsJava.ComparableComparator.MeuExercicios.AnoCarro;

public class Carro {
    private String nome;
    private String marca;
    private int anoFabricacao;
    private double preco;
    private double kilometragem;


    public Carro (String no, String mar, int anoF, double pre, double km) {
        this.nome = no;
        this.marca = mar;
        this.anoFabricacao = anoF;
        this.preco = pre;
        this.kilometragem = km;
    }
    public int compareTo(Carro c){
        int comparacaoAno = Integer.compare(c.anoFabricacao,this.anoFabricacao);
        if(comparacaoAno == 0)
        {
            comparacaoAno = this.nome.compareTo(c.getNome());
        }return comparacaoAno;
    }
    public String getNome(){return nome;}
    public String getMarca(){return marca;}
    public int getAnoFabricacao(){return anoFabricacao;}
    public double getPreco(){return preco;}
    public double getKilometragem(){return kilometragem;}

}
