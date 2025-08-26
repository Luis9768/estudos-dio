package luis.operadores;

import java.util.Date;

public class Operadores {
    public static void main (String[] args) {
        //operador de atribuição =
        String name = "Luis";
        int idade = 19;
        double peso = 79.5;
        char sexo = 'M';
        boolean doadorOrgaos = false;
        Date dataNascimento = new Date();

        // operadores + / * -
        double soma = 15.5 + 18.6;
        int multiplicacao = 45 * 2;
        int divisão = 92/2;
        int subtracao = 78 - 69;
        int modulo = 18 % 9;
        double somaMultiplicacaoDivisao = (8 * 6) + (95 / 5);
        String nome = "Luis";
        String sobrenome = "Miguel";

        //concatenação de Strings com números
        String concatenacao = "?";
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //operadores unarios

        //como deixar um numero negativo
        int numero = 5;
        numero = -numero;
        System.out.println(numero);
        //como fazer ele voltar ser positivo
        numero = numero * -1;
        System.out.println(numero);

        //ternario
        //String
        var a = 5;
        var b = 6;
        String resultado1 = a==b? "verdadeiro": "falso";
        System.out.println(resultado1);
        //outro jeito que tambem funciona
        String resultado2;
        resultado2 = a==b? "verdadeiro": "falso";
        System.out.println(resultado2);

        //int
        int x = 5;
        int y = 6;
        int resultadoNum = x==y? 1 : 0;
        System.out.println(resultadoNum);

        //relacionais
        // basicamente aqui vc faz a concatenação para ver se um boolean é vdd ou falso fazendo com que variaveis sejam comparadas
        // se são iguais dentro de uma variavel boolean e com isso aparecera true or false.
        int numeroUm = 1;
        int numeroDois = 2;
        if (numeroUm < numeroDois)
        {System.out.println("A nossa condição é verdadeira");}

        boolean simNao = numeroUm == numeroDois;
        System.out.println("O numeroUm é igual ao numeroDois? " + simNao);

        simNao = numeroUm != numeroDois;
        System.out.println("O numeroUm é diferente ao numeroDois? " + simNao);

        simNao = numeroUm <= numeroDois;
        System.out.println("O numeroUm é menor ao numeroDois? " + simNao);

        simNao = numeroUm >= numeroDois;
        System.out.println("O numeroUm é maior ao numeroDois? " + simNao);

        //comparacao com strings
        String nomeUm = "Luis";
        String nomeDois = "Luis";
        System.out.println(nomeUm == nomeDois);
        //jeito mais inteligente e mais usado
        System.out.println(nomeUm.equals(nomeDois));



    }
}