package com.george.springcloud.service;

import com.george.springcloud.entities.Payment;

/**
 * @author enchaolee
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
