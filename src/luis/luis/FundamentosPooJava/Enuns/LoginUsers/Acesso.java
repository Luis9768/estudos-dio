package luis.luis.FundamentosPooJava.Enuns.LoginUsers;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Acesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idDigitado = 1;
        System.out.println("Digite seu email: ");
        String emailDigitado = scanner.next();
        try {
            System.out.println("Difite sua senha: ");
            idDigitado = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("ERRO DE DIGITAÇÃO. POR FAVOR APENAS NUMERO NO CAMPO ID.");
            scanner.next();
        }

        Definicao validacao = Definicao.buscarUsuario(emailDigitado,idDigitado);

        if(validacao != null){
           System.out.println(validacao.toString());
        }
        else{
            System.out.println("Usuário não encontrado.");
        }

    }
}
