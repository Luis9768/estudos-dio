package luis.DenuggingJava;

import java.util.Scanner;
import static java.lang.System.out;
public class MediaTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos= {"Pedro","Luís","Julia","Mariana"};
        double media = calcularMediaDaTurma(alunos,scanner);
        out.printf("Média da turma %.1f", media);
    }
    public static double calcularMediaDaTurma(String[] alunos,Scanner scanner){
        double soma = 0;
        for(String aluno:alunos){
            out.printf("Nota do aluno: %s", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
