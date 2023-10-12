package Set.Pesquisa;

import List.OperacoesBasicas.ListaTarefa;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet = new HashSet<>();
    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().startsWith(descricao)) {
                tarefaParaRemover = t;
                break;
            } else System.out.println("Não existe tarefa com essa descrição");
        } tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }
    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public Set<Tarefa> obterTarefaConcluida(){
        Set<Tarefa> tarefaConcluida = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (t.isConcluida()) {
                tarefaConcluida.add(t);
            }
        } return tarefaConcluida;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefaPendente = new HashSet<>();
        for (Tarefa t : tarefaSet) {
            if (!t.isConcluida()){
                tarefaPendente.add(t);
            }

        }return tarefaPendente;
    }

    public void marcarTarefaConcluida(String descricao) {
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
            }
        }
    }

    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }

        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isConcluida()) {
                tarefaParaMarcarComoPendente.setConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public static void main(String[] args) {
        // Criando uma instância da classe ListaTarefas
        ListaTarefas listaTarefas = new ListaTarefas();

        // Adicionando tarefas à lista
        listaTarefas.adicionarTarefa("Estudar Java");
        listaTarefas.adicionarTarefa("Fazer exercícios físicos");
        listaTarefas.adicionarTarefa("Organizar a mesa de trabalho");
        listaTarefas.adicionarTarefa("Ler livro");
        listaTarefas.adicionarTarefa("Preparar apresentação");

        // Exibindo as tarefas na lista
        listaTarefas.exibirTarefas();

        // Removendo uma tarefa
        listaTarefas.removerTarefa("Fazer exercícios físicos");
        listaTarefas.exibirTarefas();

        // Contando o número de tarefas na lista
        System.out.println("Total de tarefas na lista: " + listaTarefas.contarTarefas());

        // Obtendo tarefas pendentes
        System.out.println(listaTarefas.obterTarefasPendentes());

        // Marcando tarefas como concluídas
        listaTarefas.marcarTarefaConcluida("Ler livro");
        listaTarefas.marcarTarefaConcluida("Estudar Java");

        // Obtendo tarefas concluídas
        System.out.println(listaTarefas.obterTarefaConcluida());

        // Marcando tarefas como pendentes
        listaTarefas.marcarTarefaPendente("Estudar Java");
        listaTarefas.exibirTarefas();

        // Limpando a lista de tarefas
        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();
    }

}
