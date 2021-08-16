package com.ejercicio.prueba.model.mapear;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.List;

public class Eshop {
    private String nick_name;
    private Integer eshop_id;
    private String site_id;
    private String eshop_logo_url;
    private Integer eshop_status_id;
    private Integer seller;
    private Integer eshop_experience;

    private List<Eshop_locations> eshop_locations;

    @JsonProperty("eshop_rubro")
    private JsonNode eshop_rubro;

    public Eshop() {
    }

    public String getNick_name() {
        return nick_name;
    }

    public void setNick_name(String nick_name) {
        this.nick_name = nick_name;
    }

    public JsonNode getEshop_rubro() {
        return eshop_rubro;
    }

    public void setEshop_rubro(JsonNode eshop_rubro) {
        this.eshop_rubro = eshop_rubro;
    }

    public Integer getEshop_id() {
        return eshop_id;
    }

    public void setEshop_id(Integer eshop_id) {
        this.eshop_id = eshop_id;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getEshop_logo_url() {
        return eshop_logo_url;
    }

    public void setEshop_logo_url(String eshop_logo_url) {
        this.eshop_logo_url = eshop_logo_url;
    }

    public Integer getEshop_status_id() {
        return eshop_status_id;
    }

    public void setEshop_status_id(Integer eshop_status_id) {
        this.eshop_status_id = eshop_status_id;
    }

    public Integer getSeller() {
        return seller;
    }

    public void setSeller(Integer seller) {
        this.seller = seller;
    }

    public Integer getEshop_experience() {
        return eshop_experience;
    }

    public void setEshop_experience(Integer eshop_experience) {
        this.eshop_experience = eshop_experience;
    }

    public List<Eshop_locations> getEshop_locations() {
        return eshop_locations;
    }

    public void setEshop_locations(List<Eshop_locations> eshop_locations) {
        this.eshop_locations = eshop_locations;
    }

    @Override
    public String toString() {
        return "Eshop{" +
                "nick_name='" + nick_name + '\'' +
                ", eshop_rubro='" + eshop_rubro + '\'' +
                ", eshop_id=" + eshop_id +
                ", site_id='" + site_id + '\'' +
                ", eshop_logo_url='" + eshop_logo_url + '\'' +
                ", eshop_status_id=" + eshop_status_id +
                ", seller=" + seller +
                ", eshop_experience=" + eshop_experience +
                ", eshop_locations=" + eshop_locations +
                '}';
    }
}
