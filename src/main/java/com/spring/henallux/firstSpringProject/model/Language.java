package com.spring.henallux.firstSpringProject.model;
import javax.validation.constraints.*;

public class Language {

    @NotNull
    @Min(value = 1)
    private Integer language_id;

    private String locale;

    public Language() {
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public String getLocale() {
        return locale;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public void setLocale(String locale) {
        this.locale = locale;
    }
}
