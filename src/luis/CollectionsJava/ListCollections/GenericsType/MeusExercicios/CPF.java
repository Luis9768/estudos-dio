package luis.CollectionsJava.ListCollections.GenericsType.MeusExercicios;

import java.util.HashSet;
import java.util.Set;

public class CPF {
    public static void main(String[] args) {
        //Numeros de CPFs adicionados como Long
        Set<Long> numerosCPF = new HashSet<>();
        numerosCPF.add(11125696345L);
        numerosCPF.add(41523678895L);
        numerosCPF.add(41112288874L);
        numerosCPF.add(41112288874L);

        //algo curioso o Set<Long> não imprime numeros repetidos
        for (Long leitorCpf: numerosCPF){
            System.out.println(leitorCpf);
        }


    }
}
