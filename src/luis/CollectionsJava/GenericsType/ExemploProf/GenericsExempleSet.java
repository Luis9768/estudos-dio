package luis.CollectionsJava.GenericsType.ExemploProf;

import java.util.HashSet;
import java.util.Set;

public class GenericsExempleSet {
    public static void main(String[] args) {
        //Exemplo sem Generics
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemnto 1");
        conjuntoSemGenerics.add(10);

        //Exemplo com Generics
        Set<String>conjuntoComGenerics = new HashSet<>();
        conjuntoComGenerics.add("Elemento 1");
        conjuntoComGenerics.add("Elemento 2");

        //Iterando sobre o conjunto com generics
        for(String elemento:conjuntoComGenerics){
            System.out.println(elemento);
        }

        //Iterando sobre o conjunto sem Generics (necessario fazer cast)
        for(Object elemento:conjuntoSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}
