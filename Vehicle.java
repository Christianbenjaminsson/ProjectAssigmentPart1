package com.example.projektuppgiftdel1;

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
