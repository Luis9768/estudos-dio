package luis.POOIphone.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {
    private boolean tocando = true;
    private String musicaAtual = "Nenhuma";

    @Override
    public void tocar(){
        this.tocando = true;
        System.out.println("Musica pausada.");
    }
    @Override
    public void pausar(){
    this.tocando = false;
    System.out.println("TOCANDO: " + this.musicaAtual);

    }

    @Override
    public void selecionarMusica(String musica){
        this.musicaAtual = musica; // <--- A linha que faltava!
        System.out.println("✅ Música selecionada: " + musica);
    }
}