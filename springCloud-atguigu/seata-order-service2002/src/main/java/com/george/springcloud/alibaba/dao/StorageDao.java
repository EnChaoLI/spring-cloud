package com.george.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author enchaolee
 * @date 2020-11-05 10:20 2020-09-27 12:01
 */
@Mapper
public interface StorageDao {
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
