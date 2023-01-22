package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("ALFA_ROMEO", "AMBER", CarType.SEDAN, 15000.0);
        Car car2 = new Car("AUDI", "AQUAMARINE", CarType.SUV, 25000.0);
        Car car3 = new Car("BMW", "BEIGE", CarType.COUPE, 12000.0);
        Car car4 = new Car("CITROEN", "BLACK", CarType.CONVERTIBLE, 22000.0);
        Car car5 = new Car("DACIA", "BLUE", CarType.MINIVAN, 19000.0);
        Car car6 = new Car("FIAT", "BLUSH", CarType.MINIVAN_TWO, 30000.0);
        Car car7 = new Car("FORD", "BROWN", CarType.MINIVAN_THREE, 17500.0);
        Car car8 = new Car("HONDA", "CHARTREUSE", CarType.FAMILY, 21000.0);
        Car car9 = new Car("INFINITY", "CHESTNUT", CarType.ALL_TERRAIN, 33000.0);
        Car car10 = new Car("JEEP", "CORAL", CarType.ALL_TERRAIN, 26000.0);
        Car car11 = new Car("LAND_ROVER", "CREAM", CarType.ALL_TERRAIN, 45000.0);
        Car car12 = new Car("INFINITY", "CRIMSON", CarType.CONVERTIBLE, 35000.0);
        Car car13 = new Car("DACIA", "EMERALD", CarType.COUPE, 26000.0);
        Car car14 = new Car("CITROEN", "GREEN", CarType.SEDAN, 27000.0);

        ArrayList<Car> carsEmp1 = new ArrayList<>();
        carsEmp1.add(car1);
        carsEmp1.add(car2);

        ArrayList<Car> carsEmp2 = new ArrayList<>();
        carsEmp2.add(car3);
        carsEmp2.add(car4);
        carsEmp2.add(car5);


        ArrayList<Car> carsEmp3 = new ArrayList<>();
        carsEmp3.add(car5);
        carsEmp3.add(car6);
        carsEmp3.add(car7);

        ArrayList<Car> carsEmp4 = new ArrayList<>();
        carsEmp4.add(car8);
        carsEmp4.add(car9);
        carsEmp4.add(car10);

        ArrayList<Car> carsEmp5 = new ArrayList<>();
        carsEmp5.add(car11);
        carsEmp5.add(car12);
        carsEmp5.add(car13);
        carsEmp5.add(car14);

        System.out.println (carsEmp1);
        System.out.println (carsEmp2);
        System.out.println (carsEmp3);
        System.out.println (carsEmp4);
        System.out.println (carsEmp5);

        Employee emp1 = new Employee("Luis", "33456985B", "Heineken", carsEmp1);
        Employee emp2 = new Employee("Marta", "123456987D", "Facundo", carsEmp1);
        Employee emp3 = new Employee("Pepe", "789456321J", "CocaCola", carsEmp1);
        Employee emp4 = new Employee("Rosa", "236598741R", "SanMiguel", carsEmp1);
        Employee emp5 = new Employee("Marcos", "365369865K", "Lays", carsEmp1);
        Employee emp6 = new Employee("Arancha", "268954781N", "Danone", carsEmp1);

        System.out.println (emp1);
        System.out.println (emp2);
        System.out.println (emp3);
        System.out.println (emp4);
        System.out.println (emp5);
        System.out.println (emp6);

        Company comp1 = new Company("comp1", "1212B", new ArrayList<>(List.of(emp1, emp2)));
        Company comp2 = new Company("comp2", "1212B", new ArrayList<>(List.of(emp3, emp4)));

        System.out.println (comp1);
        System.out.println (comp2);



        ArrayList<Company> companies = new ArrayList<>(List.of(comp1, comp2));

        ArrayList<Car> allCars = new ArrayList<>();

        for (Company company : companies) {
            System.out.println (company);
        }


        for (Company company : companies) {

            for (Employee employee : company.getEmployees()) {

                allCars.addAll(employee.getCars());



            }


            for (Car car : allCars) {
                System.out.println(car);
            }

           // for (Company company : companies) {
                for (Employee employee : company.getEmployees()) {
                    for (Car car : employee.getCars()) {
                        System.out.println(Car.toString());
                    }
                }
            }
        }


}


