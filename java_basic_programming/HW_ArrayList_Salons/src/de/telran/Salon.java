package de.telran;

import java.util.Objects;

public class Salon {

        private String name;
        private  String address;
        private String tel;
        private String hours;

    public Salon(String name, String address, String tel, String hours) {
        this.name = name;
        this.address = address;
        this.tel = tel;
        this.hours = hours;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getStars() {
        return hours;
    }

    public void setStars(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Salon{" +
                "'" + name + "\'" +
                ", " + address + ' ' +
                ", Contact : " + tel +' '+ "," + "Business hours : " + hours +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (! (o instanceof Salon)) return false;
        Salon salon = (Salon) o;
        return getTel() == salon.getTel() &&
                Objects.equals(getName(), salon.getName()) &&
                Objects.equals(getAddress(), salon.getAddress())&&
                Objects.equals(getStars(), salon.getStars());
    }



}
