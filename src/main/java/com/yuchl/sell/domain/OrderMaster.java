package com.yuchl.sell.domain;

import com.yuchl.sell.enums.OrderStatusEnum;
import com.yuchl.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @Author yuchl
 * @Date 2018/10/8 0008
 * @Description 订单实体
 */
@Entity
@Data
public class OrderMaster {

    /** 订单id. */
    @Id
    private String orderId;

    /** 买家名字. */
    private String buyerName;

    /** 买家手机号. */
    private String buyerPhone;

    /** 买家地址. */
    private String buyerAddress;

    /** 买家微信Openid. */
    private String buyerOpenid;

    /** 订单总金额. */
    private BigDecimal orderAmount;

    /** 订单状态, 默认为0新下单. */
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    /** 支付状态, 默认为0未支付. */
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    /** 创建时间. */
    private LocalDateTime createTime;

    /** 更新时间. */
    private LocalDateTime updateTime;

    /** 订单详情 */
    /*@OneToMany(mappedBy = "orderId")
    private List<OrderDetail> orderDetailList;*/
}
