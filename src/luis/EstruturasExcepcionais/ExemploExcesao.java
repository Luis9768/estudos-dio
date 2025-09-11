package luis.EstruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcesao {
    public static void main(String[] args) {
        try {
            // String inválida (vai gerar exceção)
            Number valor = NumberFormat.getInstance().parse("a1.75");
            System.out.println("Valor convertido: " + valor);
        } catch (ParseException e) {
            System.out.println("⚠️ Erro ao converter: a entrada não é um número válido.");
            // opcional: exibir detalhes técnicos
            e.printStackTrace();
        }
    }
}
