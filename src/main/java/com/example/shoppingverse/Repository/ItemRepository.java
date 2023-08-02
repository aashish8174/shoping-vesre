package com.example.shoppingverse.Repository;

import com.example.shoppingverse.Model.Item;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository {
    Item save(Item item);
}
