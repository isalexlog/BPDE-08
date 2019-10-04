package de.telran.LinkedList;

import java.util.NoSuchElementException;

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
        if (first == null) {
            throw new NoSuchElementException();
        } else {
            return first.element;
        }

    }

    /*
    HW
    */
    public T getLast() {
        if (last == null) {
            throw new NoSuchElementException();

        } else {
            return last.element;
        }
    }

    /*
    HW
    */
    public  void remove(int index) {
        if (index > size){
            throw new RuntimeException();
        }
//        Node prev = (Node)get(index-1);//ClassCastException:
//        Node next = (Node)get(index+1);//ClassCastException:
//
//        prev.next = next;
//        next.prev = prev;
//
//          size--;
//
    }
}
