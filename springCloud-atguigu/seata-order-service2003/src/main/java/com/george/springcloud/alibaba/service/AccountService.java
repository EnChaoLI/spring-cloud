package com.george.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @author enchaolee
 */
public interface AccountService {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     */
    void decrease(Long userId, BigDecimal money);
}
