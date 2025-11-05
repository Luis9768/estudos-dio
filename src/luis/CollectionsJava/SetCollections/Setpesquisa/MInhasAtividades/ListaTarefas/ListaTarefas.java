package luis.CollectionsJava.SetCollections.Setpesquisa.MInhasAtividades.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> listaTarefasSet = new HashSet<>();

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao, false);
        listaTarefasSet.add(tarefa);
    }

    public void removerTarefa(String descricao) {
        Tarefa removerTarefa = null;
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().startsWith(descricao)) {
                removerTarefa = t;
                break;
            }
        }
        listaTarefasSet.remove(removerTarefa);
    }

    public void exibirTarefas() {
        System.out.println(listaTarefasSet);
    }

    public void contarTarefas() {
        System.out.println(listaTarefasSet.size());
    }

    public Set<Tarefa> tarefasConcluidas() {
        Set<Tarefa> tarefasOk = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (t.isConcluido() == true) {
                tarefasOk.add(t);
            }
        }
        return tarefasOk;
    }

    public Set<Tarefa> tarefasPendentes() {
        Set<Tarefa> tarefasParaConcluir = new HashSet<>();
        for (Tarefa t : listaTarefasSet) {
            if (t.isConcluido() == false) {
                tarefasParaConcluir.add(t);
            }
        }
        return tarefasParaConcluir;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(true);
                break;
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        for (Tarefa t : listaTarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluido(false);
                break;
            }
        }
    }

    public void limparListaTarefas() {
        listaTarefasSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Comprar comida do Cachorro");
        listaTarefas.adicionarTarefa("Ver preço de memoria RAM");
        listaTarefas.adicionarTarefa("Acabar Atividade da DIO Java");
        listaTarefas.adicionarTarefa("Estudar Collections em Java");
        listaTarefas.adicionarTarefa("Atualizar currículo no LinkedIn");
        listaTarefas.adicionarTarefa("Praticar exercícios de C# do SENAI");
        listaTarefas.adicionarTarefa("Organizar repositórios no GitHub");
        listaTarefas.adicionarTarefa("Assistir aula de AWS Foundations");
        listaTarefas.adicionarTarefa("Criar README do projeto de estufa automática");
        listaTarefas.adicionarTarefa("Revisar lógica de programação e POO");
        System.out.println(">>>>>>>>>>>>>>>>>> Minha lista de Tarefas <<<<<<<<<<<<<<<<<<<");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Todas as tarefas");
        System.out.println("");
        listaTarefas.exibirTarefas();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Quantidade de Tarefas presentes na lista");
        listaTarefas.contarTarefas();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Tarefas Concluídas");
        listaTarefas.marcarTarefaConcluida("Comprar comida do Cachorro");
        listaTarefas.marcarTarefaConcluida("Acabar Atividade da DIO Java");
        listaTarefas.marcarTarefaConcluida("Assistir aula de AWS Foundations");
        listaTarefas.marcarTarefaConcluida("Atualizar currículo no LinkedIn");
        System.out.println(listaTarefas.tarefasConcluidas());
        System.out.println("--------------------------------------------------------------");
        System.out.println("Tarefas Pendetes");
        listaTarefas.marcarTarefaPendente("Comprar comida do Cachorro");
        System.out.println(listaTarefas.tarefasPendentes());
        System.out.println("--------------------------------------------------------------");
    }


}

