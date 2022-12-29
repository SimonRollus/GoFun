package com.spring.henallux.firstSpringProject.model;

import java.util.Date;
import javax.validation.constraints.*;

public class Order {

    @NotNull
    @Min(value = 1)
    private Integer order_id;

    @NotNull
    private Date order_date;
    @NotNull
    private Boolean is_order_paid;

    private Customer customer;

    public Order() {
    }

    public Order(Integer order_id, Date order_date, Boolean is_order_paid, Customer customer) {
        setOrder_id(order_id);
        setOrder_date(order_date);
        setIs_order_paid(is_order_paid);
        setCustomer(customer);
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public Boolean getIs_order_paid() {
        return is_order_paid;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public void setIs_order_paid(Boolean is_order_paid) {
        this.is_order_paid = is_order_paid;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
