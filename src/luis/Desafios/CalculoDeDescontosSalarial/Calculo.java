package luis.Desafios.CalculoDeDescontosSalarial;

import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do seu salário: ");
        float valorSalarioBruto = scanner.nextFloat();
        System.out.println("Digite o valor dos seus beneficios: ");
        float valorBeneficios = scanner.nextFloat();
        float valorImposto;

        if (valorSalarioBruto <= 0 && valorSalarioBruto >= 1100.0) {
            valorImposto = 0.5f * valorSalarioBruto;
            System.out.println("Como você tem um salário de até R$ 1.100,00, seu desconto é de 5%");
            System.out.println("Valor desconto: "+valorImposto);
        } else if (valorSalarioBruto >= 1100.1 && valorSalarioBruto <= 2500.0) {
            valorImposto = 0.10f * valorSalarioBruto;
            System.out.println("Como você tem um salário entre R$ 1.100,00 e 2.500,00, seu desconto é de 10%");
            System.out.println("Valor desconto: "+valorImposto);
        } else {
            valorImposto = 0.15f * valorSalarioBruto;
            System.out.println("Como seu salário é acima de 2.500,00, seu desconto é de 15% " + valorImposto);
            System.out.println("Valor desconto: "+valorImposto);
        }
        float saida = (valorSalarioBruto - valorImposto) + valorBeneficios;
        System.out.printf("O valor do salário com beneficios é %.2f", saida);
    }
}
