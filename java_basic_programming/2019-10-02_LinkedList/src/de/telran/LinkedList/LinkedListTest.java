package de.telran.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList<String> linkedList = new LinkedList<>();

    @Test
    public void getSize(){
        linkedList.add("A");
        linkedList.add("B");
        assertEquals(2,linkedList.getSize());
    }



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
    public void getFirst(){
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        assertEquals("First", linkedList.getFirst());
    }

    @Test
        public void getLast(){
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

        assertEquals("Third", linkedList.getLast());

    }


    @Test
    public void get() {
    }

    @Test
    public void remove() {
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add("D");
        linkedList.add("E");

        linkedList.remove(2);

        assertEquals("D", linkedList.get(2));

    }
}
