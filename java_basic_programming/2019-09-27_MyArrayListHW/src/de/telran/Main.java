package de.telran;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[5];

        employees[0] = new Employee(
                "Bob",
                "employee",
                20,
                20000,
                true);

        employees[1] = new Employee(
                "Bil",
                "trainee ",
                19,
                10000,
                true);

        employees[2] = new Employee(
                "Tim",
                "employee",
                24,
                22000,
                true);

        employees[3] = new Employee(
                "Tom",
                "employer",
                50,
                60000,
                false);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employees[0]);
        employeeList.add(employees[1]);
        employeeList.add(employees[2]);
        employeeList.add(employees[3]);


        System.out.println(employeeList.size());
        System.out.println(employees.length);
        System.out.println("----------------------");
        System.out.println(employeeList);
        System.out.println("----------------------");
        System.out.println(employeeList.get(3));
        System.out.println("removed " + employeeList.remove(new Employee(
                "Tom",
                "employer",
                50,
                60000,
                false)));
        System.out.println(employeeList);
        System.out.println("----------------------");

    }
}
