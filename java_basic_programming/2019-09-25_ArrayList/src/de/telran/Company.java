package de.telran;

import java.util.List;

public class Company {

    private String name;
    private String type;
    private int establishedYear;
    private int shareCapital;

    public static void changeNameInList(List<Company> companyList, String name) {
        for (Company company: companyList) {
            if (company.getName().equals(name))
                company.setName(new StringBuilder(name).reverse().toString());
        }
    }

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

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", establishedYear=" + establishedYear +
                ", shareCapital=" + shareCapital +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        if (establishedYear != company.establishedYear) return false;
        if (shareCapital != company.shareCapital) return false;
        if (name != null ? !name.equals(company.name) : company.name != null) return false;
        return type != null ? type.equals(company.type) : company.type == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + establishedYear;
        result = 31 * result + shareCapital;
        return result;
    }
}
