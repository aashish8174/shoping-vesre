package com.example.shoppingverse.Dto.Response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderResponseDto {
    String orderId;  // UUID

    Date orderDate;

    String cardUsed;

    int orderTotal;

    String customerName;

    List<ItemResponseDto> item;
}
