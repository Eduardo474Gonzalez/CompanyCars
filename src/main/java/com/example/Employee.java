package com.example;

import java.util.ArrayList;

public class Employee {

    private String name;
    private String nif;
    private String company;
    private ArrayList<Car> cars = new ArrayList<>();

    public Employee() {

    }

    public Employee(String name, String nif, String company, ArrayList<Car> cars) {
        this.name = name;
        this.nif = nif;
        this.company = company;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", nif='" + nif + '\'' +
                ", company='" + company + '\'' +
                ", cars=" + cars +
                '}';
    }
}
