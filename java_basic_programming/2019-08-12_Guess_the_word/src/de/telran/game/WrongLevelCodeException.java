package de.telran.game;

public class WrongLevelCodeException extends RuntimeException {

    public WrongLevelCodeException(int levelCode) {
        super("Wrong level code " + levelCode + " supplied");
    }

}
