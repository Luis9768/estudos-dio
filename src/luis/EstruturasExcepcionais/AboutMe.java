package luis.EstruturasExcepcionais;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class AboutMe {
    public static void main(String[] args) {
        try {


            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.nextLine();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.nextLine();

            System.out.println("DIgite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //IMPRIMIR TUDO CONCATENADO

            System.out.println("Olá " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("Sua idade é: " + idade);
            System.out.println("E sua altura é: " + altura);
        }catch (InputMismatchException e){ System.out.println("Os campos idade e altura precisam ser númericos.");}
    }
}

