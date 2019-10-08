package com.example.projektuppgiftdel1;

/**
 * <h1>Subclass Car</h1>
 * <p>Extends Vehicles.<br>
 * Includes private variables and getters to enable access in controller.</p>
 *
 * @author Christian Benjaminsson
 * @version 1.6
 */

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

