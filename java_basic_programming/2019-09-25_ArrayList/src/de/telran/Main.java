package de.telran;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    /*
    Write you own implementation of the ArrayList and its methods
    - add(Object o)
    - get(int index)
    - remove(int index)
    Use 2 as an initial capacity of the array where you will store the elements.
    Please test your array with at list 4 elements.
     */

    public static void main(String[] args) {

        Company[] companies = new Company[3];
        companies[0] = new Company(
                "TK1",
                "public",
                1850,
                10000000
        );
        companies[1] = new Company(
                "TK2",
                "public",
                1851,
                10000020
        );
        companies[2] = new Company(
                "TK3",
                "public",
                1852,
                10000025
        );


        List<Company> companyList = new ArrayList<>();
        companyList.add(companies[0]);
        companyList.add(companies[1]);
        companyList.add(companies[2]);

        /*System.out.println(companyList.size());
        System.out.println(companies.length);

        System.out.println(companyList.get(1));
        System.out.println(companyList.remove(1));
        System.out.println(companyList.get(1));*/

        companyList.add(new Company(
           "IBM",
           "public",
           1945,
           200000
        ));

        Company.changeNameInList(companyList, "IBM");
        for (Company company: companyList) {
            System.out.println(company);
        }

        for (int i = 0; i < companyList.size(); i++) {
            System.out.println(companyList.get(i));
        }

        System.out.println(companyList.remove(new Company(
                "IBM",
                "public",
                1945,
                200000
        )));


    }
}
