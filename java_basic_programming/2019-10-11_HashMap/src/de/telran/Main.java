package de.telran;

import java.util.HashMap;
import java.util.Map;

public class Main {

    // HW: write a program that creates a frequency map of words, using in the text file
    // Input: text file with text
    // Output: text file with frequency map (word: number of times used in the text)
    public static void main(String[] args) {
        Map<Customer, String> customers = new HashMap<>();

        System.out.println("If customers is empty: " + customers.isEmpty());
        System.out.println("Populating the map...");
        customers.put(new Customer(1, "First", "1 First street"), "123456");
        customers.put(new Customer(2, "Second", "1 First street"), "123457");
        customers.put(new Customer(3, "Third", "1 First street"), "123458");
        customers.put(new Customer(4, "Fourth", "1 First street"), "123459");

        System.out.println("If customers is empty: " + customers.isEmpty());
        System.out.println("Size of customers: " + customers.size());

        customers.put(null, "123456");

        System.out.println("Getting customer:");
        System.out.println(
                customers.get(new Customer(2, "Second", "1 First street"))
        );

        System.out.println("Checking if customer exists:");
        System.out.println(customers.containsKey(
                new Customer(2, "Second", "1 First street")
        ));

        System.out.println(customers.containsKey(
                new Customer(2, "Vasya", "1 First street")
        ));

        System.out.println("Removing customer:");
        System.out.println(customers.remove(
                new Customer(2, "Second", "1 First street")
        ));

        System.out.println("If customer exists after removal:");
        System.out.println(customers.containsKey(
                new Customer(2, "Second", "1 First street")
        ));

        System.out.println("Iterating over the map");
        for (Map.Entry<Customer, String> customer: customers.entrySet()) {
            System.out.println(customer);
        }
    }
}
