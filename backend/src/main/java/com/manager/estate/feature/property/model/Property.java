package com.manager.estate.feature.property.model;

import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"street", "buildingNumber", "city"}, name = "UNIQUE_ADDRESS_CONSTRAINT")})
@Entity
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Property extends DatabaseEntity {

    @NotEmpty
    private String street;
    @NotEmpty
    private String buildingNumber;
    @NotEmpty
    private String city;
    @NotEmpty
    private String postCode;
}