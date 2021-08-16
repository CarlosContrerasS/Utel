package com.ejercicio.prueba.model.mapear;

public class Ratings {
    private float negative;
    private float positive;
    private float neutral;

    public Ratings() {
    }

    public float getNegative() {
        return negative;
    }

    public void setNegative(float negative) {
        this.negative = negative;
    }

    public float getPositive() {
        return positive;
    }

    public void setPositive(float positive) {
        this.positive = positive;
    }

    public float getNeutral() {
        return neutral;
    }

    public void setNeutral(float neutral) {
        this.neutral = neutral;
    }

    @Override
    public String toString() {
        return "Ratings{" +
                "rating=" + negative +
                ", positive=" + positive +
                ", neutral=" + neutral +
                '}';
    }
}
