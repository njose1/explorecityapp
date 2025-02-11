package com.example.ec.domain;

import java.util.Objects;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * The Tour contains all attributes of an Explore City Tour.
 *
 * Created by Neethu Jose
 */
@Entity
@Data
public class Tour {	

    @Id
    @GeneratedValue
    @Getter
    @Setter
    private Integer id;

    @Column
    @Getter
    @Setter
    private String title;

    @Column(length = 2000)
    @Getter
    @Setter
    private String description;

    @Column(length = 2000)
    @Getter
    @Setter
    private String blurb;

    @Column
    @Getter
    @Setter
    private Integer price;

    @Column
    @Getter
    @Setter
    private String duration;

    @Column(length = 2000)
    @Getter
    @Setter
    private String bullets;

    @Column
    @Getter
    @Setter
    private String keywords;


    @ManyToOne
    @Getter
    @Setter
    private TourPackage tourPackage;

    @Column
    @Enumerated
    @Getter
    @Setter
    private Difficulty difficulty;

    @Column
    @Enumerated
    @Getter
    @Setter
    private Region region;
    public Tour(String title, String description, String blurb, Integer price, String duration, String bullets,
            String keywords, TourPackage tourPackage, Difficulty difficulty, Region region) {
    this.title = title;
    this.description = description;
    this.blurb = blurb;
    this.price = price;
    this.duration = duration;
    this.bullets = bullets;
    this.keywords = keywords;
    this.tourPackage = tourPackage;
    this.difficulty = difficulty;
    this.region = region;
}
    protected Tour() {
    }

    @Override
    public String toString() {
        return "Tour{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", blurb='" + blurb + '\'' +
                ", price=" + price +
                ", duration='" + duration + '\'' +
                ", bullets='" + bullets + '\'' +
                ", keywords='" + keywords + '\'' +
                ", tourPackage=" + tourPackage +
                ", difficulty=" + difficulty +
                ", region=" + region +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tour tour = (Tour) o;
        return Objects.equals(id, tour.id) &&
                Objects.equals(title, tour.title) &&
                Objects.equals(description, tour.description) &&
                Objects.equals(blurb, tour.blurb) &&
                Objects.equals(price, tour.price) &&
                Objects.equals(duration, tour.duration) &&
                Objects.equals(bullets, tour.bullets) &&
                Objects.equals(keywords, tour.keywords) &&
                Objects.equals(tourPackage, tour.tourPackage) &&
                difficulty == tour.difficulty &&
                region == tour.region;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, description, blurb, price, duration, bullets, keywords, tourPackage, difficulty, region);
    }



}
