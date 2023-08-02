package com.example.shoppingverse.Service;

import com.example.shoppingverse.Dto.Request.CardRequestDto;
import com.example.shoppingverse.Dto.Response.CardResponseDto;
import com.example.shoppingverse.Exception.CustomerNotFoundException;
import com.example.shoppingverse.Model.Card;
import com.example.shoppingverse.Model.Customer;
import com.example.shoppingverse.Repository.CardRepository;
import com.example.shoppingverse.Repository.CustomerRepository;
import com.example.shoppingverse.Transformer.CardTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CardService {
    @Autowired
    CardRepository cardRepository;

    @Autowired
    CustomerRepository customerRepository;
    public CardResponseDto addCard(CardRequestDto cardRequestDto) {
       Customer customer = customerRepository.findByMobNo(cardRequestDto.getCustomerMobile());
       if(customer==null){
           throw new CustomerNotFoundException("Customer doesn't exist");
       }
       Card card = CardTransformer.CardRequestDtoTOCard(cardRequestDto);
       card.setCustomer(customer);
       customer.getCardList().add(card);

       Customer savedCustomer = customerRepository.save(customer);
        List<Card> cards = savedCustomer.getCardList();
        Card latestCard = cards.get(cards.size()-1);

        // prepare card response dto
        CardResponseDto cardResponseDto = CardTransformer.CardToCardResponseDto(latestCard);
        cardResponseDto.setCardNo(generateMaskedCard(latestCard.getCardNumber()));

        return cardResponseDto;
    }

    public String generateMaskedCard(String cardNo) {
        int cardLength = cardNo.length();
        String maskedCard = "";
        for (int i = 0; i < cardLength - 4; i++) {
            maskedCard += 'X';
        }

        maskedCard += cardNo.substring(cardLength - 4);
        return maskedCard;
    }

}
