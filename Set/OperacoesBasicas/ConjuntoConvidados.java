package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
        private Set<Convidado> convidadosSet;
        public ConjuntoConvidados() {
            this.convidadosSet = new HashSet<>();
        }
    public void adicionarConvidado(String nome, int codigoConvite) {
            convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
            Convidado convidadoParaRemover = null;
            for(Convidado c : convidadosSet) {
                if ((c.getCodigoConvite()) == codigoConvite) {
                    convidadoParaRemover = c;
                    break;
                } else System.out.println("Não existe convidado com esse codigo de convite");
            }
            convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
            return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set");
        conjuntoConvidados.adicionarConvidado("Nome 1", 1235);
        conjuntoConvidados.adicionarConvidado("Nome 1", 1265);
        conjuntoConvidados.adicionarConvidado("Nome 1", 1255);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set");
        conjuntoConvidados.exibirConvidados();
    }
    
}
