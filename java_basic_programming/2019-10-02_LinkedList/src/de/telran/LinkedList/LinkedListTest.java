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

        assertEquals("First", linkedList.get(0));
        assertEquals("Second", linkedList.get(1));
        assertEquals("Third", linkedList.get(2));
    }

    @Test
    public void getFirst() {

        assertEquals("First", linkedList.getFirst());

    }

    @Test
    public void getLast() {

        assertEquals("Third", linkedList.getLast());
    }

   /* @Test
    public void getSize() {

    }*/


}