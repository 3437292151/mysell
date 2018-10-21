package com.yuchl.sell.enums;

import lombok.Getter;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description
 */
@Getter
public enum ProductStatusEnum implements CodeEnum{

    UP(0,"在架"),DWON(1, "下架");

    private String msg;

    private Integer code;


    ProductStatusEnum( Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
