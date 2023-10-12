package Set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<ListaAlunos> alunosSet;
    public GerenciadorAlunos() {
        this.alunosSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, Long matricula, double media) {
        alunosSet.add(new ListaAlunos(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        ListaAlunos alunoParaRemover = null;
        for (ListaAlunos a : alunosSet) {
            if ((a.getMatricula()) == matricula) {
                alunoParaRemover = a;
                break;
            } else System.out.println("Não existe aluno com essa matrícula");
        }
        alunosSet.remove(alunoParaRemover);
    }

    public void exibirAlunos() {
        System.out.println(alunosSet);
    }

    public Set<ListaAlunos> exibirAlunosPorNome() {
        Set<ListaAlunos> nomePorOrdem = new TreeSet<>(alunosSet);
        return nomePorOrdem;
    }

    public Set<ListaAlunos> exibirAlunosPorNota() {
        Set<ListaAlunos> mediaPorOrdem = new TreeSet<>(new ComparatorPorMatricula());
        alunosSet.addAll(alunosSet);
        return mediaPorOrdem;
    }

    public static void main(String[] args) {
        // Criando uma instância do GerenciadorAlunos
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        // Adicionando alunos ao gerenciador
        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        // Exibindo todos os alunos no gerenciador
        System.out.println("Alunos no gerenciador:");
        System.out.println(gerenciadorAlunos.alunosSet);

        // Removendo um aluno com matrícula inválida e outro pelo número de matrícula
        gerenciadorAlunos.removerAluno(000L);
        gerenciadorAlunos.removerAluno(123457L);
        System.out.println(gerenciadorAlunos.alunosSet);

        // Exibindo alunos ordenados por nome
        gerenciadorAlunos.exibirAlunosPorNome();

        // Exibindo alunos ordenados por nota
        gerenciadorAlunos.exibirAlunosPorNota();
    }

}
