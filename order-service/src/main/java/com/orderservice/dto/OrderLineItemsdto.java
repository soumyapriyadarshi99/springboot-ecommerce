package com.orderservice.dto;

import com.orderservice.model.Order;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItemsdto {
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
    private Order order;
}
