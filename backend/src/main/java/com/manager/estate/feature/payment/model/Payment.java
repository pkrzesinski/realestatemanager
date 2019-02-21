package com.manager.estate.feature.payment.model;

import com.manager.estate.feature.invoice.model.Invoice;
import com.manager.estate.feature.tenant.model.Tenant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {

    @Id
    @GeneratedValue
    private Long id;
    private LocalDate dueDate;
    private double paymentDue;
    @ManyToOne
    private Tenant tenant;
    @OneToOne
    private Invoice invoice;
}
