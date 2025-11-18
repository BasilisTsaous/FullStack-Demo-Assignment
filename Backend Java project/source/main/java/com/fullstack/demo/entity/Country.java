package com.fullstack.demo.entity;

import jakarta.persistence.*;


@Entity
@Table(name = "countries")
public class Country {

    //Define fields
    @Id //Primary Key
    @Column (name = "country_id")
    private Integer id;

    @Column (name = "name")
    private String name;

    @Column (name = "area")
    private Double area;

    @Column (name = "country_code2")
    private String countryCode2;

    @Column (name = "country_code3")
    private String countryCode3;

//    @Column (name = "region_id")
//    private Integer regionId;

    //Define constructors
    public Country(){

    }



    //Define getters & setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public String getCountryCode2() {
        return countryCode2;
    }

    public void setCountryCode2(String countryCode2) {
        this.countryCode2 = countryCode2;
    }

    public String getCountryCode3() {
        return countryCode3;
    }

    public void setCountryCode3(String countryCode3) {
        this.countryCode3 = countryCode3;
    }

//    public Integer getRegionId() {
//        return regionId;
//    }
//
//    public void setRegionId(Integer regionId) {
//        this.regionId = regionId;
//    }

    //Define toString method
    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", countryCode2='" + countryCode2 + '\'' +
                '}';
    }
}
