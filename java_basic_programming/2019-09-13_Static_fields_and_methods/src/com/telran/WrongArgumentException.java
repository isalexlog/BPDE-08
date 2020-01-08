package com.telran;


    public class WrongArgumentException extends RuntimeException {

        public WrongArgumentException(double radius) {
            super(radius + " Oops! Your argument is wrong! ");
        }
    }

