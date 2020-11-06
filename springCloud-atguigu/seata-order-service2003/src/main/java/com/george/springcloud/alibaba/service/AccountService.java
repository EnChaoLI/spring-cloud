package com.george.springcloud.alibaba.service;

import java.math.BigDecimal;

/**
 * @author enchaolee
 * @date 2020-11-05 10:20 2020-09-27 11:58
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
