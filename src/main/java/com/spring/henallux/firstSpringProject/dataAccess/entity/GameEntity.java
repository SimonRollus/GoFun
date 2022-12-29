package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.*;

@Entity
@Table(name="game")
public class GameEntity {
    @Id
    @Column(name = "game_id")
    private Integer game_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Float price;


    @JoinColumn(name = "discount_fk", referencedColumnName = "discount_id")
    @ManyToOne
    private DiscountEntity discount;

    @JoinColumn(name = "category_fk", referencedColumnName = "category_id")
    @ManyToOne
    private CategoryEntity category;

    @Column(name = "image")
    private String image;

    @Column(name = "minimum_age")
    private Integer minimum_age;

    @Column(name="minimum_number_players")
    private Integer minimum_number_players;

    @Column(name="maximum_number_players")
    private Integer maximum_number_players;

    public GameEntity() {
    }

    public Integer getGame_id() {
        return game_id;
    }

    public void setGame_id(Integer game_id) {
        this.game_id = game_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public DiscountEntity getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountEntity discount) {
        this.discount = discount;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getMinimum_age() {
        return minimum_age;
    }

    public void setMinimum_age(Integer minimum_age) {
        this.minimum_age = minimum_age;
    }

    public Integer getMinimum_number_players() {
        return minimum_number_players;
    }

    public void setMinimum_number_players(Integer minimum_number_players) {
        this.minimum_number_players = minimum_number_players;
    }

    public Integer getMaximum_number_players() {
        return maximum_number_players;
    }

    public void setMaximum_number_players(Integer maximum_number_players) {
        this.maximum_number_players = maximum_number_players;
    }
}
