package com.example.shoppingverse.Dto.Response;

import com.example.shoppingverse.Enum.ProductCategory;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemResponseDto {
    String itemName;

    int itemPrice;

    int quantityAdded;

    ProductCategory category;
}
