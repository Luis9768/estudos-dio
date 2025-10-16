package luis.CollectionsJava.GenericsType.ExemploProf;
import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {
        // Exemplo sem Generics
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10); // Permite adicionar qualquer tipo de objeto

        // Exemplo com Generics
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        //Meu exemplo
        List<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(120);
        listaInteger.add(450);

        // Iterando sobre a lista com Generics
        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }
        for (Integer elemento : listaInteger) {
            System.out.println(elemento);
        }

        // Iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }

    }
}
