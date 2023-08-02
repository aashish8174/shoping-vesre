package com.example.shoppingverse.Dto.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ItemRequestDto {
    String customerEmail;
    int requiredQuantity;
    int productId;
}
