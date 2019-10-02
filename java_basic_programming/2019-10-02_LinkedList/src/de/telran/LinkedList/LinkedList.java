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
        return 0;
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
      return null;
    }

    /*
    HW
    */
    public T getLast() {
        return null;
    }

    /*
    HW
    */
    public void remove(int index) {

    }
}
