package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table(name="order_line")
public class OrderLineEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_line_id")
    private Integer order_line_id;

    @Column(name="real_price")
    private Float real_price;

    @Column(name="quantity")
    private Integer quantity;

    @JoinColumn(name="order_fk", referencedColumnName = "order_id")
    @ManyToOne
    private OrderEntity order;

    @JoinColumn(name="game_fk", referencedColumnName = "game_id")
    @ManyToOne
    private GameEntity game;

    public OrderLineEntity() {
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

    public OrderEntity getOrder() {
        return order;
    }

    public GameEntity getGame() {
        return game;
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

    public void setOrder(OrderEntity order) {
        this.order = order;
    }

    public void setGame(GameEntity game) {
        this.game = game;
    }
}
