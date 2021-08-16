package com.ejercicio.prueba.model.mapear;


public class Paging {
    private Integer id;

    private Integer total;
    private Integer primary_results;
    private Integer offset;
    private Integer limit;


    public Paging() {
    }

    public Paging(Integer id, Integer total, Integer primary_results, Integer offset,
                  Integer limit) {
        this.id = id;
        this.total = total;
        this.primary_results = primary_results;
        this.offset = offset;
        this.limit = limit;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getPrimary_results() {
        return primary_results;
    }

    public void setPrimary_results(Integer primary_results) {
        this.primary_results = primary_results;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "Paging{" +
                "id=" + id +
                ", total=" + total +
                ", primary_results=" + primary_results +
                ", offset=" + offset +
                ", limit=" + limit +
                '}';
    }
}
