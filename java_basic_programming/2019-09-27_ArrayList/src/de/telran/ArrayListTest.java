package de.telran;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {

    private ArrayList<String> arrayList = new ArrayList<>();

    @Test
    public void addAndGet() {
        arrayList.add("First element");
        assertEquals("First element", arrayList.get(0));

        arrayList.add("Second element");
        assertEquals("Second element", arrayList.get(1));
    }

    @Test
    public void addAndGetMoreElementsThanInitialSize() {
        for (int i = 0; i < 1500; i++) {
            arrayList.add(Integer.toString(i));
        }
        for (int i = 0; i < 1500; i++) {
            assertEquals(Integer.toString(i), arrayList.get(i));
        }
    }

    @Test
    public void getSize() {
    }

    @Test(expected = IndexOutOfBoundsException.class)
    /* HW:
        create test to make sure that removing element from
        ArrayList with more than 1 element works correctly
     */
    public void remove() {
        arrayList.add("Str");
        arrayList.remove(0);
        arrayList.get(0);
    }

    @Test
    public void addArrayListToCertainPosition() {
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        ArrayList<String> listToAdd = new ArrayList<>();
        listToAdd.add("X");
        listToAdd.add("Y");

        arrayList.add(1, listToAdd);

        assertEquals("A", arrayList.get(0));
        assertEquals("X", arrayList.get(1));
        assertEquals("Y", arrayList.get(2));
        assertEquals("B", arrayList.get(3));
        assertEquals("C", arrayList.get(4));

        assertEquals(5, arrayList.getSize());
    }


}