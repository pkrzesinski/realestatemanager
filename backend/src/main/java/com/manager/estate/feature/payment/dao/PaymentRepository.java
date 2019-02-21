package com.manager.estate.feature.payment.dao;

import com.manager.estate.feature.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
