package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.*;


import java.util.Date;

@Entity
@Table(name = "discount")
public class DiscountEntity {
    @Id
    @Column(name = "discount_id")
    private Integer discount_id;

    @Column(name = "percentage_discount")
    private Float percentage_discount;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;
    //endregion


    public DiscountEntity() {
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