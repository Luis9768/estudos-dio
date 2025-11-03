package luis.CollectionsJava.SetCollections.SetInterface.MInhasOPeracoesBasicas.AgendaContatos;

import luis.CollectionsJava.SetCollections.SetInterface.OperacoesBasicasProf.ConjuntoConvidados;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet = new HashSet<>();
    public void adicionarContato(String nome, String contato){
        contatoSet.add(new Contato(nome,contato));
    }
    public void exibirListaContatos(){
        System.out.println(contatoSet);
    }
    public String pesquisarPorNome(String nome){
        for(Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                return c.getNumeroTelefone();
            }
        }return "Contato não encontrado";
    }
    public void atualizarNumeroContato(String nome, String novoNumero) {
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumeroTelefone(novoNumero);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("Luís Miguel","(11) 94109-3155");
        agendaContatos.adicionarContato("Marcos Felipe","(11) 94555-1253");
        agendaContatos.adicionarContato("Kauã Antonio","(11) 95623-4412");
        agendaContatos.adicionarContato("Antonia Carla","(11) 95523-7412");
        agendaContatos.exibirListaContatos();
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println(agendaContatos.pesquisarPorNome("Luis Miguel"));
        System.out.println(agendaContatos.pesquisarPorNome("Kauã Antonio"));
        agendaContatos.exibirListaContatos();
        System.out.println("---------------------------------------------------------------------------------------");

        agendaContatos.atualizarNumeroContato("Luis Miguel","(11) 94123-7855");
        agendaContatos.atualizarNumeroContato("Antonia Carla","(11) 96663-4511");
        agendaContatos.exibirListaContatos();
    }
}