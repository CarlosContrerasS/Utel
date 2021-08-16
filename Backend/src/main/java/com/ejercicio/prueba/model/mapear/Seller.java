package com.ejercicio.prueba.model.mapear;

import java.util.List;

public class Seller {
    private Integer id;
    private String permalink;
    private String registration_date;
    private boolean car_dealer;
    private boolean real_estate_agency;
    private List<Tags> tags;
    private Eshop eshop;
    private Seller_reputation seller_reputation;

    public Seller() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    public String getRegistration_date() {
        return registration_date;
    }

    public void setRegistration_date(String registration_date) {
        this.registration_date = registration_date;
    }

    public boolean isCar_dealer() {
        return car_dealer;
    }

    public void setCar_dealer(boolean car_dealer) {
        this.car_dealer = car_dealer;
    }

    public boolean isReal_estate_agency() {
        return real_estate_agency;
    }

    public void setReal_estate_agency(boolean real_estate_agency) {
        this.real_estate_agency = real_estate_agency;
    }

    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public Eshop getEshop() {
        return eshop;
    }

    public void setEshop(Eshop eshop) {
        this.eshop = eshop;
    }

    public Seller_reputation getSeller_reputation() {
        return seller_reputation;
    }

    public void setSeller_reputation(Seller_reputation seller_reputation) {
        this.seller_reputation = seller_reputation;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "id=" + id +
                ", permalink='" + permalink + '\'' +
                ", registration_date='" + registration_date + '\'' +
                ", car_dealer=" + car_dealer +
                ", real_estate_agency=" + real_estate_agency +
                ", tags=" + tags +
                ", eshop=" + eshop +
                ", seller_reputation=" + seller_reputation +
                '}';
    }
}



