package com.example.shoppingverse.Repository;

import com.example.shoppingverse.Model.Item;
import com.example.shoppingverse.Model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {

    Optional<Product> findById(int productId);

    void save(Product product);
}
