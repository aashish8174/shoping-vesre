package com.example.shoppingverse.Transformer;

import com.example.shoppingverse.Dto.Request.SellerRequestDto;
import com.example.shoppingverse.Dto.Response.SellerResponseDto;
import com.example.shoppingverse.Model.Seller;

public class SellerTransformer {
    public static Seller SellerRequestDtoToSeller(SellerRequestDto sellerRequestDto){
        return Seller.builder()
                .name(sellerRequestDto.getName())
                .panNo(sellerRequestDto.getPanNo())
                .emailId(sellerRequestDto.getSellerEmail())
                .build();
    }

    public static SellerResponseDto SellerToSellerResponseDto(Seller seller){

        return SellerResponseDto.builder()
                .name(seller.getName())
                .emailId(seller.getEmailId())
                .build();
    }
}
