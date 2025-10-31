package luis.ExerciciosAvulsos.Veiculos;

public class Main {
    public static void main(String[] args) {
        Carro c = new Carro("Sedan",2025);
        Moto m = new Moto("Fazer",2025);
        System.out.println(c.calcularRevisao());
        c.exibirResumo();
        System.out.println(m.calcularRevisao());
        m.exibirResumo();
    }
}
