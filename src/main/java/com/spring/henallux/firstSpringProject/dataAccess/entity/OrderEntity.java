package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="`order`")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="order_id")
    private Integer order_id;

    @Column(name = "order_date")
    private Date order_date;

    @Column(name = "is_order_paid")
    private Boolean isOrderPaid;

    @JoinColumn(name = "customer_fk", referencedColumnName = "customer_id")
    @ManyToOne
    private CustomerEntity customer;

    public OrderEntity() {
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public Boolean getOrderPaid() {
        return isOrderPaid;
    }

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public void setOrderPaid(Boolean orderPaid) {
        isOrderPaid = orderPaid;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }
}
