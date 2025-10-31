package luis.CollectionsJava.InterfaceList.Ordenacao.MeuExercicio;

public class Numeros implements Comparable<Numeros> {
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Numeros" +
                "numero=" + numero +
                '}';
    }

    @Override
    public int compareTo(Numeros numeros) {
        return Integer.compare(numero,numeros.getNumero());
    }

    public static void main(String[] args) {
        OrdenacaNumeros ordenacaNumeros = new OrdenacaNumeros();
        ordenacaNumeros.adicionarNumero(1);
        ordenacaNumeros.adicionarNumero(0);
        ordenacaNumeros.adicionarNumero(2);
        ordenacaNumeros.adicionarNumero(18);
        ordenacaNumeros.adicionarNumero(12);
        System.out.println(ordenacaNumeros.ordenarAscendente());
        System.out.println(ordenacaNumeros.ordenarDescendente());
    }
}
