package com.manager.estate.feature.invoice.model;

import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice extends DatabaseEntity {

    @NotNull
    private LocalDate issueDate;
    @Column(unique = true)
    @NotEmpty
    private String invoiceNumber;
    @Min(0)
    private double amount;
}