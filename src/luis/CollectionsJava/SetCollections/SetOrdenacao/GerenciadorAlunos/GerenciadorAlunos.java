package luis.CollectionsJava.SetCollections.SetOrdenacao.GerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    private Set<Aluno> alunoSet = new HashSet<>(); //instancia o set Aluno

    public void adicionarAluno(String nome, int matricula, double media)    // metodo para adicionar alunos.
    {
        alunoSet.add(new Aluno(nome,matricula,media));      //adiciona alunos com nome, matricula e nota.
    }
    public void removerAluno(int matricula){
        alunoSet.removeIf(a -> a.getMatricula() == matricula );
        //no Set tem um comando que faz vc não
        //precisar de um for removeIf(cria a -> puxa um construtor get do que vc quer = a variavel do metodo
    }
    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet); //instancia TreesSet para nova ordenação
        return alunosPorNome; //retorno
    }
    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new AlunosPorNota());  //nova intancia por notas
        alunosPorNota.addAll(alunoSet);     //pega o alunosSet e coloca dentro de um metodo
        return alunosPorNota;       //retorna
    }
    public void exibirAlunos(){
        System.out.println(alunoSet);   //imprime
    }

    public static void main(String[] args) {
        GerenciadorAlunos g = new GerenciadorAlunos();

        g.adicionarAluno("Luis",1234,8.5);
        g.adicionarAluno("Marcos",1235,6.5);
        g.adicionarAluno("Ester",1236,7.0);
        g.adicionarAluno("Lucas",1237,9.5);
        g.adicionarAluno("André",1238,10.0);
        System.out.println(">>>>>>>Alunos do 1° Ano<<<<<<<<<");
        g.exibirAlunos();
        System.out.println("------------------------------------------------------");
        System.out.println(">>>>>>>>>>> Exibindo Alunos por Nome <<<<<<<<<<");
        System.out.println(g.exibirAlunosPorNome());
        System.out.println("------------------------------------------------------");
        System.out.println(">>>>>>>>>>> Exibindo alunos por Nota <<<<<<<<<<<<<<<");
        System.out.println(g.exibirAlunosPorNota());

        System.out.println(">>>>>>>>>>>>> Removendo 2 Alunos <<<<<<<<<<<<<<");
        g.removerAluno(1235);
        g.removerAluno(1237);
        g.exibirAlunos();

    }


}
