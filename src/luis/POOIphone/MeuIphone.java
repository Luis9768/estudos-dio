package luis.POOIphone;

public class MeuIphone {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        System.out.println("=================================================");
        System.out.println("           TESTE FINAL - IPHONE (POO)");
        System.out.println("=================================================");

        System.out.println("\n--- 1. Reprodutor Musical ---");
        meuIphone.selecionarMusica("Thriller - Michael Jackson");
        meuIphone.tocar();
        meuIphone.pausar();

        System.out.println("\n--- 2. Aparelho Telefônico ---");
        meuIphone.ligar("1234-5678");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        System.out.println("\n--- 3. Navegador Internet ---");
        meuIphone.exibirPagina("https://www.dio.me");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}