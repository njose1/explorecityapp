package com.example.ec.domain;

import java.util.Objects;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.AllArgsConstructor;

/**
 * A Classification of Tours.
 *
 * Created by Neethu Jose
 */
@Entity
@Data
@AllArgsConstructor
public class TourPackage {
	
    @Id
    @Getter
    private String code;

    @Column
    @Getter
    private String name;
    
    protected TourPackage() {
    	
    }
    
    @Override
    public String toString() {
        return "TourPackage{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourPackage that = (TourPackage) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }



}
