package luis.CollectionsJava.InterfaceList.Ordenacao.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    private List<Item> carrinhoCompras;

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<CarrinhoCompras> itensParaRemover = new ArrayList<>();
        for (Item leitor : carrinhoCompras) {
            if (leitor.getNome().equalsIgnoreCase(nome)) {
                carrinhoCompras.removeAll(itensParaRemover);
            }
        }
        itensParaRemover.removeAll(itensParaRemover);
    }

    public double calculoTotalProdutos() {
        double valorTotal = 0d;
        for(Item leitor: carrinhoCompras){
            valorTotal += leitor.getPreco()*leitor.getQuantidade();
        }return valorTotal;
    }

    public void exibirItens(){
        for (Item leitor: carrinhoCompras){
            System.out.println("Nome: "+leitor.getNome()+"| Preço: "+leitor.getPreco()+"| Quantidade: "+leitor.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras1 = new CarrinhoCompras();
        carrinhoCompras1.adicionarItem("Salmão",78.00,2);
        carrinhoCompras1.adicionarItem("Salmão",78.00,2);
        carrinhoCompras1.adicionarItem("Salmão",78.00,2);
        carrinhoCompras1.adicionarItem("Filé de Peixe",23.00,3);
        carrinhoCompras1.adicionarItem("Arroz",50.00,4);
        carrinhoCompras1.removerItem("salmão");
        carrinhoCompras1.exibirItens();
        carrinhoCompras1.adicionarItem("Arroz",50.00,4);
        carrinhoCompras1.adicionarItem("Arroz",50.00,4);
        carrinhoCompras1.calculoTotalProdutos();

    }

}
