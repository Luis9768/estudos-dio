package luis.PilaresDoPOO.Exemplo.Apps;

public class MSMMessenger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        verificarConexaoInternet();
        System.out.println("Enviando mensagem pelo MSM Messenger...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSM Messenger...");

    }

    @Override
    protected void salvarHistoricoMensgens() {

    }
}
