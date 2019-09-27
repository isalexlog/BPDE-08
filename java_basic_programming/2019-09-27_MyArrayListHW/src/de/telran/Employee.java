package de.telran;

public class Employee {

    private String name;
    private String position;
    private int age;
    private int salary;
    private boolean insurance;

    public Employee(String name, String position, int age, int salary, boolean insurance) {
        this.name = name;
        this.position = position;
        this.age = age;
        this.salary = salary;
        this.insurance = insurance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isInsurance() {
        return insurance;
    }

    public void setInsurance(boolean insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", insurance=" + insurance +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (age != employee.age) return false;
        if (salary != employee.salary) return false;
        if (insurance != employee.insurance) return false;
        if (name != null ? !name.equals(employee.name) : employee.name != null) return false;
        return position != null ? position.equals(employee.position) : employee.position == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (position != null ? position.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + salary;
        result = 31 * result + (insurance ? 1 : 0);
        return result;
    }
}
