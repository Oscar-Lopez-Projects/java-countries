package com.lambdaschool.javacountries.models;

import javax.persistence.*;

@Entity
@Table(name="worldcountry")
public class WorldCountries {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private long empid;
    private String name;
    private  long population;
    private int medianage;

    public WorldCountries(String name, long population, int medianage) {
        this.name = name;
        this.population = population;
        this.medianage = medianage;
    }

    public WorldCountries() {
    }

    public long getEmpid() {
        return empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getMedianage() {
        return medianage;
    }

    public void setMedianage(int medianage) {
        this.medianage = medianage;
    }

    @Override
    public String toString() {
        return "WorldCountries{" +
                "empid=" + empid +
                ", name='" + name + '\'' +
                ", population=" + population +
                ", medianage=" + medianage +
                '}';
    }
}
