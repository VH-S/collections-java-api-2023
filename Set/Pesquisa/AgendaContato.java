package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContato {
    private Set<Contato> contatoSet = new HashSet<>();

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        } return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        } return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContato agendaContato = new AgendaContato();
        agendaContato.adicionarContato("FF", 12345);
        agendaContato.adicionarContato("FF", 15555);
        agendaContato.adicionarContato("AA", 123241);
        agendaContato.exibirContato();
        System.out.println(agendaContato.pesquisarPorNome("A"));
        agendaContato.atualizarNumeroContato("FF", 12344);
        agendaContato.exibirContato();
    }
}
