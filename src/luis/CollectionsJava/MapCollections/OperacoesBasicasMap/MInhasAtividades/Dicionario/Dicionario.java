package luis.CollectionsJava.MapCollections.OperacoesBasicasMap.MInhasAtividades.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String,String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }
    public void adicionarPalavra(String palavra, String definicao){
        dicionarioMap.put(palavra,definicao);
    }
    public void removerPalavra(String palavra){
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }
    public void exibirPalavras(){
        System.out.println(dicionarioMap);
    }
    public String pesquisarPorPalavra(String palavra){
        String palavraPesquisada = null;
        if(!dicionarioMap.isEmpty()) {
            palavraPesquisada = dicionarioMap.get(palavra);
        }return palavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();
        d.adicionarPalavra("ler","leitura");
        d.adicionarPalavra("ler","decifrar escritura");
        d.adicionarPalavra("ler","pensar");
        d.adicionarPalavra("correr","elevação de velocidade");
        d.adicionarPalavra("carro","veiculo terrestre móvel");
        d.adicionarPalavra("Moto","veiculo terrestre móvel");
        System.out.println(">>>>>>>>>>>> Exibindo Palavras do Dicionario <<<<<<<<<");
        d.exibirPalavras();
        System.out.println("------------------------------------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>>> Pesquisa de Palavras <<<<<<<<<<<<<<<");
        System.out.println(d.pesquisarPorPalavra("ler"));
        System.out.println(d.pesquisarPorPalavra("carro"));
        System.out.println("------------------------------------------------------------------------");
        System.out.println(">>>>>>>>>>>>>>>>> Remoção de Palavras e Exibindo Palavras do dicionario <<<<<<<<<<<<<<<");
        d.removerPalavra("Moto");
        d.exibirPalavras();
    }
}
