import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraExcessoes {
    public static double dividir(int numberOne, int numberTwo) throws DivisorInvalidoException, ArithmeticException {
        if (numberTwo < 0) {
            throw new DivisorInvalidoException("O denominador não pode ser menor que 0.");
        }
        if (numberTwo == 0) {
            throw new ArithmeticException("O denominador não pode ser divisível por 0.");
        }
        return (double) numberOne / numberTwo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("DIGITE O PRIMEIRO NUMERO: ");
            int numberOne = scanner.nextInt();
            System.out.println("DIGITE O SEGUNDO NUMERO");
            int numberTwo = scanner.nextInt();
            System.out.println("DIGITE O OPERADOR (+, -, *, /):");
            char operator = scanner.next().charAt(0);

            switch (operator) {
                case '+':
                    int resultado = numberOne + numberTwo;
                    System.out.println("O resultado é: " + resultado);
                    break;
                case '-':
                    resultado = numberOne - numberTwo;
                    System.out.println("O resultado é: " + resultado);
                    break;
                case '*':
                    resultado = numberOne * numberTwo;
                    System.out.println("O resultado é: " + resultado);
                    break;
                case '/':
                    double resultadoDivisao = dividir(numberOne, numberTwo);
                    System.out.println("O resultado é: " + resultadoDivisao);
                    break;
                default:
                    System.out.println("Operador inválido. Por favor, use +, -, *, ou /.");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Digite apenas números.");
        } catch (DivisorInvalidoException e) {
            System.out.println("ERRO: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ERRO: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}