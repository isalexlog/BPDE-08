package de.telran;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String [] args){

        Salon [] salon = new Salon [2];

        salon[0] = new Salon(
                "Xenia",
                "Friedrichstr.206, 12435 Berlin",
                "030 456765" ,
                "Mo-Fr.: 10 a.m - 6 p.m "
        );
        salon[0] = new Salon(
                "Flora",
                "Paulstr.11, 10557 Berlin",
                "030 564 564",
                "Mo-Fr.: 8 a.m - 6 p.m"
        );


        List<Salon> salonList = new ArrayList<>();
        salonList.add(salon[0]);
        salonList.add(salon[1]);


        salonList.add(new Salon(
           "Rosa",
           "Kudamm 256, 12300 Berlin",
           "030 357 475",
                "Mo-Fr.: 10 a.m - 8 p.m "

        ));

        System.out.println(salonList.size());
        System.out.println(salon.length);

        System.out.println(salonList.get(0));
        System.out.println(salonList.remove(0));
        System.out.println(salonList.get(1));

    }


}
