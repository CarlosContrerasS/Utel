package com.ejercicio.prueba.model.mapear;

public class Transactions {
    private Integer total;
    private Integer canceled;
    private String period;
    private Integer completed;

    private Ratings ratings;

    public Transactions() {
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getCanceled() {
        return canceled;
    }

    public void setCanceled(Integer canceled) {
        this.canceled = canceled;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public Integer getCompleted() {
        return completed;
    }

    public void setCompleted(Integer completed) {
        this.completed = completed;
    }

    public Ratings getRatings() {
        return ratings;
    }

    public void setRatings(Ratings ratings) {
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "total=" + total +
                ", canceled=" + canceled +
                ", period='" + period + '\'' +
                ", completed=" + completed +
                ", ratings=" + ratings +
                '}';
    }
}
