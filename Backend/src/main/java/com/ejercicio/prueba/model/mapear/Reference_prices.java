package com.ejercicio.prueba.model.mapear;

import java.util.List;

public class Reference_prices {
    private String id;
    private String type;
    private Integer amount;
    private String currency_id;
    private String exchange_rate_context;
    private String last_updated;

    private Conditions conditions;
    private List<Tags> tags;

    public Reference_prices() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public String getExchange_rate_context() {
        return exchange_rate_context;
    }

    public void setExchange_rate_context(String exchange_rate_context) {
        this.exchange_rate_context = exchange_rate_context;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Reference_prices{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", currency_id='" + currency_id + '\'' +
                ", exchange_rate_context='" + exchange_rate_context + '\'' +
                ", last_updated='" + last_updated + '\'' +
                ", conditions=" + conditions +
                ", tags=" + tags +
                '}';
    }
}
