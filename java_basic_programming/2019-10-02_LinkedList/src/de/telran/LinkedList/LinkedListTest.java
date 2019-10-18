package de.telran.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    private LinkedList<String> linkedList = new LinkedList<>();

    @Test
    public void add() {
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        assertEquals("First", linkedList.getFirst());
        assertEquals("Second", linkedList.get(1));
        assertEquals("Third", linkedList.getLast());

    }

    @Test
    public void get() {
    }

    @Test
    public void remove() {
        linkedList.remove(1);
        assertEquals("Third", linkedList.get(1));
    }
}