package luis.CollectionsJava.ComparableComparator.ExemploProf;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------------------");
        ArrayList<Livro> livros = new ArrayList<>(
                List.of(
            new Livro("Java: Guia do Programador", "Peter Jandi Jr", 2020),
            new Livro("Desenvolvimento Real de Software", "Raoul-Gabriel Urma e Richard Warburton", 2021),
            new Livro("Microserviços Prontos Para Produção", "Susan J. Fowler", 2017),
            new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava", 2017),
            new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017),
            new Livro("Clean Code", "Robert C. Martin", 2008),
            new Livro("Effective Java", "Joshua Bloch", 2018),
            new Livro("Algoritmos: Teoria e Prática", "Thomas H. Cormen", 2009))
            );
        System.out.println("Livros após a ordenação natural (Titulo): ");
        Collections.sort(livros);
        for(Livro leitor: livros){
            System.out.println(leitor.getTitulo()+" - "+
                    leitor.getAutor()+" - "+
                    leitor.getAno());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Livros após a ordenação por ano: ");
        Collections.sort(livros, new CompararAno());
        for (Livro leitorAno : livros){
            System.out.println(leitorAno.getTitulo()+" - "+
                    leitorAno.getAutor()+" - "+
                    leitorAno.getAno());
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Livros após a ordenação por autor: ");
        Collections.sort(livros, new CompararAuthor());
        for (Livro leitorAno : livros){
            System.out.println(leitorAno.getTitulo()+" - "+
                    leitorAno.getAutor()+" - "+
                    leitorAno.getAno());
        }
        System.out.println("---------------------------------------------------------------------");



    }
}
