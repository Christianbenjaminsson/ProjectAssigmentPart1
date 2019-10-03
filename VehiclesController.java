package com.example.projektuppgiftdel1;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class VehiclesController {

    private ArrayList<Car> databaseCars;

    public VehiclesController() {
        this.databaseCars = new ArrayList<Car>();
    }

    public boolean addNewCar(Car car) {
        if(findCar(car.getBrand()) >=0) {
            System.out.println("This car is already saved.");
            return false;
        }

        databaseCars.add(car);
        return true;
    }

    /*private int findCar(Car car) {
        return this.databaseCars.indexOf(car);
    }*/

    private int findCar(String carName) {
        for(int i=0; i<this.databaseCars.size(); i++) {
            Car car = this.databaseCars.get(i);
            if(car.getBrand().equals(carName)) {
                return i;
            }
        }
        return -1;
    }

    public void printVehicles() {
        System.out.println("\nDatabase Vehicles:");
        for(int i=0; i<this.databaseCars.size(); i++) {
            System.out.println((i+1) + ". Brand: " +
                    this.databaseCars.get(i).getBrand() + ", Color: " +
                    this.databaseCars.get(i).getColor() + ", Year: " +
                    this.databaseCars.get(i).getYear() + ", Typ of car: " +
                    this.databaseCars.get(i).typOfCar() + ", Number of passengers: " +
                    this.databaseCars.get(i).numberOfPassengers());
        }
        if(this.databaseCars.size() == 0) {
            System.out.println("Default message - database is empty.");
        }
    }

}
