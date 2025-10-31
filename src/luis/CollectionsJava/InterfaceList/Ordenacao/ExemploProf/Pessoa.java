package luis.CollectionsJava.InterfaceList.Ordenacao.ExemploProf;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Pessoa" +
                " Nome = " + nome +","+
                " Idade= " + idade +","+
                " Altura =" + altura+",\n";
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade,p.getIdade());
    }
}
class ComparatorPorAltura implements Comparator<Pessoa> {
@Override
public int compare(Pessoa p1,Pessoa p2){
    return Double.compare(p1.getAltura(),p2.getAltura());
}

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Luis 1",19,1.70);
        ordenacaoPessoa.adicionarPessoa("Kymberlli",18,1.55);
        ordenacaoPessoa.adicionarPessoa("Lívia",19,1.60);
        ordenacaoPessoa.adicionarPessoa("Karine",3,1.10);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}