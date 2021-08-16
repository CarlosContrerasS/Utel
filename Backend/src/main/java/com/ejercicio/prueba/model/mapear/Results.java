package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class Results {
    private String id;
    private String site_id;
    private String title;
    private Seller seller;
    private Integer price;
    private String sale_price;
    private String currency_id;
    private Integer available_quantity;
    private Integer sold_quantity;
    private String buying_mode;
    private String listing_type_id;
    private String stop_time;
    private String condition;
    private String permalink;
    private String thumbnail;
    private String thumbnail_id;
    private boolean accepts_mercadopago;
    private Integer original_price;
    private String category_id;
    private String official_store_id;
    private String domain_id;
    private String catalog_product_id;
    private int order_backend;
    private boolean use_thumbnail_id;

    @JsonProperty("catalog_listing")
    private JsonNode catalog_listing;

    @JsonProperty("differential_pricing")
    private JsonNode differential_pricing;


    private Prices prices;
    private Installments installments;
    private Address address;
    private Shipping shipping;
    private Seller_address seller_address;
    private List<Attributes> attributes;
    private List<Tags> tags;

    public Results() {
    }

    public JsonNode getCatalog_listing() {
        return catalog_listing;
    }

    public void setCatalog_listing(JsonNode catalog_listing) {
        this.catalog_listing = catalog_listing;
    }

    public JsonNode getDifferential_pricing() {
        return differential_pricing;
    }

    public void setDifferential_pricing(JsonNode differential_pricing) {
        this.differential_pricing = differential_pricing;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getCurrency_id() {
        return currency_id;
    }

    public void setCurrency_id(String currency_id) {
        this.currency_id = currency_id;
    }

    public Integer getAvailable_quantity() {
        return available_quantity;
    }

    public void setAvailable_quantity(Integer available_quantity) {
        this.available_quantity = available_quantity;
    }

    public Integer getSold_quantity() {
        return sold_quantity;
    }

    public void setSold_quantity(Integer sold_quantity) {
        this.sold_quantity = sold_quantity;
    }

    public String getBuying_mode() {
        return buying_mode;
    }

    public void setBuying_mode(String buying_mode) {
        this.buying_mode = buying_mode;
    }

    public String getListing_type_id() {
        return listing_type_id;
    }

    public void setListing_type_id(String listing_type_id) {
        this.listing_type_id = listing_type_id;
    }

    public String getStop_time() {
        return stop_time;
    }

    public void setStop_time(String stop_time) {
        this.stop_time = stop_time;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getThumbnail_id() {
        return thumbnail_id;
    }

    public void setThumbnail_id(String thumbnail_id) {
        this.thumbnail_id = thumbnail_id;
    }

    public boolean isAccepts_mercadopago() {
        return accepts_mercadopago;
    }

    public void setAccepts_mercadopago(boolean accepts_mercadopago) {
        this.accepts_mercadopago = accepts_mercadopago;
    }

    public Integer getOriginal_price() {
        return original_price;
    }

    public void setOriginal_price(Integer original_price) {
        this.original_price = original_price;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getOfficial_store_id() {
        return official_store_id;
    }

    public void setOfficial_store_id(String official_store_id) {
        this.official_store_id = official_store_id;
    }

    public String getDomain_id() {
        return domain_id;
    }

    public void setDomain_id(String domain_id) {
        this.domain_id = domain_id;
    }

    public String getCatalog_product_id() {
        return catalog_product_id;
    }

    public void setCatalog_product_id(String catalog_product_id) {
        this.catalog_product_id = catalog_product_id;
    }

    public int getOrder_backend() {
        return order_backend;
    }

    public void setOrder_backend(int order_backend) {
        this.order_backend = order_backend;
    }

    public boolean isUse_thumbnail_id() {
        return use_thumbnail_id;
    }

    public void setUse_thumbnail_id(boolean use_thumbnail_id) {
        this.use_thumbnail_id = use_thumbnail_id;
    }

    public Prices getPrices() {
        return prices;
    }

    public void setPrices(Prices prices) {
        this.prices = prices;
    }

    public Installments getInstallments() {
        return installments;
    }

    public void setInstallments(Installments installments) {
        this.installments = installments;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public Seller_address getSeller_address() {
        return seller_address;
    }

    public void setSeller_address(Seller_address seller_address) {
        this.seller_address = seller_address;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Results{" +
                "id='" + id + '\'' +
                ", site_id='" + site_id + '\'' +
                ", title='" + title + '\'' +
                ", seller=" + seller +
                ", price=" + price +
                ", sale_price='" + sale_price + '\'' +
                ", currency_id='" + currency_id + '\'' +
                ", available_quantity=" + available_quantity +
                ", sold_quantity=" + sold_quantity +
                ", buying_mode='" + buying_mode + '\'' +
                ", listing_type_id='" + listing_type_id + '\'' +
                ", stop_time='" + stop_time + '\'' +
                ", condition='" + condition + '\'' +
                ", permalink='" + permalink + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", thumbnail_id='" + thumbnail_id + '\'' +
                ", accepts_mercadopago=" + accepts_mercadopago +
                ", original_price=" + original_price +
                ", category_id='" + category_id + '\'' +
                ", official_store_id='" + official_store_id + '\'' +
                ", domain_id='" + domain_id + '\'' +
                ", catalog_product_id='" + catalog_product_id + '\'' +
                ", order_backend=" + order_backend +
                ", use_thumbnail_id=" + use_thumbnail_id +
                ", prices=" + prices +
                ", installments=" + installments +
                ", address=" + address +
                ", shipping=" + shipping +
                ", seller_address=" + seller_address +
                ", attributes=" + attributes +
                ", tags=" + tags +
                '}';
    }
}
