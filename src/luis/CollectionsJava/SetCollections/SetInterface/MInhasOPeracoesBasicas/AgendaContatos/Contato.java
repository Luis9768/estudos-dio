package luis.CollectionsJava.SetCollections.SetInterface.MInhasOPeracoesBasicas.AgendaContatos;

import java.util.Objects;

public class Contato {
    private String nome;
    private String numeroTelefone;

    public Contato(String nome, String numeroTelefone) {
        this.nome = nome;
        this.numeroTelefone = numeroTelefone;
    }

    public String getNome() {
        return nome;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getNome());
    }

    @Override
    public String toString() {
        return "Contato " +
                "Nome = " + nome + '\'' +
                ", Numero de Telefone = " + numeroTelefone + '\n';
    }
}
