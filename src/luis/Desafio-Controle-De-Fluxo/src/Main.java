import java.util.InputMismatchException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                System.out.println("Digite o primeiro parâmetro:");
                int parametroUm = scanner.nextInt();

                System.out.println("Digite o segundo parâmetro:");
                int parametroDois = scanner.nextInt();

                // Chama o método da classe Contador para executar a lógica de negócio
                Contador.contar(parametroUm, parametroDois);

            } catch (InputMismatchException e) {
                // Captura se o usuário digitar algo que não seja um número
                System.out.println("Os parâmetros devem ser números inteiros válidos.");
            } catch (ParametrosInvalidosException e) {
                // Captura a exceção de negócio
                System.out.println("Erro: " + e.getMessage());
            } finally {
                scanner.close();
            }
        }
    }
