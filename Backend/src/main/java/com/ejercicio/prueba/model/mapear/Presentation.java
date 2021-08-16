package com.ejercicio.prueba.model.mapear;

public class Presentation {
    private String display_currency;

    public Presentation() {
    }

    public String getDisplay_currency() {
        return display_currency;
    }

    public void setDisplay_currency(String display_currency) {
        this.display_currency = display_currency;
    }

    @Override
    public String toString() {
        return "Presentation{" +
                "display_currency='" + display_currency + '\'' +
                '}';
    }
}

