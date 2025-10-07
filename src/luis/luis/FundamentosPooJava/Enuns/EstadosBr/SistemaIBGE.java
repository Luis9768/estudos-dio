package luis.luis.FundamentosPooJava.Enuns.EstadosBr;

public class SistemaIBGE {
    public static void main(String[] args) {
        //lista todos os estados BRs
        for (EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getName()+" - "+e.getAbbreviation());
        }
        //Como pegar um estado específico.
        EstadoBrasileiro eb = EstadoBrasileiro.PERNAMBUCO;
        System.out.println(eb.getName());
        System.out.println(eb.upperName());
        System.out.println(eb.getAbbreviation());
        System.out.println(eb.getIBGEcodes());
    }
}
