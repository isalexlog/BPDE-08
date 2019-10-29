package de.telran;

public class Address{
    private String street;
    private int streetNumber;

    public Address(String street, int homeNumber) {
        this.street = street;
        this.streetNumber = homeNumber;
    }

    @Override
    public String toString() {
        return "Address: " + street + streetNumber;
    }
}
