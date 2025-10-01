package luis.luis.FundamentosPooJava.Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setName("Felipe");
        felipe.setAge(10);

        System.out.printf("O aluno %s tem %d de idade.",felipe.getName(),felipe.getAge());
    }
}
