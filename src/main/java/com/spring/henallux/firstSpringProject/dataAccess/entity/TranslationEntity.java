package com.spring.henallux.firstSpringProject.dataAccess.entity;

import com.spring.henallux.firstSpringProject.model.Language;

import javax.persistence.*;


@Entity
@Table(name="translation")
public class TranslationEntity {

    @Id
    @Column(name="translation_id")
    private Integer translation_id;

    @Column(name="label")
    private String label;

    @JoinColumn(name = "language_fk", referencedColumnName = "language_id")
    @ManyToOne
    private LanguageEntity language;

    @JoinColumn(name = "category_fk", referencedColumnName = "category_id")
    @ManyToOne
    private CategoryEntity category;

    public TranslationEntity() {
    }

    public Integer getTranslation_id() {
        return translation_id;
    }

    public String getLabel() {
        return label;
    }

    public LanguageEntity getLanguage() {
        return language;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setTranslation_id(Integer translation_id) {
        this.translation_id = translation_id;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setLanguage(LanguageEntity language) {
        this.language = language;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }
}
