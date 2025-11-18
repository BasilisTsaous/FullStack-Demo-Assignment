package com.fullstack.demo.entity;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table (name = "continents")
public class Continents {

    @Id
    @Column (name = "continent_id")
    private Integer id;

    @Column (name = "name")
    private String name;

    public Continents(Integer id, String name) {
        this.id = id;
        this.name = name;
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
        Continents that = (Continents) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Continents{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
