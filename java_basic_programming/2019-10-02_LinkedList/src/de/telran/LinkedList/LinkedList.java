package de.telran.LinkedList;

/*
    HW: test required!!!
 */
public class LinkedList<T> {

    private Node first;
    private Node last;
    private int size = 0;

    class Node {
        Node next;
        Node prev;
        T element;
    }

    public int getSize() {
        return size;
    }

    public void add(T element) {
        Node node = new Node();
        node.element = element;

        if (first == null) {
            first = node;
            first.prev = null;
            first.next = null;
            last = first;
        } else {
            last.next = node;
            node.next = null;
            node.prev = last;
            last = node;
        }
    }

    public T get(int index) {
        int i = 0;
        Node current = first;
        while (i != index) {
            i++;
            current = current.next;
        }
        return current.element;
    }


    public T getFirst() {
        Node current = first;

        return current.element;
    }


    public T getLast() {
        Node current = last;
        return current.element;
    }

    /*
    HW
    */
    public void remove(int index) {

    }
}
