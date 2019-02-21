package com.manager.estate.unit.feature.payment;

import com.manager.estate.feature.payment.dao.PaymentRepository;
import com.manager.estate.feature.payment.model.Payment;
import com.manager.estate.feature.payment.service.PaymentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class PaymentServiceTest {

    @Mock
    private PaymentRepository paymentRepository;

    @InjectMocks
    private PaymentService classUnderTest;

    @Test
    public void shouldGetList() {
        //Given
        List<Payment> payments = createdMockedList();
        when(paymentRepository.findAll()).thenReturn(payments);
        //When
        final List<Payment> result = classUnderTest.getList();
        //Then
        assertEquals(2, result.size());
    }

    private List<Payment> createdMockedList() {
        List<Payment> mockedList = new ArrayList<>();
        mockedList.add(new Payment());
        mockedList.add(new Payment());
        return mockedList;
    }
}