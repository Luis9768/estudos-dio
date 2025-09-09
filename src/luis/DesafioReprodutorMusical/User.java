package luis.DesafioReprodutorMusical;

public class User {
    public static void main(String[]args){
        App app = new App();
        app.aumentaVolume();
        System.out.println("Volume atual: " + app.volume);
        app.aumentaVolume();
        System.out.println("Volume atual: " + app.volume);
        app.aumentaVolume();
        System.out.println("Volume atual: " + app.volume);

        app.abaixaVolume();
        System.out.println("Volume atual: " + app.volume);


        app.setLigaApp();
        System.out.println("O aplicativo está sendo usado? "+ app.liga);
        app.desligaApp();
        System.out.println("O aplicativo está sendo usado? "+ app.liga);

    }
}
