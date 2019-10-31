package com.distilled.beer.entity;


import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="beer")
public class BeerEntity implements Serializable {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = true)
    private String beerID;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private Double abv;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String breweryName;


    @Column(nullable = false)
    private String breweryLocation;

    @Column(nullable = false)
    private String image;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBeerID() {
        return beerID;
    }

    public void setBeerID(String beerID) {
        this.beerID = beerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAbv() {
        return abv;
    }

    public void setAbv(Double abv) {
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

    @Override
    public String toString() {
        return "BeerEntity{" +
                "id=" + id +
                ", beerID='" + beerID + '\'' +
                ", name='" + name + '\'' +
                ", abv=" + abv +
                ", description='" + description + '\'' +
                ", breweryName='" + breweryName + '\'' +
                ", breweryLocation='" + breweryLocation + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
