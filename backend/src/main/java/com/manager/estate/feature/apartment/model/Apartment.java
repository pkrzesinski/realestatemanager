package com.manager.estate.feature.apartment.model;

import com.manager.estate.feature.property.model.Property;
import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Min;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"number", "property_id"}, name = "UNIQUE_APARTMENT_NUM_FOR_PROPERTY_CONSTRAINT")})
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class Apartment extends DatabaseEntity {

    @NotEmpty
    private String number;
    private int floor;
    @Min(0)
    private int rooms;
    @Min(0)
    private double size;
    @NotEmpty
    private String description;
    @ManyToOne(optional = false)
    private Property property;
}