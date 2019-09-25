package de.telran;

public class Company {

    private String name;
    private String type;
    private int establishedYear;
    private int shareCapital;

    public Company(String name, String type, int establishedYear, int shareCapital) {
        this.name = name;
        this.type = type;
        this.establishedYear = establishedYear;
        this.shareCapital = shareCapital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public int getShareCapital() {
        return shareCapital;
    }

    public void setShareCapital(int shareCapital) {
        this.shareCapital = shareCapital;
    }
}
