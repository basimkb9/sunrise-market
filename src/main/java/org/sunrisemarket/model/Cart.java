package org.sunrisemarket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    private long id;
    private long userId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private List<CartItem> cartItems;
}
