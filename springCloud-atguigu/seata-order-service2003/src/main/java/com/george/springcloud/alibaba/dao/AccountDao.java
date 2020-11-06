package com.george.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author enchaolee
 * @date 2020-11-05 10:20 2020-09-27 12:01
 */
@Mapper
public interface AccountDao {
    /**
     * 扣减账户余额
     *
     * @param userId
     * @param money
     * @return
     */
    int decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);
}
