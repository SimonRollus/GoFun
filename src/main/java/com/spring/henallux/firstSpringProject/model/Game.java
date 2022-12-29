package com.spring.henallux.firstSpringProject.model;
import javax.validation.constraints.*;
public class Game {

    @NotNull
    @Min(value = 1)
    private Integer game_id;

    @NotNull
    @Size(min = 5, max = 50)
    private String name;

    @NotNull
    @Size(min = 5, max = 300)
    private String description;

    @NotNull
    private Float price;
    private Discount discount;
    private Category category;

    private String image;

    private Integer minimum_age;

    private Integer minimum_number_players;

    private Integer maximum_number_players;

    private Float price_with_discount;


    public Game() {
    }

    // GETTERS
    public Integer getGameId() {
        return game_id;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public Float getPrice() {
        return price;
    }
    public Discount getDiscount() {
        return discount;
    }
    public Category getCategory() {
        return category;
    }

    public String getImage() {
        return image;
    }

    public Integer getMinimum_age() {
        return minimum_age;
    }

    public Integer getMinimum_number_players() {
        return minimum_number_players;
    }

    public Integer getMaximum_number_players() {
        return maximum_number_players;
    }

    public Float getPrice_with_discount() {
        return price_with_discount;
    }

    public boolean isOnDiscount(){
        return !this.price.equals(this.price_with_discount);
    }

    //SETTERS


    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(Float price) {
        this.price = price;
    }
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }
    public void setCategory(Category category) {
        this.category = category;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setMinimum_age(Integer minimum_age) {
        this.minimum_age = minimum_age;
    }

    public void setMinimum_number_players(Integer minimum_number_players) {
        this.minimum_number_players = minimum_number_players;
    }

    public void setMaximum_number_players(Integer maximum_number_players) {
        this.maximum_number_players = maximum_number_players;
    }

    public void setPrice_with_discount(Float price_with_discount) {
        this.price_with_discount = price_with_discount;
    }
}
