package com.telran;

public class Logger {

    private Class clazz;

    public static Logger getLogger(Class clazz) {
        return new Logger(clazz);
    }

    private Logger(Class clazz) {
        this.clazz = clazz;
    }

    public void info(Object obj) {
        printClassName();
        System.out.print("info:");
        System.out.println(obj);
    }

    public void error(Object obj) {
        printClassName();
        System.out.print("error:");
        System.out.println(obj);
    }

    private void printClassName() {
        System.out.print(clazz + ":");
    }
}
