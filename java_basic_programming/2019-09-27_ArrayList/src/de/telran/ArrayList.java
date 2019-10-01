package de.telran;

public class ArrayList<T> {

    private final int INITIAL_ARRAY_SIZE = 2;
    private int size = 0;
    private T[] array;

    public ArrayList() {
        array = (T[]) new Object[INITIAL_ARRAY_SIZE];
    }

    public void add (T object) {
        if (size + 1 > array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            System.out.println("Creating new array");
        }
        array[size] = object;
        size++;
    }

    public void add (int index, T object) {
        if (size + 1 > array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            System.out.println("Creating new array");
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = object;
        size++;
    }

    public void add (int index, ArrayList<T> values) {
        if (size + values.size > array.length) {
            T[] newArray = (T[]) new Object[array.length + values.size];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
            System.out.println("Creating new array");
        }
        for (int j = 1; j <= values.size; j++) {
            for (int i = size + values.size; i > index; i--) {
                array[i] = array[i - 1];
            }
            index++;
        }
        for (int j = 0; j < values.size; j++) {
            Object o = values.get(j);
            for (int i = index; i < index + values.size;) {
                array[i] = (T) o;
                i++;
            }
        }
        size = size + values.size;
    }

    public T get (int index) {
        return array[index];
    }

    public int getSize() {
        return size;
    }

    public void remove(int index) {
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;
    }

    public void printList() {
        for (int i = 0; i < size; i++) {
            System.out.println("[" + i + "] = " + get(i));
        }
    }
}
