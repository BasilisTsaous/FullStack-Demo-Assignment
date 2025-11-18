package com.fullstack.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table( name = "country_stats")
public class CountryStats {

    @Id
    @Column (name = "country_id")
    private Integer countryId;

    @Id
    @Column (name = "year")
    private Integer year;

    @Column (name = "population")
    private Integer population;

    @Column (name = "gdp")
    private Long gdp;

    public CountryStats() {
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Long getGdp() {
        return gdp;
    }

    public void setGdp(Long gdp) {
        this.gdp = gdp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CountryStats that = (CountryStats) o;
        return Objects.equals(countryId, that.countryId) && Objects.equals(year, that.year) && Objects.equals(population, that.population) && Objects.equals(gdp, that.gdp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(countryId, year, population, gdp);
    }

    @Override
    public String toString() {
        return "CountryStats{" +
                "countryId=" + countryId +
                ", year=" + year +
                ", population=" + population +
                ", gdp=" + gdp +
                '}';
    }
}
