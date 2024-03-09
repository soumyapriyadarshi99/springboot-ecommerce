package com.orderservice.mapper;

import com.orderservice.dto.OrderLineItemsdto;
import com.orderservice.dto.OrderRequest;
import com.orderservice.model.Order;
import com.orderservice.model.OrderLineItems;

public class OrderMapper {
    public static OrderLineItems orderLineItemsDtoToOrderLineItems(OrderLineItemsdto orderLineItemDto,Order order){
        return OrderLineItems.builder().
                skuCode(orderLineItemDto.getSkuCode()).
                price(orderLineItemDto.getPrice()).
                quantity(orderLineItemDto.getQuantity()).
                order(order).
                build();
    }
}
