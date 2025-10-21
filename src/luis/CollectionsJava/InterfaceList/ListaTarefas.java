package luis.CollectionsJava.InterfaceList;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    //ATRIBUTO
    private List<Tarefas> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao){
        tarefasList.add(new Tarefas(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for(Tarefas removedor: tarefasList){
            if (removedor.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(removedor);
            }
        }tarefasList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return tarefasList.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefa = new ListaTarefas();
        System.out.println("O número total de Tarefas é: "+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O número total de Tarefas é: "+listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();

    }
}
