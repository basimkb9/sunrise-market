package org.sunrisemarket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;
    private String title;
    private long quantity;
    private double price;
    private boolean available;
}
