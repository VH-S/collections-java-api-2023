package Ordenacao;

import Pesquisa.Numero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListaNumeros {
    private List<OrdenacaoNumeros> numerosList;
    public ListaNumeros() {
        this.numerosList = new ArrayList<>();
    }
    public void adicionarNumero(int num) {
        OrdenacaoNumeros numero = new OrdenacaoNumeros(num);
        this.numerosList.add(numero);
    }

    public List<OrdenacaoNumeros> ordenarAscendente() {

        if (!numerosList.isEmpty()) {
            List<OrdenacaoNumeros> ordenacaoNumero = new ArrayList<>(numerosList);
            Collections.sort(ordenacaoNumero);
            return ordenacaoNumero;
        } else {System.out.println("A lista está vazia!");}
        return null;
    }

    public List<OrdenacaoNumeros> ordenarDescendente() {
        if (!numerosList.isEmpty()) {
            List<OrdenacaoNumeros> ordenacaoNumeros = new ArrayList<>(numerosList);
            Collections.sort(ordenacaoNumeros);
            Collections.reverse(ordenacaoNumeros);
            return ordenacaoNumeros;
        } else {System.out.println("A lista está vazia!");}
        return null;
    }

    public static void main(String[] args) {
        ListaNumeros ordem = new ListaNumeros();
        ordem.adicionarNumero(45);
        ordem.adicionarNumero(24);
        ordem.adicionarNumero(2);
        ordem.adicionarNumero(52);
        ordem.adicionarNumero(22);
        ordem.adicionarNumero(4);
        System.out.println(ordem.ordenarAscendente());
        System.out.println(ordem.ordenarDescendente());
    }
}
