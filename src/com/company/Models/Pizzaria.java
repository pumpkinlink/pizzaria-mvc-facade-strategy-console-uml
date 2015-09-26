package com.company.Models;

import com.company.Views.Observer;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by denis on 21/09/15.
 */
public class Pizzaria implements Subject {
    private List<Observer> observers;
    private List<Pizza> pizzas;
    private List<Mesa> mesas;


    public Pizzaria() {
        this.observers = new LinkedList<Observer>();
        this.pizzas = new LinkedList<Pizza>();
        this.mesas = new LinkedList<Mesa>();
    }
    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void notifyObserversSearch(List resultados){

        for(Object i:observers){
            Observer obs = (Observer)i;
            obs.updateBusca(resultados);
        }
    }
    public void notifyObserversRelatorio(List resultados){

        for(Object i:observers){
            Observer obs = (Observer)i;
            obs.updateRelatorio(resultados);
        }
    }
    public void notifyObservers(String msg){
        for(Object i:observers){
            Observer ob = (Observer)i;
            ob.update(msg);
        }
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addMesa(Mesa mesa) {
        mesas.add(mesa);
    }

    public void reservarUmaPessoa(int numero, String cliente) {
        for (Mesa m : mesas) {
            if (m.getNumero() == numero) {
                if (m.isReservada()) {
                    notifyObservers("------mesa já reservada");
                } else {
                    m.setCliente(cliente);
                    m.setReservada(true);
                    notifyObservers("--------mesa reservada com sucesso para "+cliente);
                }
            }
        }
    }
    public void reservarDuasPessoas(int numero, String cliente) {
        for (Mesa m : mesas) {
            if (m.getNumero() == numero) {
                if (m.isReservada()) {
                    notifyObservers("------mesa já reservada");
                } else if (m.isDuaspessoas()==true){

                    m.setCliente(cliente);
                    m.setReservada(true);
                    notifyObservers("------mesa reservada com sucesso para "+cliente);
                }
                else {
                    notifyObservers("--------mesa somente para uma pessoa");
                }
            }
        }
    }
    public void buscar(String s) {
        List resultados = new LinkedList<Pizza>();
        for (Pizza p : pizzas) {
            if (p.matches(s)) {
                resultados.add(p);
            }
        }
        notifyObserversSearch(resultados);
    }

    public void relatorio() {
        List resultados = new LinkedList<Pizza>();
        resultados = pizzas.subList(0, pizzas.size());
        resultados.sort((o1, o2) -> ((Pizza)o1).getPreco().compareTo(((Pizza)o2).getPreco()));
        notifyObserversRelatorio(resultados);
    }
}
