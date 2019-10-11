package de.telran.LinkedList;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList<String> linkedList;

    @Before
    public void init() {
        linkedList = new LinkedList<>();
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

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementWithIndexMoreThanSize() {
        linkedList.get(3);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getElementWithIndexLessThanZero() {
        linkedList.get(-1);
    }

    @Test
    public void removeFromCenter() {
        linkedList.remove(1);
        assertEquals("First",linkedList.get(0));
        assertEquals("Third", linkedList.get(1));
    }

    @Test
    public void removeFirst() {
        linkedList.remove(0);
        assertEquals("Second", linkedList.get(0));
    }

    @Test
    public void removeLast() {
        linkedList.remove(2);
        assertEquals("Second", linkedList.getLast());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWhenSizeIsOne() {
        linkedList.remove(0);
        linkedList.remove(0);
        linkedList.remove(0);
        assertEquals(0, linkedList.getSize());

        linkedList.get(0);
    }
}