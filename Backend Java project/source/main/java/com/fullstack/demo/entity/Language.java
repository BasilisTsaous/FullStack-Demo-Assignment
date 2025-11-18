package com.fullstack.demo.entity;

import jakarta.persistence.*;

@Entity
@Table (name = "languages")
public class Language {

    //Define fields
    @Id
    @Column (name = "language_id")
    private Integer languageId;

    @Column (name = "language")
    private String language;

    //Define constructor
    public Language() {
    }

    //Define getters & setters
    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    //Define toString method
    @Override
    public String toString() {
        return "Language{" +
                "languageId=" + languageId +
                ", language='" + language + '\'' +
                '}';
    }
}
