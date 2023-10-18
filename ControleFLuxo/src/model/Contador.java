package model;

import java.util.List;

public class Contador {

    private List<Integer> parametros;

    public Contador(List<Integer> parametros) {
        this.parametros = parametros;
    }

    public int getParametro(int index) {
        return parametros.get(index);
    }
}

