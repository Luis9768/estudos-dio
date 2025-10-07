package luis.luis.FundamentosPooJava.GetersSeters.Mercado;

public class TestProduct {
    public static void main(String[] args) {
        Produto note = new Produto();
        note.setName("Acer Aspire 5");
        note.setCategory("Electronics");
        note.setPrice(2890.0);
        note.setQuantity(5);
        note.apllyDiscount();
        note.calculateTotal();

        System.out.println(" Product: "+note.getName()+
        "\n Category: "+note.getCategory()+
        "\n Original Price: "+note.getPrice()+
        "\n Quantity: "+note.getQuantity()+
        "\n Price after discount: "+note.apllyDiscount()+
        "\n Total stock value: "+note.calculateTotal());
    }
}
