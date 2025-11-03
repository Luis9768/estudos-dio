package luis.CollectionsJava.ListCollections.ComparableComparator.MeuExercicios.Vendedores;

class Vendedor implements Comparable<Vendedor> {
    private String nome;
    private int idade;
    private double vendaMes;

    //Metodo construtor
    public Vendedor(String no, int ida, double vms) {
        this.nome = no;
        this.idade = ida;
        this.vendaMes = vms;
    }

    //metodos Getter
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getVendaMes() {
        return vendaMes;
    }

    //iniciando compareTo
    public int compareTo(Vendedor v) {//metodo para comparar
        int resultadoVendasMes = Double.compare(v.getVendaMes(), this.vendaMes);//faz a comparação por quantidade de vendas e lista do maior para o menor
        if (resultadoVendasMes == 0) {//se o resultado de vendas do mes for 0...
            resultadoVendasMes = this.nome.compareTo(v.getNome());//ele ira lista por ordem alfabetica
        }
        return resultadoVendasMes;// e ira retornar resultadoVendasMes
    }


}
