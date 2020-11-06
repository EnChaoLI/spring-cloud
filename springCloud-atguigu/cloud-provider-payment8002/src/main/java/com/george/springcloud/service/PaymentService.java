package com.george.springcloud.service;

import com.george.springcloud.entities.Payment;

/**
 * @author enchaolee
 * @description
 *   10:20 2020-09-14 16:07
 */
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
