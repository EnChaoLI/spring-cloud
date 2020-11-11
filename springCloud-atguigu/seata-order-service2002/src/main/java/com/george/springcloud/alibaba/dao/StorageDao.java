package com.george.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author enchaolee
 */
@Mapper
public interface StorageDao {
    int decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
