package com.yuchl.sell.controller;

import com.yuchl.sell.dto.OrderDTO;
import com.yuchl.sell.enums.ResultEnum;
import com.yuchl.sell.exception.SellException;
import com.yuchl.sell.service.OrderService;
import com.yuchl.sell.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Auther: yuchanglong
 * @Date: 2018-10-23
 * @Description: 支付接口
 */
@Controller
@RequestMapping("/pay")
public class PayController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private PayService payService;

    @GetMapping("/create")
    public void create(@RequestParam("orederId") String orederId, @RequestParam("returnUrl") String returnUrl){

        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orederId);
        if(orderDTO == null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        //发起支付
        orderService.create(orderDTO);
    }
}
