package com.ejercicio.prueba.model.mapear;

public class Installments {
    private int quantity;
    private Integer amount;
    private double rate;
    private String currency_id;

    public Installments() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    @Override
    public String toString() {
        return "Installments{" +
                "quantity=" + quantity +
                ", amount=" + amount +
                ", rate=" + rate +
                ", currency_id='" + currency_id + '\'' +
                '}';
    }
}