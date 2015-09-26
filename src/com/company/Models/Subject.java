package com.company.Models;

import com.company.Views.Observer;

import java.util.List;

/**
 * Created by denis on 21/09/15.
 */
public interface Subject {
    void registerObserver(Observer o);
    void notifyObserversSearch(List result);
    void notifyObserversRelatorio(List result);

    void reservarUmaPessoa(int numero, String cliente) ;
    void reservarDuasPessoas(int numero, String cliente);

}
