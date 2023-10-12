package Set.OperacoesBasicas;

import java.util.Objects;

public class PalavrasUnicas {
    private String palavra;

    @Override
    public String toString() {
        return "palavra='" + palavra;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PalavrasUnicas that = (PalavrasUnicas) o;
        return Objects.equals(palavra, that.palavra);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavra);
    }

    public PalavrasUnicas(String palavra) {
        this.palavra = palavra;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }
}
