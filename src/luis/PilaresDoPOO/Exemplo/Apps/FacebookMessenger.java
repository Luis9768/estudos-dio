package luis.PilaresDoPOO.Exemplo.Apps;

public class FacebookMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        verificarConexaoInternet();
        System.out.println("Enviando Mensagem pelo Facebook Messenger...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger...");
    }

    @Override
    protected void salvarHistoricoMensgens() {

    }

}
