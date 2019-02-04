package com.manager.estate.unit.feature.invoice;

import com.manager.estate.feature.invoice.dao.InvoiceRepository;
import com.manager.estate.feature.invoice.model.Invoice;
import com.manager.estate.feature.invoice.service.InvoiceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class InvoiceServiceTest {

    @Mock
    private InvoiceRepository invoiceRepository;

    @InjectMocks
    private InvoiceService classUnderTest;

    @Test
    public void shouldGetList() {
        //Given
        List<Invoice> invoices = createdMockedList();
        when(invoiceRepository.findAll()).thenReturn(invoices);
        //When
        final List<Invoice> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    @Test
    public void shouldSave() {
        //Given
        Invoice invoice = new Invoice();
        //When
        classUnderTest.save(invoice);
        //Then
        verify(invoiceRepository).save(invoice);
    }

    @Test
    public void shouldDelete() {
        //Given
        Long id = 5L;
        //When
        classUnderTest.delete(id);
        //Then
        verify(invoiceRepository).delete(id);
    }

    private List<Invoice> createdMockedList() {
        List<Invoice> mockedList = new ArrayList<>();
        mockedList.add(new Invoice());
        mockedList.add(new Invoice());
        return mockedList;
    }
}