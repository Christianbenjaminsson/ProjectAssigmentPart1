package com.example.projektuppgiftdel1;

import java.util.Scanner;

/**
 * <h1>Project Arraylist</h1>
 * <p>Program that saves information about vehicles in an arraylist.<br>
 * Menu with choises: add Vehicles, show vehicles, show menu and end application.</p>
 *
 * @author Christian Benjaminsson
 * @version 1.6
 */

public class ProjektuppgiftDel1 {

    private static Scanner scan = new Scanner(System.in);
    private static VehiclesController vehiclesController = new VehiclesController();

    public static void main(String[] args) {

        boolean quit = false;
        printactions();

        /**
         * While-loop runs until user ends application via choice in menu
         */
        while(!quit) {
            System.out.print("\nPrint your choise (choose 3 for menu): ");
            int input = scan.nextInt();
            scan.nextLine();

            switch (input) {
                case 1:
                    addNewCar();
                break;

                case 2:
                    vehiclesController.printVehicles();
                break;

                case 3:
                    printactions();
                break;

                case 4:
                    quit = true;
                break;
            }
        }
    }

    /**
     * Printactions is called and prints out menu before while-loop
      */
    private static void printactions() {
        System.out.print("Menu: \n\n" +
                "1. Add vehicle \n" +
                "2. Show vehicles \n" +
                "3. Show menu\n" +
                "4. End application\n");

    }

    /**
     * Method addNewCar is called via menu in switch<br>
     * User inputs to save information about a new car.<br>
     * Object newcar is created and saves input from user if input not match already saved car.
     */
    private static void addNewCar() {
        System.out.print("Write brand of vehicle: ");
        String brand = scan.nextLine();
        System.out.print("Write color of vehicle: ");
        String color = scan.nextLine();
        System.out.print("Write year of vehicle: ");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.print("What kind of Vehicle: ");
        String typOfCar = scan.nextLine();
        System.out.print("Number of passengers: ");
        int numberOfPassengers = scan.nextInt();
        scan.nextLine();
        Car newCar = Car.createCar(brand, color, year, typOfCar, numberOfPassengers);
        if(vehiclesController.addNewCar(newCar)) {
            System.out.println("New vehicle created: Brand: " +brand+ " Color: " +color+
                    " Year: " +year + " Type of car: " +typOfCar+ " Number of passengers " +numberOfPassengers);
        } else {
            System.out.println("Can´t add vehicle " +brand+ " it already exists");
        }
    }
}
