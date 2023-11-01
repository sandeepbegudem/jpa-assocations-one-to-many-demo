package com.coding.with.sandeep.cart.items.mapper;

import com.coding.with.sandeep.cart.items.dto.CartDTO;
import com.coding.with.sandeep.cart.items.dto.CartItemsResponseBO;
import com.coding.with.sandeep.cart.items.entity.Cart;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CartMapper {
    CartMapper CART_MAPPER = Mappers.getMapper(CartMapper.class);

    Cart dtoToEntity(CartDTO cartDTO);

    CartDTO entityToDto(Cart cart);

    List<CartDTO> allCartItemsToDto(List<Cart> carts);

    List<CartItemsResponseBO> cartItemsToDto(List<CartItemsResponseBO> carts);

}
