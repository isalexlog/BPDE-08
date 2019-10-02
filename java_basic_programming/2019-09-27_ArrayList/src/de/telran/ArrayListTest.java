package de.telran;

import static org.junit.Assert.*;

public class ArrayListTest {

    private ArrayList<String> arrayList = new ArrayList<>();

    @org.junit.Test
    public void addAndGet() {

        arrayList.add("First element");
        assertEquals("First element", arrayList.get(0));
        arrayList.add("Second element");
        assertEquals("Second element", arrayList.get(1));
    }

    @org.junit.Test
    public void AddAndGetMoreElementsThanInitialSize() {
        for (int i = 0; i < 2000; i++) {
            arrayList.add(Integer.toString(i));
        }
        for (int i = 0; i < 2000; i++) {
            assertEquals(Integer.toString(i), arrayList.get(i));
        }
    }

    @org.junit.Test
    public void getSize() {
    }

    @org.junit.Test(expected = IndexOutOfBoundsException.class)
    /* HW:
        create test to make sure that removing element from ArrayList with more than 1 element works correctly
     */
    public void remove() {
        arrayList.add("Str");
        arrayList.remove(0);
        arrayList.get(0);

    }

    @org.junit.Test
    public void removeElementFromArrayWithSeveralElements() {
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.remove(2);
        assertEquals("D", arrayList.get(2));
    }

    @org.junit.Test
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