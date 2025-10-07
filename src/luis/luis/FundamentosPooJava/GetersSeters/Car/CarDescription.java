package luis.luis.FundamentosPooJava.GetersSeters.Car;

public class CarDescription {
    private String brand;
    private String model;
    private int year;
    private double price;

    public String getBrand(){return brand;}
    public void setBrand(String newBrand){brand=newBrand;}

    public String getModel(){return model;}
    public void setModel(String newModel){model = newModel;}

    public int getYear(){return year;}
    public void setYear(int newYear){year = newYear;}

    public double getPrice(){return price;}
    public void setPrice(double newPrice){price = newPrice;}

    public int carAge(int currentYear) {
        currentYear =  currentYear - year;
        return currentYear;
    }
    public double applyDiscount(double percentage){
        price = price - (price * percentage / 100);
        return price;    }
}
