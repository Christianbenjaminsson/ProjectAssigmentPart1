package com.example.projektuppgiftdel1;

/**
 * <h1>Superclass Vehicle</h1>
 * includes private variables for sub-classes.
 * Public methods to enable access to other classes.
 * <p></p>
 *
 * @author Christian Benjaminsson
 * @version 1.0
 */

public class Vehicle {

    private String brand;
    private String color;
    private int year;

    public Vehicle(String brand, String color, int year) {
        this.brand = brand;
        this.color = color;
        this.year = year;
    }

    public String brand() {
        return brand;
    }

    public String color() {
        return color;
    }

    public int year() {
        return year;
    }
}
