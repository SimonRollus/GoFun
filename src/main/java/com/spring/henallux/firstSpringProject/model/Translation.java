package com.spring.henallux.firstSpringProject.model;

import javax.validation.constraints.*;

public class Translation {
    @NotNull
    @Min(value = 1)
    private Integer translation_id;
    @NotNull
    @Size(min = 5, max = 50)
    private String label;
    @NotNull
    private Language language;
    @NotNull
    private Category category;

    public Translation(Integer translation_id, String label, Language language, Category category) {
        this.translation_id = translation_id;
        this.label = label;
        this.language = language;
        this.category = category;
    }

    public Translation() {
    }

    public Integer getTranslation_id() {
        return translation_id;
    }

    public String getLabel() {
        return label;
    }

    public Language getLanguage() {
        return language;
    }

    public Category getCategory() {
        return category;
    }

    public void setTranslation_id(Integer translation_id) {
        this.translation_id = translation_id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
