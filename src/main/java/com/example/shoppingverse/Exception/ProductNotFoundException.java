package com.example.shoppingverse.Exception;

public class ProductNotFoundException extends RuntimeException{
    public ProductNotFoundException(String massage){
        super(massage);
    }
}
