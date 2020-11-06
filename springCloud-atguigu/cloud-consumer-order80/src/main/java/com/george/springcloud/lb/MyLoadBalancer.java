package com.george.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author enchaolee
 * @description
 * @date 2020-11-05 10:20 2020-09-16 14:58
 */
public interface MyLoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstances);
}
