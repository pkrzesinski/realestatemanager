package com.manager.estate.integration.feature.payment;

import com.manager.estate.feature.payment.model.Payment;
import com.manager.estate.feature.payment.service.PaymentService;
import com.manager.estate.feature.property.model.Property;
import com.manager.estate.provider.MockProvider;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.*;


@Transactional
public class PaymentITest {

    @Autowired
    private PaymentService classUnderTest;

    @Test
    public void PaymentInThePast(){
        //Given

        //When //Then

    }

//    private Payment preparePaymentWithPastDate(){
//        return new Payment(LocalDate.of(1992, 05, 21), 234.34, MockProvider.TENANTS.get(0),);
//    }

}