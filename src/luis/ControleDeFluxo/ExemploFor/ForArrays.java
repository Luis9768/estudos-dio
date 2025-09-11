package luis.ControleDeFluxo.ExemploFor;

public class ForArrays {
    public static void main(String[] args) {
        String[] nomes = {"Luis", "Bruna", "Sofia", "Catastor"};
        for(int i = 0; i < nomes.length; i++){
            System.out.println("O aluno no indice x="+i+" é "+nomes[i]);
        }
        for(String aluno: nomes){
            System.out.println("Nome do aluno é: "+nomes);
        }
    }
}
