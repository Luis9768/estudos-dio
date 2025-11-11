package luis.CollectionsJava.MapCollections.OrdenacaoMap.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livroMap = new HashMap<>();

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livroMap.put(link, new Livro(titulo, preco, autor));
    }

    public void removerLivro(String titulo) {
        livroMap.remove(titulo);
    }

    public void exibirLivrosOrdenadosPorPreco() {
        ArrayList<Livro> livrosExibicao = new ArrayList<>(livroMap.values());
        System.out.println(livrosExibicao);
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor) {
        List<Livro> pesquisaAutor = new ArrayList<>();
        for (Livro l : livroMap.values()) {
            if (l.getAutor().equalsIgnoreCase(autor)) {
                pesquisaAutor.add(l);
            }
        }
        return pesquisaAutor;

    }

    public List<Livro> pesquisarLivrosPorTitulo(String tiulo) {
        ArrayList<Livro> pesquisaTitulo = new ArrayList<>();
        for (Livro l : livroMap.values()) {
            if (l.getTitulo().equalsIgnoreCase(tiulo)) {
                pesquisaTitulo.add(l);
            }
        }
        return pesquisaTitulo;
    }

    public Livro obterLivroMaisCaro() {
        Livro pesquisaMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        for (Livro l : livroMap.values()) {
            if (l.getPreco() > maiorPreco) {
                maiorPreco = l.getPreco();
                pesquisaMaisCaro = l;
            }
        }
        return pesquisaMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro pesquisaMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Livro l : livroMap.values()) {
            if (l.getPreco() < menorPreco) {
                menorPreco = l.getPreco();
                pesquisaMaisBarato = l;
            }
        }
        return pesquisaMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline l = new LivrariaOnline();
        // Sintaxe: l.adicionarLivro("link-unico-string", "Titulo", "Autor", preco_double);
        l.adicionarLivro("https://amzn.to/3Z0aTjR", "O Hobbit", "J.R.R. Tolkien", 59.90);
        l.adicionarLivro("https://amzn.to/3Z1bUjS", "A Guerra dos Tronos", "George R.R. Martin", 89.90);
        l.adicionarLivro("https://amzn.to/3Z2cUjT", "1984", "George Orwell", 35.00);
        l.adicionarLivro("https://amzn.to/3Z3dVkU", "Harry Potter e a Pedra Filosofal", "J.K. Rowling", 45.00);
        l.adicionarLivro("https://amzn.to/3Z4eWlV", "Código Limpo", "Robert C. Martin", 110.00);
        l.adicionarLivro("https://amzn.to/3Z5fYmW", "O Senhor dos Anéis: A Sociedade do Anel", "J.R.R. Tolkien", 79.90);
        l.adicionarLivro("https://amzn.to/3Z6gZnX", "A Fúria dos Reis", "George R.R. Martin", 95.50);
        l.adicionarLivro("https://amzn.to/3Z7hAoY", "Harry Potter e a Câmara Secreta", "J.K. Rowling", 49.90);
        l.adicionarLivro("https://amzn.to/3Z8iBpZ", "O Programador Pragmático", "Andrew Hunt", 135.00);
        l.adicionarLivro("https://amzn.to/3Z9jCqA", "A Revolução dos Bichos", "George Orwell", 29.90);
        System.out.println(">>>>>>> Exibindo Livro mais barato <<<<<<<<");
        System.out.println(l.exibirLivroMaisBarato());
        System.out.println(">>>>>>> Exibindo Livro mais caro <<<<<<<<");
        System.out.println(l.obterLivroMaisCaro());
        System.out.println(">>>>>>> Pesquisa por Titulo <<<<<<<<<<");
        System.out.println(l.pesquisarLivrosPorTitulo("O Hobbit"));
        System.out.println(">>>>>>>> Pesquisa por Autor <<<<<<<<<<<");
        System.out.println(l.pesquisarLivrosPorAutor("J.R.R. Tolkien"));
        System.out.println(">>>>>>>>> Pesquisa ordenada por preço <<<<<<<<<<<");
        l.exibirLivrosOrdenadosPorPreco();
    }

}
