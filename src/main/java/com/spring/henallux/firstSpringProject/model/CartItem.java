package com.spring.henallux.firstSpringProject.model;


import javax.validation.constraints.*;

public class CartItem {


    @NotNull
    @Min(value = 1)
    private Integer quantity;

    @NotNull
    @Min(value = 1)
    private Integer game_id;

    public CartItem() {
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }
}
