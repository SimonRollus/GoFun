package com.spring.henallux.firstSpringProject.model;

import javax.validation.constraints.*;

public class OrderLine {

    @NotNull
    @Min(value = 1)
    private Integer order_line_id;
    @NotNull
    @Min(value = 1)
    private Float real_price;
    @NotNull
    @Min(value = 1)
    private Integer quantity;

    private Order order;

    private Game game;

    public OrderLine(Integer order_line_id, Float real_price, Integer quantity, Order order, Game game){
        setOrder(order);
        setOrder_line_id(order_line_id);
        setReal_price(real_price);
        setGame(game);
        setQuantity(quantity);
    }
    public OrderLine() {
    }

    public Integer getOrder_line_id() {
        return order_line_id;
    }

    public Float getReal_price() {
        return real_price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Order getOrder() {
        return order;
    }

    public Game getGame() {
        return game;
    }

    public float getSubTotalPrice(){
        return this.real_price * this.quantity;
    }

    public void setOrder_line_id(Integer order_line_id) {
        this.order_line_id = order_line_id;
    }

    public void setReal_price(Float real_price) {
        this.real_price = real_price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
