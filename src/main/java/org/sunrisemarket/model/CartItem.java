package org.sunrisemarket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CartItem {
    private long id;
    private long cartId;
    private long productId;
    private double price;
    private double discount;
    private long quantity;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
