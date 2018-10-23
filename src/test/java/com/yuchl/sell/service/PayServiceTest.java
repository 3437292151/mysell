package com.yuchl.sell.service;

import com.yuchl.sell.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * @Auther: yuchanglong
 * @Date: 2018-10-23
 * @Description: 支付服务测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PayServiceTest {

    @Autowired
    private PayService payService;

    @Autowired
    private OrderService orderService;
    @Test
    public void create() throws Exception {

        OrderDTO orderDTO = orderService.findOne("1539613008118198413");
        payService.create(orderDTO);
    }

}