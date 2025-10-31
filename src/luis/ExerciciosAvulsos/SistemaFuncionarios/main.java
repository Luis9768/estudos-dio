package luis.ExerciciosAvulsos.SistemaFuncionarios;

public class main {
    public static void main(String[] args) {
        Gerente g = new Gerente("Luis Miguel",3450.0);
        Vendedor v = new Vendedor("Joana Silva",8000.0);
        System.out.println(g.getSalarioBase());
        System.out.println(g.calcularSalario());
        System.out.println(v.calcularSalario());
        System.out.println(v.getSalarioBase());
        g.exibirResumo();
        v.exibirResumo();

    }
}
