package com.manager.estate.feature.payment.controller;

import com.manager.estate.feature.payment.model.Payment;
import com.manager.estate.feature.payment.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/payments")
public class PaymentController {
    private final PaymentService paymentService;

    @GetMapping
    public List<Payment> getList() {
        return paymentService.getList();
    }
}