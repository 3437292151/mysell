package com.yuchl.sell.form;

import lombok.Data;

/**
 * @Author yuchl
 * @Date 2018/10/17 0017
 * @Description 购物车信息
 */
@Data
public class OrderDetailForm {

    /** 商品id. */
    private String productId;

    /** 商品数量. */
    private Integer productQuantity;
}
