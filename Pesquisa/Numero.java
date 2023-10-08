package Pesquisa;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Numero implements Comparable<Numero>{
    private int num;
    @Override
    public String toString() {
        return "Numero " + num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Numero(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Numero n) {
        return Integer.compare(num, n.getNum());
    }
}
