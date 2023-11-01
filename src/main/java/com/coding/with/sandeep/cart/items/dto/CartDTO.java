package com.coding.with.sandeep.cart.items.dto;

import com.coding.with.sandeep.cart.items.entity.Item;
import lombok.*;

import java.util.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CartDTO {

    private int cartId;
    private String name;
    private String description;
    private List<Item> items;
}
