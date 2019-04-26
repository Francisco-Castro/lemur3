package com.zipcode.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Lemur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer age;
    private Double weight;
    private String species;

    public Lemur() {
    }


    public Lemur(Integer age, Double weight, String species) {
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Lemur(Long id, Integer age, Double weight, String species) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.species = species;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Lemur{" +
                "id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", species='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lemur lemur = (Lemur) o;
        return Objects.equals(id, lemur.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
