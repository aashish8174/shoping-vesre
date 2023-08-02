package com.example.shoppingverse.Repository;

import com.example.shoppingverse.Model.Cart;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository {
    Cart save(Cart cart);
}
