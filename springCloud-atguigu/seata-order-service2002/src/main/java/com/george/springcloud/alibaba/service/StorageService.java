package com.george.springcloud.alibaba.service;

/**
 * @author enchaolee
 * @date 2020-11-05 10:20 2020-09-27 11:58
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
