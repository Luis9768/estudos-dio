package luis.CollectionsJava.InterfaceList.Pesquisa.Livros;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivos(String nome, String autor, int anoPublicacao) {
        livrosList.add(new Livro(nome, autor, anoPublicacao));
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> intervaloDeAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livrosPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getNome().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                    break;
                }
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivos("Dom Casmurro", "Machado de Assis", 1899);
        c.adicionarLivos("O Pequeno Príncipe", "Antoine de Saint-Exupéry", 1943);
        c.adicionarLivos("1984", "George Orwell", 1949);
        c.adicionarLivos("O Hobbit", "J.R.R. Tolkien", 1937);
        c.adicionarLivos("A Revolução dos Bichos", "George Orwell", 1945);
        c.adicionarLivos("Cem Anos de Solidão", "Gabriel García Márquez", 1967);
        c.adicionarLivos("Harry Potter e a Pedra Filosofal", "J.K. Rowling", 1997);
        c.adicionarLivos("O Código Da Vinci", "Dan Brown", 2003);
        c.adicionarLivos("A Culpa é das Estrelas", "John Green", 2012);
        c.adicionarLivos("O Alquimista", "Paulo Coelho", 1988);
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(c.pesquisarPorTitulo("Harry Potter e a Pedra Filosofal"));
        System.out.println(c.pesquisarPorTitulo("A Revolução dos Bichos"));
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(c.intervaloDeAnos(1930,1950));
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(c.pesquisaPorAutor("Gabriel García Márquez"));
        System.out.println("----------------------------------------------------------------------------------------------");


    }

}

