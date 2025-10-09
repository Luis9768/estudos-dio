package luis.FundamentosPooJava.GetersSeters.Mercado;

public class Produto {
    private String name;
    private double price;
    private int quantity;
    private String category;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int newQuantity) {
        quantity = newQuantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String newCategory) {
        category = newCategory;
    }
    public double apllyDiscount() {
        double discount = price - (price * 0.1);
        return discount;
    }
    public double calculateTotal() {
        double discount = price - (price * 0.1);
        double result = discount * quantity;
        return result;
    }



}
