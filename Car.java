package com.example.projektuppgiftdel1;

public class Car extends Vehicle {

    private String typOfCar;
    private int numberOfPassengers;

    public Car(String brand, String color, int year, String typOfCar, int numberOfPassengers) {
        super(brand, color, year);
        this.typOfCar = typOfCar;
        this.numberOfPassengers = numberOfPassengers;
    }

}
