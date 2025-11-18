package com.fullstack.demo.entity;

public class FilterStats {
    private String regionName;
    private String continentName;
    private String countryName;
    private Integer year;
    private Integer population;
    private Long gdp;

    public FilterStats(String regionName, String continentName, String countryName, Integer year, Integer population, Long gdp) {
        this.regionName = regionName;
        this.continentName = continentName;
        this.countryName = countryName;
        this.year = year;
        this.population = population;
        this.gdp = gdp;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
