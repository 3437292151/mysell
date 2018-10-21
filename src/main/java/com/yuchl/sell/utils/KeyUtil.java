package com.yuchl.sell.utils;

import java.util.Random;

/**
 * @Author yuchl
 * @Date 2018/10/14 0014
 * @Description 主键工具
 */
public class KeyUtil {

    public static synchronized String genUniqueKey(){
        Random random = new Random();
        System.currentTimeMillis();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis() + String.valueOf(number);
    }
}
