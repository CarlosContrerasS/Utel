package com.ejercicio.prueba.model.mapear;

import com.ejercicio.prueba.model.Producto;

import java.util.List;

//Lo que mapeo de la api
public class Entrada {
    private String site_id;
    private String country_default_time_zone;
    private String query;

    private Paging paging;
    private List<Results> results;
    private List<Secondary_results> secondary_results;
    private List<Related_results> related_results;
    private Sort sort;
    private List<Available_sorts> available_sorts;
    private List<Filters> filters;
    private List<Available_filters> available_filters;

    public Entrada() {
    }

    public String getCountry_default_time_zone() {
        return country_default_time_zone;
    }

    public void setCountry_default_time_zone(String country_default_time_zone) {
        this.country_default_time_zone = country_default_time_zone;
    }

    public String getSite_id() {
        return site_id;
    }

    public void setSite_id(String site_id) {
        this.site_id = site_id;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public Paging getPaging() {
        return paging;
    }

    public void setPaging(Paging paging) {
        this.paging = paging;
    }

    public List<Results> getResults() {
        return results;
    }

    public void setResults(List<Results> results) {
        this.results = results;
    }

    public List<Secondary_results> getSecondary_results() {
        return secondary_results;
    }

    public void setSecondary_results(List<Secondary_results> secondary_results) {
        this.secondary_results = secondary_results;
    }

    public List<Related_results> getRelated_results() {
        return related_results;
    }

    public void setRelated_results(List<Related_results> related_results) {
        this.related_results = related_results;
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public List<Available_sorts> getAvailable_sorts() {
        return available_sorts;
    }

    public void setAvailable_sorts(List<Available_sorts> available_sorts) {
        this.available_sorts = available_sorts;
    }

    public List<Filters> getFilters() {
        return filters;
    }

    public void setFilters(List<Filters> filters) {
        this.filters = filters;
    }

    public List<Available_filters> getAvailable_filters() {
        return available_filters;
    }

    public void setAvailable_filters(List<Available_filters> available_filters) {
        this.available_filters = available_filters;
    }

    @Override
    public String toString() {
        return "Entrada{" +
                "site_id='" + site_id + '\'' +
                ", country_default_time_zone='" + country_default_time_zone + '\'' +
                ", query='" + query + '\'' +
                ", paging=" + paging +
                ", results=" + results +
                ", secondary_results=" + secondary_results +
                ", related_results=" + related_results +
                ", sort=" + sort +
                ", available_sorts=" + available_sorts +
                ", filters=" + filters +
                ", available_filters=" + available_filters +
                '}';
    }
}