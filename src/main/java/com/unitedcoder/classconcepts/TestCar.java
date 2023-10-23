package com.unitedcoder.classconcepts;

import java.util.ArrayList;
import java.util.Map;

public class TestCar {
    public static void main(String[] args) {
        Car toyota = new Car();
        toyota.setBrand("Toyota");
        toyota.setMade("Japan");
        toyota.setColor("White");
        toyota.setYear(2022);
        toyota.setPrice(35000);
        toyota.setMileAge(1000);
        toyota.setEngineType("2.0");

        Car honda = new Car();
        honda.setBrand("Honda");
        honda.setMade("Japan");
        honda.setColor("Pink");
        honda.setYear(2021);
        honda.setPrice(45000);
        honda.setMileAge(4000);


        Car benz = new Car();
        benz.setBrand("Benz");
        benz.setMade("German");
        benz.setColor("Black");
        benz.setYear(2023);
        benz.setPrice(65000);
        benz.setMileAge(5000);

        System.out.println(toyota.getColor());
        System.out.println(benz.getBrand());
        System.out.println(honda.getYear());
        System.out.println(toyota);

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(toyota);
        carList.add(honda);
        carList.add(benz);
        for(Car cars:carList) {
            if (cars.getBrand().equalsIgnoreCase("honda")) {
                System.out.println(String.format("%s %s %s %d %d %d",
                        cars.getBrand(),
                        cars.getColor(),
                        cars.getMade(),
                        cars.getYear(),
                        cars.getPrice(),
                        cars.getMileAge()));
            }

                System.out.println();

        }

        

    }
}
