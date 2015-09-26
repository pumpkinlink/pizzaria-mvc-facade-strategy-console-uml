package com.company.Controllers;

import com.company.Models.Subject;
import com.company.Views.View;

/**
 * Created by denis on 21/09/15.
 */
public class RelatorioCompleto implements Relatorio {
    private Subject subject;
    private View view;

    public RelatorioCompleto(Subject subject, View view) {
        this.subject = subject;
        this.view = view;
    }

    @Override
    public void gerarRelatorio() {
        view.mostrarRelatorioCompleto();
    }
}
