package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;


public class Seller_reputation {
    private String power_seller_status;
    private String level_id;

    private Transactions transactions;
    private Metrics metrics;

    @JsonProperty("protection_end_date")
    private JsonNode protection_end_date;

    @JsonProperty("real_level")
    private JsonNode real_level;

    public Seller_reputation() {
    }

    public JsonNode getProtection_end_date() {
        return protection_end_date;
    }

    public void setProtection_end_date(JsonNode protection_end_date) {
        this.protection_end_date = protection_end_date;
    }

    public JsonNode getReal_level() {
        return real_level;
    }

    public void setReal_level(JsonNode real_level) {
        this.real_level = real_level;
    }

    public String getPower_seller_status() {
        return power_seller_status;
    }

    public void setPower_seller_status(String power_seller_status) {
        this.power_seller_status = power_seller_status;
    }

    public String getLevel_id() {
        return level_id;
    }

    public void setLevel_id(String level_id) {
        this.level_id = level_id;
    }

    public Transactions getTransactions() {
        return transactions;
    }

    public void setTransactions(Transactions transactions) {
        this.transactions = transactions;
    }

    public Metrics getMetrics() {
        return metrics;
    }

    public void setMetrics(Metrics metrics) {
        this.metrics = metrics;
    }

    @Override
    public String toString() {
        return "Seller_reputation{" +
                "power_seller_status='" + power_seller_status + '\'' +
                ", level_id='" + level_id + '\'' +
                ", transactions=" + transactions +
                ", metrics=" + metrics +
                '}';
    }
}
