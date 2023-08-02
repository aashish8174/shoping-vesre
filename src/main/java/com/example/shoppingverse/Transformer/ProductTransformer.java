package com.example.shoppingverse.Transformer;

import com.example.shoppingverse.Dto.Request.ProductRequestDto;
import com.example.shoppingverse.Dto.Response.ProductResponseDto;
import com.example.shoppingverse.Enum.ProductStatus;
import com.example.shoppingverse.Model.Product;

public class ProductTransformer {
    public static Product ProductRequestDtoToProduct(ProductRequestDto productRequestDto){

        return Product.builder()
                .name(productRequestDto.getName())
                .price(productRequestDto.getPrice())
                .availableQuantity(productRequestDto.getAvailableQuantity())
                .category(productRequestDto.getCategory())
                .productStatus(ProductStatus.AVAILABLE)
                .build();
    }

    public static ProductResponseDto ProductToProductResponseDto(Product product){

        return ProductResponseDto.builder()
                .sellerName(product.getSeller().getName())
                .productName(product.getName())
                .productStatus(product.getProductStatus())
                .price(product.getPrice())
                .category(product.getCategory())
                .availableQuantity(product.getAvailableQuantity())
                .build();
    }
}
