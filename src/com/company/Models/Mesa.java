package com.company.Models;

/**
 * Created by denis on 24/09/15.
 */
public class Mesa {
    private boolean reservada;
    private String cliente;
    private boolean duaspessoas;
    private int numero;

    public boolean isDuaspessoas() {
        return duaspessoas;
    }

    public Mesa(boolean duaspessoas, int numero) {
        this.reservada = false;
        this.cliente = "";
        this.duaspessoas = duaspessoas;
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setDuaspessoas(boolean duaspessoas) {
        this.duaspessoas = duaspessoas;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }



    public boolean isReservada() {
        return reservada;
    }

    public void setReservada(boolean reservada) {
        this.reservada = reservada;
    }

}
