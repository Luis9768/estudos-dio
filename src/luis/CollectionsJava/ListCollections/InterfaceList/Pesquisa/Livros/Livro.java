package luis.CollectionsJava.ListCollections.InterfaceList.Pesquisa.Livros;

public class Livro {
    private String nome;
    private String autor;
    private int anoPublicacao;

    public Livro(String nome, String autor, int anoPublicacao) {
        this.nome = nome;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString() {
        return "\nNome " + nome + " - " +
                "Autor " + autor + " - " +
                "AnoPublicacao " + anoPublicacao;
    }
}
