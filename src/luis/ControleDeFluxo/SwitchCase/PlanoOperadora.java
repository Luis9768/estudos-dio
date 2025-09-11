package luis.ControleDeFluxo.SwitchCase;

public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "C";
        /*
        if (plano == "A") {
            System.out.println("100 minutos de ligação.");
        } else if (plano == "B") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram ilimitados");
        } else if (plano == "C") {
            System.out.println("100 minutos de ligação");
            System.out.println("Whatsapp e Instagram ilimitados");
            System.out.println("30 dias de YOUTUBE grátis");
        }
        */
        //OU
        switch (plano) {
            case "C":
                System.out.println("30 dias de YOUTUBE.");
            case "B":
                System.out.println("Whatsapp e Instagram ilimitados.");
            case "A":
                System.out.println("100 minutos de ligação.");

        }
    }
}
