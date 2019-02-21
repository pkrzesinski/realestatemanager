package com.manager.estate.feature.payment.service;

import com.manager.estate.feature.payment.dao.PaymentRepository;
import com.manager.estate.feature.payment.model.Payment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public List<Payment> getList() {
        return paymentRepository.findAll();
    }
}
