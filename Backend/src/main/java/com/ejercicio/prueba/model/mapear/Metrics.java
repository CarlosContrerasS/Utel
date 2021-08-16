package com.ejercicio.prueba.model.mapear;

public class Metrics {

    private Claims claims;
    private Delayed_handling_time delayed_handling_time;
    private Sales sales;
    private Cancellations cancellations;

    public Metrics() {
    }

    public Claims getClaims() {
        return claims;
    }

    public void setClaims(Claims claims) {
        this.claims = claims;
    }

    public Delayed_handling_time getDelayed_handling_time() {
        return delayed_handling_time;
    }

    public void setDelayed_handling_time(Delayed_handling_time delayed_handling_time) {
        this.delayed_handling_time = delayed_handling_time;
    }

    public Sales getSales() {
        return sales;
    }

    public void setSales(Sales sales) {
        this.sales = sales;
    }

    public Cancellations getCancellations() {
        return cancellations;
    }

    public void setCancellations(Cancellations cancellations) {
        this.cancellations = cancellations;
    }

    @Override
    public String toString() {
        return "Metrics{" +
                "claims=" + claims +
                ", delayed_handling_time=" + delayed_handling_time +
                ", sales=" + sales +
                ", cancellations=" + cancellations +
                '}';
    }
}

