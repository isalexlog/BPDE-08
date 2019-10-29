package de.telran.printer;

public class ConsoleUpperCasePrinter implements ResultsPrinter {

    @Override
    public void print(String value) {
        System.out.println(value.toUpperCase());;
    }
}
