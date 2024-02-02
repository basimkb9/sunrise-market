package org.sunrisemarket.model;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private long id;
    private String title;
}
