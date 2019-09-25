package de.telran;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

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

        System.out.println(companyList.size());
        System.out.println(companies.length);
    }
}
