package com.company.Views;

import java.util.List;

/**
 * Created by denis on 21/09/15.
 */
public interface Observer {
    void updateBusca(List l);
    void updateRelatorio(List l);
    void update(String s);
}
