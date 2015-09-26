package com.company.Controllers;

import com.company.Models.Subject;
import com.company.Views.View;

/**
 * Created by denis on 21/09/15.
 */
public class BuscaCliente implements Busca {
    private Subject subject;
    private View view;

    public BuscaCliente(Subject subject, View view) {
        this.subject = subject;
        this.view = view;
    }

    @Override
    public void buscar() {
        view.mostrarBuscaCliente();
    }
}
