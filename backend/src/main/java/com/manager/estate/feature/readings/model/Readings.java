package com.manager.estate.feature.readings.model;

import com.manager.estate.feature.mediaType.MediaType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Readings {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate readingDate;
    @OneToMany
    private List<ReadingValue> readingValues;
    private MediaType mediaType;
}
