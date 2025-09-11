package luis.ControleDeFluxo.CondicaoTernaria;

public class NotasEscolares {
    public static void main(String[] args) {
        int nota = 10;
        String resultado = nota >= 7? "Aprovado": nota>= 5 && nota<= 6? "Recuperação": "Reprovado";
        System.out.println(resultado);
    }
}
