package com.orderservice.service;

import com.orderservice.dto.OrderRequest;
import com.orderservice.mapper.OrderMapper;
import com.orderservice.model.Order;
import com.orderservice.model.OrderLineItems;
import com.orderservice.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;

    public void placeOrder(OrderRequest orderRequest){
            Order order = new Order();
            order.setOrderNumber(UUID.randomUUID().toString());
            List<OrderLineItems> orderLineItems=orderRequest.getOrderLineItemsList()
                    .stream()
                    .map(orderLineItemsdto -> OrderMapper.orderLineItemsDtoToOrderLineItems(orderLineItemsdto,order)).toList();
            order.setOrderLineItemsList(orderLineItems);
            orderRepository.save(order);
    }
}
