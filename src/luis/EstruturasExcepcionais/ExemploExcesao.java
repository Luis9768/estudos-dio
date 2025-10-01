package luis.EstruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcesao {
    public static void main(String[] args) {
        try {
            // ‘String’ inválida (vai gerar exceção)
            //essa parte pega uma variável de number(de acordo com o import), e tira o ponto basicamente
            //ele lê o que ta escrito e se haver uma letra entre os números ele pega os números que estão antes da letra
            //e para, mas se a letra estiver antes dos números ele executa a excessão.
            Number valor = NumberFormat.getInstance().parse("41.75");
            System.out.println("Valor convertido: " + valor);
        } catch (ParseException e) {
            System.out.println("⚠️ Erro ao converter: a entrada não é um número válido.");
            // opcional: exibir detalhes técnicos
            e.printStackTrace();
        }
    }
}
