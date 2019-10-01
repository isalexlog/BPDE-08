package de.telran;

public class Main {

    /*
    implement method add(int index, T value)
    - all elements [index;size-1] to be shifted to the right
    and new element value to be added at index
    implement method add(int index, ArrayList<T> values)
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> testList = new ArrayList<>();
        testList.add("1");
        testList.add("2");
        testList.add("3");
        testList.add("4");

        list.add("First");
        list.add("Second");
        list.add("Third");
        list.add("Fourth");
        list.printList();
        System.out.println(list.getSize());
        /*System.out.println();
        list.add(0, "Null Position");
        list.printList();
        System.out.println();
        list.add(2, "Intermediate position");
        list.printList();*/

        System.out.println();
        list.add(2, testList);
        list.printList();
        System.out.println(list.getSize());
    }
}
