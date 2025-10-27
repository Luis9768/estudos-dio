package luis.CollectionsJava.InterfaceList.Pesquisa.Numeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Nova lista Integer
    private List<Integer> numList = new ArrayList<>();

    // Construtor correto: apenas inicializa a lista de números (Integer)
    public SomaNumeros() {
        //this na nova lista pra ela receber o somaNumeros
        this.numList = new ArrayList<>();
    }

    //void pq ele nao retorna nada apenas adiciona
    public void adicionarNumero(int numero) {
        //adiciona um numero
        numList.add(numero);
    }

    //soma total
    public int somaTotal() {
        //variavel para armazenar os numeros no for
        int calculoTotal = 0;

        for (Integer l : numList) {
            //faz o calculoTotal ser igual a calculoTotal = calculoTotal+l fazendo com que ele armazene todos os numeros da list
            calculoTotal = calculoTotal + l;
        }
        //retorna o calculo total
        return calculoTotal;
    }

    public int maiorNumero() {
        //if pra se a lista não tiver vazia ele executar o comando
        if (!numList.isEmpty()) {
            //variavel para guardar os numeros
            int maiorNumero = numList.get(0);

            for (Integer l : numList) {
                if (l > maiorNumero) {
                    maiorNumero = l;
                }
            }
            return maiorNumero;

        } else {
            System.out.println("A lista está vazia");
            return 0;

        }

    }

    public int menorNumero() {
        if (!numList.isEmpty()) {
            int menorNumero = numList.get(0);
            for (Integer l : numList) {
                if (l < menorNumero) {
                    menorNumero = l;
                }
            }
            return menorNumero;
        } else {
            System.out.println("A lista está vazia");
            return 0;
        }
    }

    public List<Integer> exibirNumeros() {
        return numList;
    }

    public static void main(String[] args) {
        SomaNumeros s = new SomaNumeros();
        s.adicionarNumero(1);
        s.adicionarNumero(2);
        s.adicionarNumero(3);
        s.adicionarNumero(4);
        s.adicionarNumero(5);
        s.adicionarNumero(9);
        s.adicionarNumero(295);
        s.adicionarNumero(0);
        s.adicionarNumero(-2);
        System.out.println("Exibindo numeros da lista: \n"+s.exibirNumeros());
        System.out.println("O maior número é: "+s.maiorNumero());
        System.out.println("O menor número é: "+s.menorNumero());
        System.out.println("A soma total é: "+s.somaTotal());
    }
}




