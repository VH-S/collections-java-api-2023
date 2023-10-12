package List.Ordenacao;

public class OrdenacaoNumeros implements  Comparable<OrdenacaoNumeros>{
    private int num;

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "num=" + num +
                '}';
    }

    @Override
    public int compareTo(OrdenacaoNumeros n) {
        return Integer.compare(num, n.getNum());
    }


    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public OrdenacaoNumeros(int num) {
        this.num = num;
    }
}
