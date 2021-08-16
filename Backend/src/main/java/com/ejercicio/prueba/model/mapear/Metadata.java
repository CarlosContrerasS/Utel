package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

public class Metadata {

    @JsonProperty("campaign_id")
    private JsonNode campaign_id;

    @JsonProperty("promotion_id")
    private JsonNode promotion_id;

    @JsonProperty("promotion_type")
    private JsonNode promotion_type;

    @JsonProperty("discount_meli_amount")
    private JsonNode discount_meli_amount;

    @JsonProperty("campaign_discount_percentage")
    private JsonNode campaign_discount_percentage;

    @JsonProperty("campaign_end_date")
    private JsonNode campaign_end_date;

    @JsonProperty("order_item_price")
    private JsonNode order_item_price;

    public Metadata() {
    }

    public JsonNode getCampaign_id() {
        return campaign_id;
    }

    public void setCampaign_id(JsonNode campaign_id) {
        this.campaign_id = campaign_id;
    }

    public JsonNode getPromotion_id() {
        return promotion_id;
    }

    public void setPromotion_id(JsonNode promotion_id) {
        this.promotion_id = promotion_id;
    }

    public JsonNode getPromotion_type() {
        return promotion_type;
    }

    public void setPromotion_type(JsonNode promotion_type) {
        this.promotion_type = promotion_type;
    }

    public JsonNode getDiscount_meli_amount() {
        return discount_meli_amount;
    }

    public void setDiscount_meli_amount(JsonNode discount_meli_amount) {
        this.discount_meli_amount = discount_meli_amount;
    }

    public JsonNode getCampaign_discount_percentage() {
        return campaign_discount_percentage;
    }

    public void setCampaign_discount_percentage(JsonNode campaign_discount_percentage) {
        this.campaign_discount_percentage = campaign_discount_percentage;
    }

    public JsonNode getCampaign_end_date() {
        return campaign_end_date;
    }

    public void setCampaign_end_date(JsonNode campaign_end_date) {
        this.campaign_end_date = campaign_end_date;
    }

    public JsonNode getOrder_item_price() {
        return order_item_price;
    }

    public void setOrder_item_price(JsonNode order_item_price) {
        this.order_item_price = order_item_price;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "campaign_id=" + campaign_id +
                ", promotion_id=" + promotion_id +
                ", promotion_type=" + promotion_type +
                ", discount_meli_amount=" + discount_meli_amount +
                ", campaign_discount_percentage=" + campaign_discount_percentage +
                ", campaign_end_date=" + campaign_end_date +
                ", order_item_price=" + order_item_price +
                '}';
    }
}
