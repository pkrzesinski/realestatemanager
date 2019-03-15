package com.manager.estate.feature.meter.model;

import com.manager.estate.feature.apartment.model.Apartment;
import com.manager.estate.feature.mediaType.MediaType;
import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;

@Entity
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Meter extends DatabaseEntity {

    @Column(unique = true)
    @NotEmpty
    private String serialNumber;
    @Enumerated(EnumType.STRING)
    private MediaType mediaType;
    @ManyToOne(optional = false)
    private Apartment apartment;
}