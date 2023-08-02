package com.example.shoppingverse.Dto.Response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartResponseDto {
    String customerName;

    int cartTotal;

    List<ItemResponseDto> items;
}
