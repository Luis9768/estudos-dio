package luis.CollectionsJava.MapCollections.OperacoesBasicasMap.MInhasAtividades.ArmazemProdutos;

import java.util.HashMap;
import java.util.Map;

public class CatalogoPrecos {
    Map<String,Double> catalogoMap;

    public CatalogoPrecos() {
        this.catalogoMap = new HashMap<>();
    }
    public void adicionarProduto(String nome, Double preco){
        catalogoMap.put(nome,preco);
    }
    public void removerProduto(String nome){
        if(!catalogoMap.isEmpty()) {
            catalogoMap.remove(nome);
        }
    }
    public void exibirProdutos(){
        System.out.println(catalogoMap);
    }
    public Double pesquisarPorNome(String nome){
        Double pesquisaNome = null;
        if(!catalogoMap.isEmpty()) {
           pesquisaNome = catalogoMap.get(nome);
        }return pesquisaNome;
    }

    public static void main(String[] args) {
        CatalogoPrecos c = new CatalogoPrecos();
        c.adicionarProduto("Macarrão",3.50);
        c.adicionarProduto("Arroz",33.50);
        c.adicionarProduto("Feijão",24.50);
        c.adicionarProduto("Alface",4.50);
        c.adicionarProduto("Tomate",2.50);
        c.adicionarProduto("Frango",15.50);
        c.adicionarProduto("Molho de Tomate",3.50);
        System.out.println(">>>>>>>> Ofertas de hoje no Mercado <<<<<<<<<<<");
        c.exibirProdutos();
        System.out.println("-----------------------------------------------------------");
        System.out.println(">>>>>>>>>>> Pesquisa por Valor <<<<<<<<<<<<<<<<<<");
        System.out.println(c.pesquisarPorNome("Macarrão"));
        System.out.println(c.pesquisarPorNome("Tomate"));
        System.out.println(c.pesquisarPorNome("Frango"));
        System.out.println("-----------------------------------------------------------");
        System.out.println(">>>>>>>>>>>>> Remoção de Itens <<<<<<<<<<<<<<<");
        c.removerProduto("Alface");
        c.removerProduto("Molho de Tomate");
        c.exibirProdutos();


    }

}
