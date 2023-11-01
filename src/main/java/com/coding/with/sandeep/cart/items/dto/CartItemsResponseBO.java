package com.coding.with.sandeep.cart.items.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class CartItemsResponseBO {

    private String name;
    private String cartDescription;
    private String itemName;
    private String itemDetails;
    private String brand;
    private int quantity;
}
