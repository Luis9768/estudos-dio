package luis.CollectionsJava.ComparableComparator.MeuExercicios.Vendedores;

 class Vendedor implements Comparable<Vendedor> {
     private String nome;
     private int idade;
     private double vendaMes;

     //Metodo construtor
     public Vendedor(String no ,int ida, double vms){
         this.nome = no;
         this.idade = ida;
         this.vendaMes = vms;
     }
     public int compareTo(Vendedor v){
         int resultadoVendasMes = Double.compare(v.getVendaMes(),this.vendaMes);
         if(resultadoVendasMes == 0){
             resultadoVendasMes = this.nome.compareTo(v.getNome());
         }return resultadoVendasMes;
     }

     public String getNome() {return nome;}
     public int getIdade(){return idade;}
     public double getVendaMes(){return vendaMes;}


 }
