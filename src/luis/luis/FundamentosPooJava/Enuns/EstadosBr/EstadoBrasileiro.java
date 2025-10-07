package luis.luis.FundamentosPooJava.Enuns.EstadosBr;

public enum EstadoBrasileiro {
    //Adicione os estados abaixo
    SAO_PAULO("SP","São Paulo",11),
    RIO_JANEIRO("RJ","Rio de Janeiro",27),
    MINAS_GERAIS("MG","Minas Gerais",38),
    GOIAS("GO","Goiás",25),
    PERNAMBUCO("PE","Pernambuco",65),
    SANTA_CATARINA("SA","Santa Catarina",98),
    CEARA("CE","CEARÁ",22);

    //declarações de variaveis
    private String name;
    private String abbreviation;
    private int IBGEcodes;

    //Metodo para fazerem os objetos de estados acima existirem
    //como acronyms foi declarado primeiro ele ocupa as siglas ex:(MG) e nome depois
    private EstadoBrasileiro(String abbreviation,String name, int IBGEcodes){
        this.abbreviation = abbreviation;
        this.name = name;
        this.IBGEcodes = IBGEcodes;
    }
    public String getAbbreviation(){
        return abbreviation;
    }
    public String getName(){return name;}
    public String getAcronums(){return abbreviation;}
    public String upperName(){return name.toUpperCase();}
    public int getIBGEcodes(){return IBGEcodes;}
}
