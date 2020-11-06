package com.george.springcloud.service.impl;

import com.george.springcloud.dao.PaymentDao;
import com.george.springcloud.entities.Payment;
import com.george.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author enchaolee
 * @description
 *   10:20 2020-09-14 16:07
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
