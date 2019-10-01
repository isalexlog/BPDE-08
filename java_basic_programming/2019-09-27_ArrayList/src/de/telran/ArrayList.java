package de.telran;

public class ArrayList<T> {

    private final int INITIAL_ARRAY_SIZE = 1000;

    private int size = 0;

    private T[] array;

    public ArrayList() {
        array = (T[]) new Object[INITIAL_ARRAY_SIZE];
    }

    public void add(T object) {
        if (size + 1 > array.length) {
            T[] newArray = (T[]) new Object[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }

        array[size] = object;
        size++;
    }

    public T get(int index) {
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
        for (int i = 0; i < size; i++)
            System.out.println("[" + i + "] = " + get(i));
    }
}
