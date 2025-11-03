package luis.CollectionsJava.ListCollections.InterfaceList.Ordenacao.ExemploProf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    //atributo
    private List<Pessoa> pessoaList;    //declaração da lista referente a classe dos atributos


    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();    //criação da ordenação sendo uma nova lista
    }
    // adicionar pessoa na lista
    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList); //criação da nova lista por idade
        Collections.sort(pessoaPorIdade);   //collections e comparação por idade menor para a maior
        return pessoaPorIdade;  //retorna pessoaPorIdade
    }
    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList); //nova lista por altura menor para o maior
        Collections.sort(pessoaPorAltura,new ComparatorPorAltura()); //usa o comparador de pessoa pra usar como referencia no metodo
        return pessoaPorAltura; //retorna por altura
    }
}
