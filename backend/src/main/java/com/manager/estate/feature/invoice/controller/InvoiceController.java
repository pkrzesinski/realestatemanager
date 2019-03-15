package com.manager.estate.feature.invoice.controller;

import com.manager.estate.feature.invoice.model.Invoice;
import com.manager.estate.feature.invoice.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/invoices")
@RequiredArgsConstructor
public class InvoiceController {

    private final InvoiceService invoiceService;

    @GetMapping
    public List<Invoice> getList() {
        return invoiceService.getList();
    }

    @PostMapping
    public Invoice save(@RequestBody Invoice Invoice) {
        return invoiceService.save(Invoice);
    }

    @PutMapping
    public Invoice update(@RequestBody Invoice Invoice) {
        return invoiceService.save(Invoice);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Long id) {
        invoiceService.delete(id);
    }
}