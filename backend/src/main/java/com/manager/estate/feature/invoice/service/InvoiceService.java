package com.manager.estate.feature.invoice.service;

import com.manager.estate.feature.invoice.dao.InvoiceRepository;
import com.manager.estate.feature.invoice.model.Invoice;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class InvoiceService {

    private final InvoiceRepository invoiceRepository;

    public List<Invoice> getList() {
        return invoiceRepository.findAll();
    }

    public Invoice save(final Invoice invoice) {
        return invoiceRepository.save(invoice);
    }

    public void delete(final Long id) {
        invoiceRepository.delete(id);
    }
}
