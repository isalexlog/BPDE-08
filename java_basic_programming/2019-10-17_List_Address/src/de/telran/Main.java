package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Address address1 = new Address("Thulestr.", 5);
        Address address2 = new Address("Berlinerstr.", 20);
        Address address3 = new Address("Petersburgerstr.", 15);
        Address address4 = new Address("Kuglerstr.", 10);

        Person person1 = new Person("Ivanov", address1);
        Person person2 = new Person("Petrov", address2);
        Person person3 = new Person("Sidorov", address3);
        Person person4 = new Person("Mikhailov", address4);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);

        List<Address> addresses = getAddresses(persons);
        for(Address address : addresses) {
            System.out.println(address);
        }

    }
    public static List<Address> getAddresses(List<Person> persons) {
        List<Address> addresses = new ArrayList<>();
        for (int i = 0; i < persons.size(); i++) {
            addresses.add(i, (persons.get(i)).getAddress());
        }
        return addresses;
    }
}
