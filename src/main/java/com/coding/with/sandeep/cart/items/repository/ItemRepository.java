package com.coding.with.sandeep.cart.items.repository;

import com.coding.with.sandeep.cart.items.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {
}
