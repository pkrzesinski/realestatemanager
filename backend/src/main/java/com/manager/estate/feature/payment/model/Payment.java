package com.manager.estate.feature.payment.model;

import com.manager.estate.feature.invoice.model.Invoice;
import com.manager.estate.feature.tenant.model.Tenant;
import com.manager.estate.shared.jpa.DatabaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import java.time.LocalDate;

@Entity
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment extends DatabaseEntity {

    @Future
    private LocalDate dueDate;
    @Min(0)
    private double paymentDue;
    @ManyToOne(optional = false)
    private Tenant tenant;
    @OneToOne(optional = false)
    private Invoice invoice;
}
