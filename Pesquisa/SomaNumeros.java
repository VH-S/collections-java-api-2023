package Pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class SomaNumeros {
    private List<Numero> numerosList;
    public SomaNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int num) {
        Numero numero = new Numero(num);
        this.numerosList.add(numero);
    }

    public void exibirNumeros() {
        if (!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public int calcularSoma() {
        int somaTotal = 0;
        if (!numerosList.isEmpty()) {
           for (Numero numero : numerosList) {
               int valor = numero.getNum();
               somaTotal += valor;
           }
           return somaTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Numero> ordenarNumero() {

        if (!numerosList.isEmpty()) {
            List<Numero> ordenacaoNumero = new ArrayList<>(numerosList);
            Collections.sort(ordenacaoNumero);
            List<Numero> maiorNumero = new ArrayList<>();
            maiorNumero.add(ordenacaoNumero.get(ordenacaoNumero.size()- 1));
            return maiorNumero;
        } else {System.out.println("A lista está vazia!");}
        return null;
    }

    public List<Numero> menorNumero() {

        if (!numerosList.isEmpty()) {
            List<Numero> menorNumero = new ArrayList<>(numerosList);
            Collections.sort(menorNumero);
            List<Numero> retornoMenorNumero = new ArrayList<>();
            retornoMenorNumero.add(menorNumero.get(0));
            return retornoMenorNumero;
        } else {System.out.println("A lista está vazia!");}
        return null;
    }
    public static void main(String[] args) {
        SomaNumeros lista = new SomaNumeros();
        lista.adicionarNumero(2);
        lista.adicionarNumero(3);
        lista.adicionarNumero(4);
        lista.adicionarNumero(5);
        lista.exibirNumeros();
        System.out.println(lista.calcularSoma());
        System.out.println(lista.ordenarNumero());
        System.out.println(lista.menorNumero());

    }
}
