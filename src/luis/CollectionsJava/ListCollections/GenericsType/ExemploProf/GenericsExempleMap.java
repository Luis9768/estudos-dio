package luis.CollectionsJava.ListCollections.GenericsType.ExemploProf;

import java.util.HashMap;
import java.util.Map;

public class GenericsExempleMap {
    public static void main(String[] args) {

        //Exemplo sem generics
        Map mapaSemGenerics = new HashMap();
        mapaSemGenerics.put("Chave 1",10);
        mapaSemGenerics.put("Chave 2","valor");

        //Exemplo com generics
        Map<String,Integer>mapaGenerics = new HashMap<>();
        mapaSemGenerics.put("Chave 1",10);
        mapaSemGenerics.put("Chave 2",20);

        //Iterando sobre o mapa com Generics
        for(Map.Entry<String,Integer>entry:mapaGenerics.entrySet()){
            String chave = entry.getKey();
            int valor = entry.getValue();
            System.out.println("Chave: "+chave+", valor: "+valor);
        }
        for(Object obj:mapaSemGenerics.entrySet()){
            Map.Entry entry = (Map.Entry) obj;
            String chave = (String) entry.getKey();
            Object valor = entry.getValue();
            System.out.println("Chave: "+chave+", valor: "+valor);
        }
    }
}
