package luis.PilaresDoPOO.Exemplo;

import luis.PilaresDoPOO.Exemplo.Apps.FacebookMessenger;
import luis.PilaresDoPOO.Exemplo.Apps.MSMMessenger;
import luis.PilaresDoPOO.Exemplo.Apps.ServicoMensagemInstantanea;
import luis.PilaresDoPOO.Exemplo.Apps.Telegram;

public class ComputadorAndre {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;

        String appEscolhdo = "fcb";
        if (appEscolhdo.equals("fcb")) {
            smi = new FacebookMessenger();
        } else if (appEscolhdo.equals("msm")) {
            smi = new MSMMessenger();
        } else if (appEscolhdo.equals("tlg")) {
            smi = new Telegram();
        }
        smi.enviarMensagem();
        smi.receberMensagem();

    }
}
