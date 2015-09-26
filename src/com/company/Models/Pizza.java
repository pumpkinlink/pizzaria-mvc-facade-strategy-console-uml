package com.company.Models;

import java.math.BigDecimal;

/**
 * Created by Aluno on 10/09/2015.
 */
public class Pizza {
    private boolean bordaRecheada;
    private String sabor;
    private BigDecimal preco;
    private String ingredientes;

    public Pizza(boolean bordaRecheada, String sabor, Double preco, String ingredientes) {
        this.bordaRecheada = bordaRecheada;
        this.sabor = sabor;
        this.preco = new BigDecimal(preco);
        this.ingredientes = ingredientes;
    }

    public boolean isBordaRecheada() {
        return bordaRecheada;
    }

    public String getSabor() {
        return sabor;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public boolean matches(String s) {
        if (sabor.equals(s)) {
            return true;
        }
        return false;
    }
}
