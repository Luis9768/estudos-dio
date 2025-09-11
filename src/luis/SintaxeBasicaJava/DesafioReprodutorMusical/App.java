package luis.SintaxeBasicaJava.DesafioReprodutorMusical;

public class App {
    boolean liga;
    int volume;
    String muisc;

    public void setLigaApp(){
        liga = true;
    }
    public void desligaApp(){
        liga = false;
    }
    public void aumentaVolume(){
        volume++;
        System.out.println("Aumentando volume: " + volume);
    }
    public void abaixaVolume(){
        volume--;
        System.out.println("Diminuindo volume: " + volume);
    }

}
