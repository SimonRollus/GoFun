package com.spring.henallux.firstSpringProject.dataAccess.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="language")
public class LanguageEntity {

    @Id
    @Column(name="language_id")
    private Integer language_id;

    @Column(name="locale")
    private String locale;


    public LanguageEntity() {
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
