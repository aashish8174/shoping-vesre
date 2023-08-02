package com.example.shoppingverse.Exception;

public class CustomerNotFoundException extends RuntimeException{
    public CustomerNotFoundException(String massage){
        super(massage);
    }
}
