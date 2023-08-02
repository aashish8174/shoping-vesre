package com.example.shoppingverse.Dto.Request;

import com.example.shoppingverse.Enum.ProductCategory;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductRequestDto {
    String sellerEmail;
    String name;
    ProductCategory category;
    int price;
    int availableQuantity;
}
