package com.example.shoppingverse.Controller;

import com.example.shoppingverse.Dto.Request.CardRequestDto;
import com.example.shoppingverse.Dto.Response.CardResponseDto;
import com.example.shoppingverse.Exception.CustomerNotFoundException;
import com.example.shoppingverse.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Card")
public class CardController {
    @Autowired
    CardService cardService;

    @PostMapping("/add")
    public ResponseEntity addCard(@RequestBody CardRequestDto cardRequestDto){

        try{
            CardResponseDto cardResponseDto = cardService.addCard(cardRequestDto);
            return new ResponseEntity(cardResponseDto, HttpStatus.CREATED);
        }
        catch (CustomerNotFoundException e){
            return new ResponseEntity(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }
}
