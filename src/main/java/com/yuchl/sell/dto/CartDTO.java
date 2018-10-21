package com.yuchl.sell.dto;

import lombok.Data;

/**
 * @Author yuchl
 * @Date 2018/10/14 0014
 * @Description
 */
@Data
public class CartDTO {
    /** 商品Id. */
    private String productId;

    /** 数量. */
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
