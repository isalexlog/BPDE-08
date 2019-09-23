package com.telran;

public class WrongArgumentException extends RuntimeException {

    public WrongArgumentException(double radius) {
        super("You have entered wrong argument " + radius);
    }
}
