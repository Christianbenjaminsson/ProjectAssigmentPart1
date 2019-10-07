package com.example.projektuppgiftdel1;

import java.util.Scanner;

/**
 * <h1>Project Arraylist</H>
 * Program that saves information about vehicles in an arraylist.
 * Menu with choises: add Vehicles, show vehicles, show menu and end application.
 * <p></p>
 *
 * @author Christian Benjaminsson
 * @version 1.0
 */

public class ProjektuppgiftDel1 {

    private static Scanner scan = new Scanner(System.in);
    private static VehiclesController vehiclesController = new VehiclesController();

    public static void main(String[] args) {

        boolean quit = false;
        printactions();

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

    private static void printactions() {
        System.out.print("\nMenu: \n\n" +
                "1. Add vehicle \n" +
                "2. Show vehicles \n" +
                "3. Show menu\n" +
                "4. End application\n");

    }

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
            System.out.println("Can´t add vehicle " +brand+ " it already excists");
        }
    }


}
