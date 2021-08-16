package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class Prices {
    private String id;
    private Presentation presentation;
    private List<Prices_prices> prices;
    private List<Payment_method_prices> payment_method_prices;
    private List<Purchase_discounts> purchase_discounts;
    private List<Reference_prices> reference_prices;

    @JsonProperty("differing_price_variations")
    private JsonNode differing_price_variations;

    public Prices() {
    }

    public JsonNode getDiffering_price_variations() {
        return differing_price_variations;
    }

    public void setDiffering_price_variations(JsonNode differing_price_variations) {
        this.differing_price_variations = differing_price_variations;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Presentation getPresentation() {
        return presentation;
    }

    public void setPresentation(Presentation presentation) {
        this.presentation = presentation;
    }

    public List<Prices_prices> getPrices() {
        return prices;
    }

    public void setPrices(List<Prices_prices> prices) {
        this.prices = prices;
    }

    public List<Payment_method_prices> getPayment_method_prices() {
        return payment_method_prices;
    }

    public void setPayment_method_prices(List<Payment_method_prices> payment_method_prices) {
        this.payment_method_prices = payment_method_prices;
    }

    public List<Purchase_discounts> getPurchase_discounts() {
        return purchase_discounts;
    }

    public void setPurchase_discounts(List<Purchase_discounts> purchase_discounts) {
        this.purchase_discounts = purchase_discounts;
    }

    public List<Reference_prices> getReference_prices() {
        return reference_prices;
    }

    public void setReference_prices(List<Reference_prices> reference_prices) {
        this.reference_prices = reference_prices;
    }

    @Override
    public String toString() {
        return "Prices{" +
                "id='" + id + '\'' +
                ", presentation=" + presentation +
                ", prices=" + prices +
                ", payment_method_prices=" + payment_method_prices +
                ", purchase_discounts=" + purchase_discounts +
                ", reference_prices=" + reference_prices +
                '}';
    }
}

