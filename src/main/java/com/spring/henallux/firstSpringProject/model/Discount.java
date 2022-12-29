package com.spring.henallux.firstSpringProject.model;

import javax.validation.constraints.*;

import java.util.Date;

public class Discount {

    @NotNull
    @Min(value = 1)
    private Integer discount_id;

    @NotNull
    @Min(value = 1)
    private Float percentage_discount;
    private Date start_date;
    private Date end_date;


    public Discount() {
    }

    public Integer getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(Integer discount_id) {
        this.discount_id = discount_id;
    }

    public Float getPercentage_discount() {
        return percentage_discount;
    }

    public void setPercentage_discount(Float percentage_discount) {
        this.percentage_discount = percentage_discount;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }
}
