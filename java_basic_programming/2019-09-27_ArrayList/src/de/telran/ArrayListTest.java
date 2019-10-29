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
        for (int i = 0; i < 100; i++) {
        arrayList.add(Integer.toString(i));
    }
        assertEquals(100, arrayList.getSize());
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
    public void removeWith2Elements() {
        arrayList.add("Str");
        arrayList.add("Str1");
        arrayList.remove(0);
        assertEquals("Str1", arrayList.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void removeWithException() {
        arrayList.add("Str");
        arrayList.add("Str1");
        arrayList.remove(0);
        assertEquals("Str1", arrayList.get(1));
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