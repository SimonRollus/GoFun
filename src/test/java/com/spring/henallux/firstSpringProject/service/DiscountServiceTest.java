package com.spring.henallux.firstSpringProject.service;

import com.spring.henallux.firstSpringProject.model.Discount;
import com.spring.henallux.firstSpringProject.model.Game;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DiscountServiceTest {

    private DiscountService discountService;

    @Before
    public void setUp() {
        this.discountService = new DiscountService();
    }

    @Test
    void getPriceOnDiscount() {
        Game game = new Game();

        Discount discount = new Discount();
        discount.setPercentage_discount(20F);

        game.setPrice(100F);
        game.setDiscount(discount);

        Assert.assertEquals(java.util.Optional.of(80F), this.discountService.getPriceOnDiscount(game));
    }
}