package luis.CollectionsJava.ListCollections.GenericsType.MeusExercicios;

import java.util.HashMap;
import java.util.Map;

public class AlunoNota {
    public static void main(String[] args) {
        Map<String,Double> nomeNotaAluno = new HashMap<>();
        nomeNotaAluno.put("Luis", 10.0);
        nomeNotaAluno.put("Maria",8.5);
        nomeNotaAluno.put("André",7.8);

        for(Map.Entry<String,Double>entry:nomeNotaAluno.entrySet()){
            System.out.println("O aluno(a) "+entry.getKey()+", tirou a nota: "+entry.getValue());
        }
    }
}
