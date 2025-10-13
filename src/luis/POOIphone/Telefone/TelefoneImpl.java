package luis.POOIphone.Telefone;

public class TelefoneImpl implements Telefone {
    private String numeroDiscado;
    private boolean ocupado;

    @Override
    public void ligar(String numero) {
        this.numeroDiscado = numero;
        System.out.println("📞 Ligando para: " + this.numeroDiscado);

    }

    @Override
    public void atender() {
        this.ocupado = true; // MUDA o estado do telefone para ocupado
        System.out.println("📞 Chamada atendida com sucesso. (Status: Ocupado)");
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Deixe sua mensagem de voz.");
    }

}


