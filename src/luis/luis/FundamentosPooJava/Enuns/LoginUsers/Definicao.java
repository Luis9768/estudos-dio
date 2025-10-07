package luis.luis.FundamentosPooJava.Enuns.LoginUsers;

public enum Definicao {
    GUEST1("LUIS MIGUEL", 7412, "ADMIN", "luluis@gmail.com"),
    GUEST2("JOAO ARTHUR", 7445, "USER", "jojoao@gmail.com"),
    GUEST3("RITA DE CASSIA", 7556, "USER", "ririta@gmail.com"),
    GUEST4("WILIAN SILVA", 8896, "ADMIM", "wiwilian@gmail.com"),
    GUEST5("MARIA RITA",2235,"USER","maririta@gmail.com");

    private String name;
    private int id;
    private String category;
    private String email;

    private Definicao(String name,int id,String category,String email)
    {
     this.category = category;
     this.email = email;
     this.name = name;
     this.id = id;
    }
    public String getName(){return name;}
    public String getCategory(){return category;}
    public String getEmail(){return email;}
    public int getId(){return id;}
    @Override
    public String toString(){
        return ("Bem vindo (a), "+getName()+
                "! Sua categoria é: "+getCategory());
    }
     public static Definicao buscarUsuario(String email,int id){
        for(Definicao busca: Definicao.values()){
            if(email.equals(busca.getEmail()) && id == busca.getId()){
                return busca;
            }
        }return null;

    }
}
