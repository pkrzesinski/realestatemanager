package com.manager.estate.feature.readingDate;

import com.manager.estate.feature.mediaType.MediaType;
import com.manager.estate.feature.reading.model.Reading;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReadingDate {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate readingDate;
    private List<Reading> readings;
    private MediaType mediaType;
}
