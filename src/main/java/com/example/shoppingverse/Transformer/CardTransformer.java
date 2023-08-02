package com.example.shoppingverse.Transformer;

import com.example.shoppingverse.Dto.Request.CardRequestDto;
import com.example.shoppingverse.Dto.Response.CardResponseDto;
import com.example.shoppingverse.Model.Card;

public class CardTransformer {
    public static Card CardRequestDtoTOCard(CardRequestDto cardRequestDto){
        Card card = new Card();
        card.setCardExpiry(cardRequestDto.getValidTill());
        card.setCardNumber(cardRequestDto.getCardNo());
        card.setCardType(cardRequestDto.getCardType());
        card.setCcv(cardRequestDto.getCcv());
        return card;
        // need to check once
    }
    public static CardResponseDto CardToCardResponseDto(Card card){

        return CardResponseDto.builder()
                .CustomerMobile(card.getCustomer().getName())
                .validTill(card.getCardExpiry())
                .cardType(card.getCardType())
                .build();
    }
}
