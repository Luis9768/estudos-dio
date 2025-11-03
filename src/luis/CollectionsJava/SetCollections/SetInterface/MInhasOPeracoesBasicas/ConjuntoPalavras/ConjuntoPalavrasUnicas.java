package luis.CollectionsJava.SetCollections.SetInterface.MInhasOPeracoesBasicas.ConjuntoPalavras;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<Palavras> palavrasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasSet = new HashSet<>();
    }

    public void adicionarPalavras(String palavra) {
        palavrasSet.add(new Palavras(palavra));
    }

    public void removerPalavra(String palavra) {
        Palavras removerPalavra = null;
        for (Palavras l : palavrasSet) {
            if (l.getPalavra().equalsIgnoreCase(palavra)) {
                removerPalavra = l;
                break;
            }
        }palavrasSet.remove(removerPalavra);

    }

    public String verificarPalavra(String palavra) {
        for(Palavras p: palavrasSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                return "A palavra "+p.getPalavra()+" está na lista.";
            }
        }return "Palavra não encontrada";
    }

    public void exibirPalavrasUnicas() {
        System.out.println(palavrasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavras("Carro");
        conjuntoPalavrasUnicas.adicionarPalavras("Vaca");
        conjuntoPalavrasUnicas.adicionarPalavras("Moto");
        conjuntoPalavrasUnicas.adicionarPalavras("Avião");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println("----------------------------------------------------------------------");

        conjuntoPalavrasUnicas.verificarPalavra("Voar");
        conjuntoPalavrasUnicas.verificarPalavra("Moto");
        conjuntoPalavrasUnicas.removerPalavra("Avião");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println("----------------------------------------------------------------------");

        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Carro"));
        conjuntoPalavrasUnicas.removerPalavra("Carro");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
        System.out.println(conjuntoPalavrasUnicas.verificarPalavra("Carro"));
        System.out.println("----------------------------------------------------------------------");


    }
}

