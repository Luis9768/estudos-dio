package luis.EstruturasExcepcionais;

public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("25489547");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde as regras de negocio.");
            // OU (throw new RuntimeException(e);)
        }
    }
    static String formatarCep(String cep)throws CepInvalidoException{
        if(cep.length() != 8){throw new CepInvalidoException();}
        return "51.525-444";
    }
}
