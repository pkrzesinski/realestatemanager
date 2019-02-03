package com.manager.estate.feature.readingDate;

import com.manager.estate.feature.mediaType.MediaType;
import com.manager.estate.feature.reading.model.MeterValue;
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
public class MeterReadingDate {
    @Id
    @GeneratedValue
    private Long id;
    private LocalDate readingDate;
    private List<MeterValue> readings;
    private MediaType mediaType;
}
