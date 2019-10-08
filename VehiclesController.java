package com.example.projektuppgiftdel1;

import java.util.ArrayList;

/**
 * <h1>Controller class VehiclesController</h1>
 * <p>Includes methods to control flow of data.<br>
 * Also includes arraylist named Car to save information about vehicles.</p>
 *
 * @author Christian Benjaminsson
 * @version 1.6
 */

public class VehiclesController {

    /**
     * Creates new arraylist named databaseCars
     */
    private ArrayList<Car> databaseCars;

    public VehiclesController() {
        this.databaseCars = new ArrayList<Car>();
    }

    /**
     * <p>Method is called when user wants to save a new car.<br>
     * If brand already is saved print out message "This car is already saved.<br>
     * If brand not match already saved brand a new car will be saved in arraylist databaseCars.<br>
     * </p>
     * @param car
     * @return
     */
    public boolean addNewCar(Car car) {
        if(findCar(car.getBrand()) >=0) {
            System.out.println("This car is already saved.");
            return false;
        }

        databaseCars.add(car);
        return true;
    }

    /**
     *<p>Method is used in method addNewcar<br>
     * Search arraylist to check if input from user already exists</p>
     * @param carName
     * @return
     */
    private int findCar(String carName) {
        for(int i=0; i<this.databaseCars.size(); i++) {
            Car car = this.databaseCars.get(i);
            if(car.getBrand().equals(carName)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * <p>PrintVehicles prints saved vehicles<br>
     * If database is empty print message "Default message - database is empty."</p>
     */
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
