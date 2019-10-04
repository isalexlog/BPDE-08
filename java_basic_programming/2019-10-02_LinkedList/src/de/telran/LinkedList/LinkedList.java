package de.telran.LinkedList;

/*
    HW: test required!!!
 */
public class LinkedList<T> {

    private Node first;
    private Node last;

    class Node {
        Node next;
        Node prev;
        T element;
    }

    /*
    HW
     */
    public int getSize() {
        int counter = 1;
        Node current = first;
        while (current.next != null) {
            current = current.next;
            counter++;

        }
        return counter;
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

    /*
    HW
    */
    public T getFirst() {
        return first.element;
    }

    /*
    HW
    */
    public T getLast() {
        return last.element;
    }

    /*
    HW
    */
    public void remove(int index) {
        if (index == 0) {
            first = first.next;
            first.prev = null;
            return;
        }

        int i = 0;
        Node current = first;
        while (i != index) {
            i++;
            current = current.next;
        }
        Node a = current.prev;
        if (current.next == null) {
            a.next = null;
            last = a;
            return;
        }
        Node b = current.next;
        a.next = b;
        b.prev = a;

    }
}
