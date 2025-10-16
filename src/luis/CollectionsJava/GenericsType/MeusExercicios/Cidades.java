package luis.CollectionsJava.GenericsType.MeusExercicios;

import java.util.ArrayList;
import java.util.List;

public class Cidades {
    public static void main(String[] args) {

        //Aqui é um array com nome de cidades focado apenas em
        //Strings ele so aceita String vou adicionar um numero
        //e vc verá um erro de compilação
        List<String>nomeCidades = new ArrayList<>();
        nomeCidades.add("Capitão Enéas");
        nomeCidades.add("Montes Claros");
        nomeCidades.add("Santo André");
        //nomeCidades.add(1426);


        // Essa lista de numero aceita apenas numeros
        //se colocar Strings ela trava
        List<Integer>numeros = new ArrayList<>();
        numeros.add(456631);
        numeros.add(4553332);
        numeros.add(7444441);
        //numeros.add("String");

        //Isso aqui é uma mesclagem sem declaração de Integer
        // e String ou seja no for each vc declara como OBJECT
        List nomeCidadesG = new ArrayList();
        nomeCidadesG.add("Filianopolis");
        nomeCidadesG.add(10);
        nomeCidadesG.add(52);

        //For eachs para ler oa arrays

        for(String leitorElementos: nomeCidades){
            System.out.println(leitorElementos);
        }
        for(Integer leitorNumeros: numeros){
            System.out.println(leitorNumeros);
        }

        for (Object leitor:nomeCidadesG){
            System.out.println(leitor);
        }

    }
}
