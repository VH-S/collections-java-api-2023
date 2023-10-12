package Set.Ordenacao;
import java.util.Comparator;
import java.util.Objects;
public class ListaAlunos implements Comparable<ListaAlunos> {
    private String nome;
    private long matricula;
    private double media;

    public long getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "ListaAlunos{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaAlunos(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    @Override
    public int compareTo(ListaAlunos l) {
        return nome.compareToIgnoreCase(l.getNome());
    }
}

class ComparatorPorMatricula implements Comparator<ListaAlunos> {
    @Override
    public int compare(ListaAlunos l1, ListaAlunos l2) {
        return Double.compare(l1.getMedia(), l2.getMedia());
    }
}
