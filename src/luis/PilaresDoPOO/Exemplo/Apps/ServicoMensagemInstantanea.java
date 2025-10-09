package luis.PilaresDoPOO.Exemplo.Apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected abstract void salvarHistoricoMensgens();

    protected void verificarConexaoInternet(){
        System.out.println("Validando conexão de internet");
    }
}
