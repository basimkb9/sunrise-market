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
public class Purchase {
    private long id;
    private long userId;
    private String status;
    private double subTotal;
    private double itemDiscount;
    private double tax;
    private double shipping;
    private double total;
    private double discount;
    private double grandTotal;
    private LocalDateTime createdAt;
}
