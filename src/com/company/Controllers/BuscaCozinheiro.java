package com.company.Controllers;

import com.company.Models.Pizzaria;
import com.company.Models.Subject;
import com.company.Views.View;

/**
 * Created by denis on 21/09/15.
 */
public class BuscaCozinheiro implements Busca {
    private Subject subject;
    private View view;

    public BuscaCozinheiro(Subject subject, View view) {
        this.subject = subject;
        this.view = view;
    }

    @Override
    public void buscar() {
        view.mostrarBuscaCozinheiro();
    }

}
