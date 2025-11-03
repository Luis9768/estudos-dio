package luis.CollectionsJava.ListCollections.InterfaceList.Ordenacao.MeuExercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaNumeros {
    private List<Integer> numList = new ArrayList<>();
    public OrdenacaNumeros(){
        this.numList = new ArrayList<>();
    }
    public void adicionarNumero(int numero) {
        numList.add(numero);
    }
    public List<Integer> ordenarAscendente(){
        numList = new ArrayList<>(this.numList);
        Collections.sort(numList);
        return numList;
    }
    public List<Integer> ordenarDescendente(){
        numList = new ArrayList<>(this.numList);
        Collections.sort(numList,Collections.reverseOrder());
        return numList;
    }
}