package com.example.shoppingverse.Dto.Response;

import com.example.shoppingverse.Enum.ProductCategory;
import com.example.shoppingverse.Enum.ProductStatus;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductResponseDto {
    String sellerName;

    String productName;

    int price;

    int availableQuantity;

    ProductCategory category;

    ProductStatus productStatus;
}
