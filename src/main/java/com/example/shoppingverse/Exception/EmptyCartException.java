package com.example.shoppingverse.Exception;

public class EmptyCartException extends RuntimeException{
    public EmptyCartException(String m){
        super(m);
    }
}
