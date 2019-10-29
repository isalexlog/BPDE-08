package de.telran;

public class Person implements Comparable<Person>{
     String name;
     int age;
     Integer weigth;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (age > o.age) {
            return 1;
        }
        if (age < o.age ) {
            return -1;
        }
        return 0;
    }
}
