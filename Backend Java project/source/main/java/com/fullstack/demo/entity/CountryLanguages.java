package com.fullstack.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "country_languages")
public class CountryLanguages {

    @Id
    @Column (name = "country_id")
    private int countryId;

    @Id
    @Column (name = "language_id")
    private int langId;

    public CountryLanguages() {
    }

    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    public int getLangId() {
        return langId;
    }

    public void setLangId(int langId) {
        this.langId = langId;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CountryLanguages that = (CountryLanguages) o;
        return countryId == that.countryId && langId == that.langId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, langId);
    }

    @Override
    public String toString() {
        return "CountryLanguages{" +
                "countryId=" + countryId +
                ", langId=" + langId +
                '}';
    }
}
