package com.company.Views;

import com.company.Controllers.Busca;
import com.company.Controllers.Relatorio;
import com.company.Controllers.Reserva;
import com.company.Models.Mesa;
import com.company.Models.Pizza;

import java.util.List;

/**
 * Created by denis on 21/09/15.
 */
public class View implements Observer {
    private Busca busca;
    private Relatorio relat;
    private Reserva reserva;
    private List<Pizza> resultadosPizza;
    private List<Pizza> relatorio;

    public void setBusca(Busca busca) {
        this.busca = busca;
    }

    public void setRelat(Relatorio relatorio) {
        this.relat = relatorio;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    @Override
    public void updateBusca(List l) {
        resultadosPizza = l;
        busca.buscar();
    }
    public void updateMesas(String s) {
        System.out.println(s);
    }
    public void updateRelatorio(List l) {
        relatorio = l;
        relat.gerarRelatorio();
    }

    @Override
    public void update(String s) {
        System.out.println(s);
    }

    public void mostrarBuscaCliente() {
        System.out.println("-----BUSCA--CLIENTE----------------");
        for (Pizza p : resultadosPizza) {
            System.out.println("Sabor: " + p.getSabor());
            System.out.println("Borda Recheada: " + (p.isBordaRecheada() ? "Sim" : "Não"));
            System.out.println("Preço: " + p. getPreco());
        }
    }
    public void mostrarBuscaCozinheiro(){
        System.out.println("-----BUSCA-COZINHEIRO----------------");
        for (Pizza p : resultadosPizza) {
            System.out.println("Sabor: " + p.getSabor());
            System.out.println("Borda Recheada: " + (p.isBordaRecheada() ? "Sim" : "Não"));
            System.out.println("Preço: " + p. getPreco());
            System.out.println("Ingredientes: "+p.getIngredientes());
        }
    }
    public void mostrarRelatorioSimples() {
        System.out.println("--------RELATORIO SIMPLES-------");
        for (Pizza p : relatorio) {
            System.out.println("Sabor: " + p.getSabor());
            System.out.println("Preço: " + p. getPreco());
        }
    }
    public void mostrarRelatorioCompleto() {
        System.out.println("--------RELATORIO COMPLETO-------");
        for (Pizza p : relatorio) {
            System.out.println("Sabor: " + p.getSabor());
            System.out.println("Borda Recheada: " + (p.isBordaRecheada() ? "Sim" : "Não"));
            System.out.println("Preço: " + p. getPreco());
            System.out.println("Ingredientes: "+p.getIngredientes());
        }
    }
    public void reservar(int num,String cliente) {
        reserva.reservar(num, cliente);
    }



}
