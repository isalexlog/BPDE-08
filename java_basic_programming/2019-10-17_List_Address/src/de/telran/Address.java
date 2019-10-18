package de.telran;

public class Address {
    private String street;
    private int homeNumber;

    public Address(String street, int homeNumber) {
        this.street = street;
        this.homeNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "Address: " + street + homeNumber;
    }
}
