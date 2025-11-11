package luis.CollectionsJava.MapCollections.OrdenacaoMap.LivrariaOnline;

public class Livro {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, double preco, String autor) {
        this.titulo = titulo;
        this.preco = preco;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getPreco() {
        return preco;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Livro " +
                "titulo = " + titulo + '\'' +
                ", autor = " + autor + '\'' +
                ", preco = " + preco +"\n";
    }
}
