package com.yuchl.sell.mapper;

import com.yuchl.sell.domain.OrderMaster;
import com.yuchl.sell.dto.OrderDTO;
import com.yuchl.sell.form.OrderForm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * @Author yuchl
 * @Date 2018/10/16 0016
 * @Description OrderDTO 与 OrderMaster映射
 */
@Mapper(componentModel = "spring", uses = {})
public interface OrderMasterMapper extends EntityMapper<OrderDTO, OrderMaster> {

    default OrderMaster fromId(String orderId) {
        if (orderId == null) {
            return null;
        }
        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId(orderId);
        return orderMaster;
    }

    @Mappings({
            @Mapping(source = "orderForm.name", target = "buyerName"),
            @Mapping(source = "orderForm.phone", target = "buyerPhone"),
            @Mapping(source = "orderForm.address", target = "buyerAddress"),
            @Mapping(source = "orderForm.openid", target = "buyerOpenid"),
            @Mapping(source = "orderForm.items", target = "orderDetailList")
    })
    public OrderDTO formToDto(OrderForm orderForm);
}
