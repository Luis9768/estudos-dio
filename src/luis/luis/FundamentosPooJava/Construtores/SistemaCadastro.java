package luis.luis.FundamentosPooJava.Construtores;

public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos =  new Pessoa();
        marcos.setAdress("Rua das figueiras");
        System.out.printf(marcos.getName()+"-"+marcos.getCpf());
    }
}
