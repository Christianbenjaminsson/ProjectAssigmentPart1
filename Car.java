package com.example.projektuppgiftdel1;

public class Car extends Vehicle {

    private String typOfCar;
    private int numberOfPassengers;


    public Car(String brand, String color, int year, String typOfCar, int numberOfPassengers) {
        super(brand, color, year);
        this.typOfCar = typOfCar;
        this.numberOfPassengers = numberOfPassengers;
    }

    public static Car createCar(String brand, String color, int year, String typOfCar, int numberOfPassengers) {
        return new Car(brand, color, year, typOfCar, numberOfPassengers);
    }

    public String getBrand() {
        return super.brand();
    }

    public String getColor() {
        return super.color();
    }

    public int getYear() {
        return super.year();
    }

    public String typOfCar() {
        return typOfCar;
    }

    public int numberOfPassengers() {
        return numberOfPassengers;
    }
}

