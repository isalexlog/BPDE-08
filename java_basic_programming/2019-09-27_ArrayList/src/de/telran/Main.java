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
        list.add("First");
        System.out.println(list.getSize());
        System.out.println(list.get(0).equals("First"));

        list.add("Second");
        System.out.println(list.getSize());
        System.out.println(list.get(1).equals("Second"));

        list.add("Third");
        System.out.println(list.getSize());
        System.out.println(list.get(2).equals("Third"));

        /*for (int i = 0; i < 1000; i++) {
            list.add(String.valueOf(i));
            if (!list.get(list.getSize()-1).equals(String.valueOf(i)))
                System.out.println("Error!!!");
        }*/

        list.printList();
        list.remove(0);
        System.out.println(list.getSize());
        System.out.println(list.get(0).equals("First"));
        System.out.println(list.get(0).equals("Second"));
        list.printList();

        list.add("Fourth");
        list.printList();
    }
}
