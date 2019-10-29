package de.telran;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        Company[] companies = new Company[4];

        companies[0] = new Company("TK1",
                "public",
                1850,
                10000000);

        companies[1] = new Company("TK1",
                "public",
                1851,
                20000000);

        companies[2] = new Company("TK1",
                "public",
                1852,
                30000000);

        companies[3] = new Company("TK1",
                "public",
                1853,
                10000000);

        List<Company> companyList = new ArrayList<>();
        /*
        Strg + mausklick auf zb add >>>
        Strg + alt + mausklick zb arraylist>>>
         */
        companyList.add(companies[0]);
        companyList.add(companies[1]);
        companyList.add(companies[2]);
        //companyList.add(companies[3]);

        System.out.println(companyList.size());
        System.out.println(companies.length);

        System.out.println(companyList.get(1));
        companyList.remove(1);
        System.out.println(companyList.get(1));

        companyList.add(new Company(
                "IBM",
                "public",
                1945,
                200000
        ));

        System.out.println(companyList.remove(new Company(
                "IBM",
                "public",
                1945,
                200000
        )));

        companyList.isEmpty();
        System.out.println(companyList.isEmpty());

      Company.changeNameInList(companyList, "IBM");
        for(Company company : companyList) {
            System.out.println(company);
        }

        for( int i = 0; i < companyList.size(); i++){
            System.out.println(companyList.get(i));
        }
    }
}
