package com.yuchl.sell.controller;

import com.lly835.bestpay.model.PayResponse;
import com.yuchl.sell.dto.OrderDTO;
import com.yuchl.sell.enums.ResultEnum;
import com.yuchl.sell.exception.SellException;
import com.yuchl.sell.service.OrderService;
import com.yuchl.sell.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

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
    public ModelAndView create(@RequestParam("orederId") String orederId, @RequestParam("returnUrl") String returnUrl){

        //1.查询订单
        OrderDTO orderDTO = orderService.findOne(orederId);
        if(orderDTO == null){
            throw new SellException(ResultEnum.ORDER_NOT_EXIST);
        }
        //发起支付
        //PayResponse payResponse = payService.create(orderDTO);
        PayResponse payResponse = new PayResponse();
        payResponse.setAppId("123");
        payResponse.setTimeStamp("12324");
        payResponse.setNonceStr("12312");
        payResponse.setPackAge("123");
        payResponse.setPaySign("354213");
        Map map = new HashMap();
        map.put("payResponse", payResponse);
        map.put("returnUrl", returnUrl);
        return new ModelAndView("pay/create",map);
    }

    /**
     * 微信异步通知
     * @param notifyData
     */
    @PostMapping("/notify")
    public ModelAndView notify(@RequestBody String notifyData) {
        payService.notify(notifyData);

        //返回给微信处理结果
        return new ModelAndView("pay/success");
    }
}
