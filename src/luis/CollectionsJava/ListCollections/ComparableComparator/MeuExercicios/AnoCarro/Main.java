package luis.CollectionsJava.ListCollections.ComparableComparator.MeuExercicios.AnoCarro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Carro> carros = new ArrayList<>(
                List.of(
                        new Carro("Camaro","Chevrolet",2023,278.000,78.000),
                        new Carro("Camaro", "Chevrolet", 2023, 278000.0, 78000.0), // Seu primeiro carro (corrigido o ponto)
                        new Carro("Onix Plus", "Chevrolet", 2022, 95000.0, 35000.0),
                        new Carro("Golf GTI", "Volkswagen", 2020, 150000.0, 45000.0),
                        new Carro("HR-V EX", "Honda", 2024, 130000.0, 5000.0),
                        new Carro("Corolla XEi", "Toyota", 2021, 140000.0, 55000.0),
                        new Carro("Toro Freedom", "Fiat", 2019, 110000.0, 80000.0),
                        new Carro("Renegade", "Jeep", 2020, 105000.0, 60000.0),
                        new Carro("Kwid", "Renault", 2023, 65000.0, 10000.0),
                        new Carro("Fusion SEL", "Ford", 2018, 90000.0, 95000.0)
                )
        );
        for (Carro leitor: carros){
            double desconto = leitor.getPreco() - (leitor.getPreco()*0.10);
            System.out.println(leitor.getNome()+" - "+leitor.getMarca()+" - "+leitor.getAnoFabricacao()+" - "+
                    leitor.getPreco()+" - "+leitor.getKilometragem()+"desconto = "+desconto);
        }
    }
}
