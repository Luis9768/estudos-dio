package luis.luis.FundamentosPooJava.GetersSeters.Car;

public class TestCar {
    public static void main(String[] args) {
        CarDescription carro = new CarDescription();
        carro.setBrand("Toyota");
        carro.setModel("Corolla");
        carro.setYear(2018);
        carro.setPrice(75000.0);
        carro.carAge(2018);
        carro.applyDiscount(10);

        System.out.println("Brand: "+carro.getBrand()+
                "\nModel: "+carro.getModel()+
                "\nYear: "+carro.getYear()+
                "\nPrice: "+carro.getPrice()+
                "\nCar Age: "+carro.carAge(2025)+
                "\nPrice after discount: "+carro.applyDiscount(10));
    }
}
