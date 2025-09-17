package Candidatura.java;

import java.util.Random;
import java.util.Vector;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
    public static void main(String[] args) {
        String[] candidatos = {"Marcos", "André", "João", "Mariana", "Angela"};
        for(String candidato: candidatos){
            EntrandoEmContato(candidato);
        }
    }
    static void EntrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){tentativasRealizadas++;}
            else {System.out.println("Contato foi realizado com sucesso.");}
        }while (continuarTentando && tentativasRealizadas<3);
                if(atendeu){
                    System.out.println("CONSEHUIMOS CONTATO COM O CANDIDATO "+candidato+" NA "+tentativasRealizadas+" tentativa.");
                    System.out.println("Não conseguimos contato com o "+candidato+" numero de tentativas "+tentativasRealizadas);
                }
    }
    //metodo auxiliar para fazer o tanto de ligação random ser no maximo 3
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void ImprimirSlecionados() {
        String[] candidatos = {"Marcos", "André", "João", "Mariana", "Angela"};
        System.out.println("Imprimindo o indice de candidatos aguarde...");
        System.out.println("Indice pronto veja a lista abaixo");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de n°" + (indice + 1) + " é " + candidatos[indice]);
        }
        System.out.println("Agora veja a lista com for-each");
        for (String candidato:candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"Marcos", "André", "João", "Mariana", "Angela", "Rosa", "Antonia", "Fernanda", "Juliana", "Marcelina", "Juarez", "Marcelino", "Luís", "Felipe", "Matusalem", "Naftali"};
        int candidatosSelecionados = 0;
        int candidadoAtual = 0;
        double salarioBase = 2000.0;
        //enquanto candidatos selecionados não forem 5 no total o while continuara contando dentro do array
        while (candidatosSelecionados < 5 && candidadoAtual < candidatos.length) {
            String candidato = candidatos[candidadoAtual];
            //valor de salario pretendido com o metodo random
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou esse salário " + salarioPretendido);
            //Se o salarioBase for maior que o pretendido ele seleciona o candidato
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado");
                candidatosSelecionados++;
            }
            candidadoAtual++;
        }
    }
        //esse metodo aqui faz numeros randons de 1800 a 2000 e manda pra algum lugar
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2000.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA.");
        } else {
            System.out.println("AGUARDANDO OS RESULTADOS DOS DEMAIS CANDIDATOS.");
        }
    }
}
