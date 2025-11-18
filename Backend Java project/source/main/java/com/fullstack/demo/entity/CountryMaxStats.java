package com.fullstack.demo.entity;

//Create a new java class which will hold the results
public class CountryMaxStats {

    private String name;
    private String countryCode3;
    private Integer year;
    private Integer population;
    private Long gdp;

    public CountryMaxStats(String name, String countryCode3, Integer year, Integer population, Long gdp) {
        this.name = name;
        this.countryCode3 = countryCode3;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
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
}
