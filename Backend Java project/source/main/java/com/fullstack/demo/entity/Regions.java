package com.fullstack.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table (name = "regions")
public class Regions {

    @Id
    @Column (name = "region_id")
    private Integer id;

    @Column (name = "name")
    private String name;

    public Regions() {
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Regions regions = (Regions) o;
        return Objects.equals(id, regions.id) && Objects.equals(name, regions.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Regions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
