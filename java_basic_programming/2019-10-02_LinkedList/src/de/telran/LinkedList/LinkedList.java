package de.telran.LinkedList;

/*
    HW: test required!!!
 */
public class LinkedList<T> {
    private int size = 0;

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
        size++;
    }

    public T get(int index) {
        if (size == 0)
            throw new IndexOutOfBoundsException("Linked list is empty!");
        if (index > size - 1 || index < 0)
            throw new IndexOutOfBoundsException();
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
        return last.element;
    }

    /*
    HW
    */
    public void remove(int index) {
        if (size == 1) {
            first = null;
            last = null;
            size = 0;
            return;
        }
        if (index == 0) {
            first = first.next;
            first.prev = null;
            size--;
            return;
        }
        if (index == getSize() - 1) {
            last = last.prev;
            last.next = null;
            size--;
            return;
        }

        int i = 0;
        Node current = first;
        while (i != index) {
            i++;
            current = current.next;
        }
        Node a = current.prev;
        Node b = current.next;
        a.next = b;
        b.prev = a;
        size--;
    }
}
