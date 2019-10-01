package de.telran;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
   private ArrayList <String> arrayList = new ArrayList<>();

    @org.junit.Test
    public void addAndGet() {
        //ArrayList <String> arrayList = new ArrayList<>();

        arrayList.add("First element");
        assertEquals("First element", arrayList.get(0));

        arrayList.add("Second element");
        assertEquals("Second element", arrayList.get(1));


    }

    @org.junit.Test
    public void addAndGetMoreElementsThenInitialSize() {
        //ArrayList <String> arrayList = new ArrayList<>();

        for(int i = 0; i < 1500; i++){
            arrayList.add(Integer.toString(i));
        }
        for(int i = 0; i < 1500; i++){
            assertEquals(Integer.toString(i), arrayList.get(i));
        }
    }

    @org.junit.Test
    public void getSize() {
    }

    @org.junit.Test(expected = IndexOutOfBoundsException.class)

    public void remove() {
        arrayList.add("Str");
        arrayList.remove(0);
        arrayList.get(0);
    }

    @Test
    public void addArrayListCertainPosition(){
        arrayList.add("A");
        arrayList.add("b");
        arrayList.add("B");

        ArrayList<String> listToAdd = new ArrayList<>();
        listToAdd.add("X");
        listToAdd.add("Y");

        arrayList.add(1, listToAdd);
        assertEquals("A", arrayList.getSize(0));
        assertEquals("X", arrayList.getSize(1));
        assertEquals("Y", arrayList.getSize(2));
        assertEquals("B", arrayList.getSize(3));
        assertEquals("C", arrayList.getSize(4));

    }

}