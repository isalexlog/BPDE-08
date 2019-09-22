package com.telran;

public class WrongArgumentException extends RuntimeException{
    public WrongArgumentException(String message) {
        super(message);
    }
}
