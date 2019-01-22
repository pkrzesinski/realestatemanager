package com.manager.estate.feature.apartment.model;

import com.manager.estate.feature.property.model.Property;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Apartment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String number;
    private int floor;
    private int rooms;
    private double size;
    private String description;

    @ManyToOne
    private Property property;
}
