package com.company;

import com.company.Controllers.*;
import com.company.Models.Mesa;
import com.company.Models.Pizza;
import com.company.Models.Pizzaria;
import com.company.Views.View;

public class Main {


        public static void main(String[] args) {
            Pizzaria p = new Pizzaria();

            View v = new View();

            initializePizzaria(p);



            p.registerObserver(v);

            Busca b = new BuscaCozinheiro(p,v);
            v.setBusca(b);
            p.buscar("Calabresa");
            v.setBusca(new BuscaCliente(p, v));
            p.buscar("Calabresa");


            Relatorio relat = new RelatorioSimples(p, v);
            v.setRelat(relat);
            p.relatorio();
            v.setRelat(new RelatorioCompleto(p, v));
            p.relatorio();

            Reserva reser = new ReservaDuasPessoas(p, v);
            v.setReserva(reser);
            v.reservar(12, "denis");
            v.setReserva(new ReservaUmaPessoa(p, v));
            v.reservar(12, "denis");



        }

    private static void initializePizzaria(Pizzaria p) {
        p.addPizza(new Pizza(true, "Calabresa", 20.0, "queijo, calabresa"));
        p.addPizza(new Pizza(true, "Presunto", 15.0, "queijo, presunto"));
        p.addPizza(new Pizza(true, "Margherita", 18.0, "queijo, tomate, negocio verde"));

        p.addMesa(new Mesa(false,12));
    }
}


