package de.telran;

public class DemoImpl implements DemoInterface {
    @Override
    public void takeSomething(String s) {
        System.out.println(s);

    }

    @Override
    public String getSomething() {
        return "Hello World";
    }
}
