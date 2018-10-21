package com.yuchl.sell.service;

import com.yuchl.sell.dto.OrderDTO;

/**
 * @Author yuchl
 * @Date 2018/10/19 0019
 * @Description
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid, String orderId);
}
