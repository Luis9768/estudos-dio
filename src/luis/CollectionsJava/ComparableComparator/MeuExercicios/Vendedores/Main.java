package luis.CollectionsJava.ComparableComparator.MeuExercicios.Vendedores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vendedor> vendedor = new ArrayList<>(
                List.of(
                        new Vendedor("Luis Miguel", 19, 54.200),
                        new Vendedor("Vanessa", 18, 36.520),
                        new Vendedor("Claudio", 26, 48.500),
                        new Vendedor("Santiago", 37, 54.200),
                        new Vendedor("Cássia", 32, 40.000),
                        new Vendedor("Marcos",22,56000.54)
                )
        );
        System.out.println("---------------------------------------------------------------------");

        //leitura antes do coletions sort
        for (Vendedor leitor : vendedor) {
            System.out.printf("%s - %d - %.3f%n",
                    leitor.getNome(),
                    leitor.getIdade(),
                    leitor.getVendaMes());
        }
        System.out.println("---------------------------------------------------------------------");

        //com collections sort
        Collections.sort(vendedor);
        for (Vendedor leitor : vendedor) {
            System.out.printf("%s - %d - %.3f%n",
                    leitor.getNome(),
                    leitor.getIdade(),
                    leitor.getVendaMes());
        }
        System.out.println("---------------------------------------------------------------------");

/*
* Esse foi um exercício para exercitar comparable e Comparator. Esse código pega o método vendedor e joga
* em um ArrayList. A primeira parte apenas lista os valores do Array, já a segunda ela lista os
* valores por ordem de vendas e caso de empate ele faz com que o vendedores empatados sejam listados por
* ordem alfabetica.
*
* */

    }
}
