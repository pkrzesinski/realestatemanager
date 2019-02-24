package com.manager.estate.feature.property.model;

import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Entity;

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