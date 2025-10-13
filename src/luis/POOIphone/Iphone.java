package luis.POOIphone;

import luis.POOIphone.Navegador.NavegadorWeb;
import luis.POOIphone.Navegador.NavegadorWebImpl;
import luis.POOIphone.ReprodutorMusical.ReprodutorMusical;
import luis.POOIphone.ReprodutorMusical.ReprodutorMusicalImpl;
import luis.POOIphone.Telefone.Telefone;
import luis.POOIphone.Telefone.TelefoneImpl;

public class Iphone{
    private ReprodutorMusical reprodutor;
    private Telefone telefone;
    private NavegadorWeb navegador;

    public Iphone(){
        this.reprodutor = new ReprodutorMusicalImpl();
        this.navegador = new NavegadorWebImpl();
        this.telefone = new TelefoneImpl();

    }
    // =================================================================
    // MÉTODOS DE DELEGAÇÃO (APENAS PASSAM A CHAMADA)
    // =================================================================

    // --- Reprodutor Musical ---
    public void tocar() {
        this.reprodutor.tocar();
    }
    public void pausar() {
        this.reprodutor.pausar();
    }
    public void selecionarMusica(String musica) {
        this.reprodutor.selecionarMusica(musica);
    }

    // --- Navegador Web ---
    public void exibirPagina(String url) {
        this.navegador.exibirPagina(url);
    }
    public void adicionarNovaAba() {
        this.navegador.adicionarNovaAba();
    }
    public void atualizarPagina() {
        this.navegador.atualizarPagina();
    }

    // --- Aparelho Telefônico ---
    public void ligar(String numero) {
        this.telefone.ligar(numero);
    }
    public void atender() {
        this.telefone.atender();
    }
    public void iniciarCorreioVoz() {
        this.telefone.iniciarCorreioVoz();

    }
}
