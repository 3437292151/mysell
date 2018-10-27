package com.yuchl.sell.service;

import com.lly835.bestpay.model.PayResponse;
import com.yuchl.sell.dto.OrderDTO;

/**
 * @Auther: yuchanglong
 * @Date: 2018-10-23
 * @Description: 支付服务
 */
public interface PayService {

    PayResponse create(OrderDTO orderDTO);

    PayResponse notify(String notifyData);
}
