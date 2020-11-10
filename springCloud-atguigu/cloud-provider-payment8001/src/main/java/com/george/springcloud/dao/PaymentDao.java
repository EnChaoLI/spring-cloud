package com.george.springcloud.dao;

import com.george.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author enchaolee
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
