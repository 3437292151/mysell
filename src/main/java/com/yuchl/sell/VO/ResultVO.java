package com.yuchl.sell.VO;

import lombok.Data;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description http请求返回的最外层对象
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;
}
