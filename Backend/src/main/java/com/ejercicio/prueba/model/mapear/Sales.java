package com.ejercicio.prueba.model.mapear;

public class Sales {
    private String period;
    private int completed;

    public Sales() {
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Sales{" +
                "period='" + period + '\'' +
                ", completed=" + completed +
                '}';
    }
}
