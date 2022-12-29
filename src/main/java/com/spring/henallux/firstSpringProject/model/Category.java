package com.spring.henallux.firstSpringProject.model;

import javax.validation.constraints.*;

public class Category {
    private Integer category_id;

    @NotNull
    @Min(value = 1)
    public Category(){
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
}
