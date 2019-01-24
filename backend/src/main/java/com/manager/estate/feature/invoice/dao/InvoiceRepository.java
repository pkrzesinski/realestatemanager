package com.manager.estate.feature.invoice.dao;
import com.manager.estate.feature.invoice.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Long> {
}
