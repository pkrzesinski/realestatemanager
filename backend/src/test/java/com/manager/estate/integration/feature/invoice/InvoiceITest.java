package com.manager.estate.integration.feature.invoice;

import com.manager.estate.feature.invoice.service.InvoiceService;
import com.manager.estate.integration.config.Itest;
import com.manager.estate.feature.invoice.model.Invoice;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.transaction.annotation.Transactional;

import javax.validation.ConstraintViolationException;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;

@Transactional
public class InvoiceITest extends Itest {

    @Autowired
    private InvoiceService classUnderTest;

    @Test(expected = DataIntegrityViolationException.class)
    public void ShouldNotAllowToSaveTwiceTheSameInvoiceNumber() {
        //Given
        Invoice invoice1 = prepareInvoice();
        Invoice invoice2 = prepareInvoice();
        //When //Then
        classUnderTest.save(invoice1);
        classUnderTest.save(invoice2);
    }

    @Test(expected = ConstraintViolationException.class)
    public void ShouldNotSaveWithoutInvoiceNumber() {
        //Given
        Invoice invoice3 = prepareInvoiceWithoutInvoiceNumber();
        //When //Then
        classUnderTest.save(invoice3);
    }

    @Test
    public void shouldSave() {
        //Given
        Invoice invoice = prepareInvoice();
        //When
        classUnderTest.save(invoice);
        //Then
        List<Invoice> result = classUnderTest.getList();
        assertEquals(2, result.size());
    }


    private Invoice prepareInvoice() {
        return new Invoice(LocalDate.of(2019, 02, 20), "02/19-INV098342", 2364.2);
    }

    private Invoice prepareInvoiceWithoutInvoiceNumber() {
        return new Invoice(LocalDate.of(2019, 02, 20), "", 2364.2);
    }

}