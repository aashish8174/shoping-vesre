package com.example.shoppingverse.Transformer;

import com.example.shoppingverse.Dto.Response.ItemResponseDto;
import com.example.shoppingverse.Dto.Response.OrderResponseDto;
import com.example.shoppingverse.Model.Item;
import com.example.shoppingverse.Model.OrderEntity;

import java.util.ArrayList;
import java.util.List;

public class OrderTransformer {
    public static OrderResponseDto OrderToOrderResponseDto(OrderEntity order){

        List<ItemResponseDto> itemResponseDtoList = new ArrayList<>();
        for(Item item: order.getItems()){
            itemResponseDtoList.add(ItemTransformer.ItemToItemResponseDto(item));
        }

        return OrderResponseDto.builder()
                .orderId(order.getOrderId())
                .orderDate(order.getDate())
                .cardUsed(order.getCardUsed())
                .orderTotal(order.getOrderTotal())
                .customerName(order.getCustomer().getName())
                .item(itemResponseDtoList)
                .build();

    }
}
