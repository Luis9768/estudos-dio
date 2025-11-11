package luis.CollectionsJava.MapCollections.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String,Integer> contagemPalavrasMap;

    public ContagemPalavras() {
        this.contagemPalavrasMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavrasMap.put(palavra,contagem);
    }
    public void removerPalavra(String palavra){
        if (!contagemPalavrasMap.isEmpty()){
            contagemPalavrasMap.remove(palavra);
        }
    }
    public void exibirContagemPalavras() {
        if (!contagemPalavrasMap.isEmpty()) {
            System.out.println(contagemPalavrasMap);
        }
    }
    public String encontrarPalavraMaisFrequente(){
        String palavraMaisFrequente = null;
        int maiorContagem = Integer.MIN_VALUE;
        if(!contagemPalavrasMap.isEmpty()){
            for(Map.Entry<String, Integer> entry : contagemPalavrasMap.entrySet()){
                if (entry.getValue() > maiorContagem){
                    maiorContagem = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }else {return "Nenhuma palavra encontrada na lista";
        }return "A palavra mais frequente é "+ palavraMaisFrequente +" com "+ maiorContagem + " ocorrências.";
    }

    public static void main(String[] args) {
        ContagemPalavras c = new ContagemPalavras();
        c.adicionarPalavra("Carro",1);
        c.adicionarPalavra("Caminhão",2);
        c.adicionarPalavra("Carreta",3);
        c.adicionarPalavra("Bitrem",4);
        c.exibirContagemPalavras();
        System.out.println(c.encontrarPalavraMaisFrequente());
        c.removerPalavra("Carro");
        c.exibirContagemPalavras();
    }
}
