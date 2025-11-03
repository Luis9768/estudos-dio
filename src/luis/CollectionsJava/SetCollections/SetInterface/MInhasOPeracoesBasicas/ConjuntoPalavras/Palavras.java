package luis.CollectionsJava.SetCollections.SetInterface.MInhasOPeracoesBasicas.ConjuntoPalavras;

import java.util.Objects;

public class Palavras {
    private String palavra;

    public Palavras(String palavra) {this.palavra = palavra;}
    public String getPalavra() {return palavra;}

    @Override
    public String toString() {
        return " Palavra =" + palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Palavras palavras = (Palavras) o;
        return Objects.equals(getPalavra(), palavras.getPalavra());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getPalavra());
    }
}
