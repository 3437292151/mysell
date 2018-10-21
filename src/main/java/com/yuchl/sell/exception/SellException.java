package com.yuchl.sell.exception;

import com.yuchl.sell.enums.ResultEnum;

/**
 * @Author yuchl
 * @Date 2018/10/14 0014
 * @Description
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMassage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String defaultMessage) {
        super(defaultMessage);
        this.code = code;
    }
}
