package com.george.springcloud.alibaba.service;

/**
 * @author enchaolee
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
