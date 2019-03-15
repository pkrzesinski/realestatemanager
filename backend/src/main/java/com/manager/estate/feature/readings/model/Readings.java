package com.manager.estate.feature.readings.model;

import com.manager.estate.feature.mediaType.MediaType;
import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class Readings extends DatabaseEntity {

    @NotNull
    private LocalDate readingDate;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ReadingValue> readingValues;
    @NotNull
    private MediaType mediaType;
}
