package de.telran.LinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList<String> linkedList = new LinkedList<>();

    @Before
    public void init() {
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");

    }

    @Test
    public void add() {

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

    @Test
    public void getSize() {
        assertEquals(3, linkedList.getSize());


    }

    @Test(expected = NullPointerException.class)
    public void removeLast() {
        linkedList.remove(2);
        linkedList.get(2);

    }

    @Test
    public void remove0() {
        linkedList.remove(0);
        assertEquals("Second", linkedList.get(0));
        assertEquals("Third", linkedList.get(1));

    }

    @Test
    public void remove1() {
        linkedList.remove(1);
        assertEquals("First", linkedList.get(0));
        assertEquals("Third", linkedList.get(1));

    }

    @Test
    public void removeCompareSize() {
        linkedList.remove(2);
        assertEquals(2, linkedList.getSize());
    }

}