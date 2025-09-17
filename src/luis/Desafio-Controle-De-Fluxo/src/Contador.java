public class Contador {
    public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Valida se o primeiro parâmetro é MAIOR que o segundo
        if (parametroUm > parametroDois) {
            // Lança a exceção personalizada
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Se a validação passar, realiza a armazenamentoDeVariaveis
        int armazenamentoDeVariaveis = parametroDois - parametroUm;

        for (int i = 1; i <= armazenamentoDeVariaveis; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}