package com.george.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.george.springcloud.entities.CommonResult;

/**
 * @author enchaolee
 * 创建customerBlockHandler类用于自定义限流处理逻辑
 *   10:20 2020-09-23 17:20
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(4444, "按客户自定义,global handlerException----------1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "按客户自定义2,global handlerException----------2");
    }
}
