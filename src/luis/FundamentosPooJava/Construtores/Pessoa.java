package luis.FundamentosPooJava.Construtores;

public class Pessoa {
    private String name;
    private String cpf;
    private String adress;
    public Pessoa(String cpf, String name){
        this.cpf = cpf;
        this.name = name;
    }

    public Pessoa() {

    }

    public String getName(){return name;}
    public String getCpf(){return cpf;}
    public String getAdress(){return adress;}
    public void setAdress(String adress){this.adress = adress;}
}
