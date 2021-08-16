package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;


public class Prices_prices {
    private String id;
    private String type;
    private Integer amount;
    private String regular_amount;
    private String currency_id;
    private String exchange_rate_context;
    private String last_updated;
    private Metadata metadata;

    private Conditions conditions;

    @JsonProperty("payment_method_type")
    private JsonNode payment_method_type;

    public Prices_prices() {
    }

    public JsonNode getPayment_method_type() {
        return payment_method_type;
    }

    public void setPayment_method_type(JsonNode payment_method_type) {
        this.payment_method_type = payment_method_type;
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

    public String getRegular_amount() {
        return regular_amount;
    }

    public void setRegular_amount(String regular_amount) {
        this.regular_amount = regular_amount;
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

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public Conditions getConditions() {
        return conditions;
    }

    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    @Override
    public String toString() {
        return "Prices_prices{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", regular_amount='" + regular_amount + '\'' +
                ", currency_id='" + currency_id + '\'' +
                ", exchange_rate_context='" + exchange_rate_context + '\'' +
                ", last_updated='" + last_updated + '\'' +
                ", metadata=" + metadata +
                ", conditions=" + conditions +
                '}';
    }
}