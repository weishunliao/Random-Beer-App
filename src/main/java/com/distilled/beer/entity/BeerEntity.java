package com.distilled.beer.entity;


import javax.persistence.*;
import java.io.Serializable;


@Entity
public class BeerEntity implements Serializable {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = true)
    private String bearID;

    @Column(nullable = false, length = 255)
    private String name;

    @Column(nullable = false)
    private double abv;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String breweryName;


    @Column(nullable = false)
    private String breweryLocation;

    @Column(nullable = false)
    private String image;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBearID() {
        return bearID;
    }

    public void setBearID(String bearID) {
        this.bearID = bearID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAbv() {
        return abv;
    }

    public void setAbv(double abv) {
        this.abv = abv;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBreweryName() {
        return breweryName;
    }

    public void setBreweryName(String breweryName) {
        this.breweryName = breweryName;
    }

    public String getBreweryLocation() {
        return breweryLocation;
    }

    public void setBreweryLocation(String breweryLocation) {
        this.breweryLocation = breweryLocation;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
