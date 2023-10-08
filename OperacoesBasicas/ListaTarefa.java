package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }
    public void removerTarefa(String decricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(decricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa1");
        listaTarefa.adicionarTarefa("Tarefa2");
        System.out.println("O numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Tarefa1");
        System.out.println("O numero total de elementos na lista é " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    }
}
