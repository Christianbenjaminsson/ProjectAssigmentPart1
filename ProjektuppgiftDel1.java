package com.example.projektuppgiftdel1;

import java.util.Scanner;

public class ProjektuppgiftDel1 {

    //Detta är den körbara klassen.
    //Det ska finnas en meny med valen lägg till fordon och visa fordon samt avsluta applikationen.
    
    //Skapa Switch

    private static Scanner scan = new Scanner(System.in);
    VehiclesController vehiclesController = new VehiclesController();

    public static void main(String[] args) {

        boolean quit = false;
        printactions();

        while(!quit) {
            System.out.println("Print your choise: ");
            String input = scan.nextLine();

            switch (input) {
                case 1:
                    addNewCar();
                break;;

                case 2:
                break;

                case 3:
                quit = true;
                break;
            }

        }
    }

    private static void printactions() {
        System.out.println("Print your choise: \n" +
                "1. Add vehicle \n" +
                "2. Show vehicles \n" +
                "3. End application");

    }

    private static void addNewCar() {
        System.out.println("Write brand of vehicle: ");
        String brand = scan.nextLine();
        System.out.println("Write color of vehicle: ");
        String color = scan.nextLine();
        System.out.println("Write year of vehicle: ");
        int year = scan.nextInt();
        scan.nextLine();
        System.out.println("What kind of Vehicle: ");
        String typOfCar = scan.nextLine();
        System.out.println("Number of passengers: ");
        int numberOfPassengers = scan.nextInt();
        scan.nextLine();
        Car newCar = Car.createCar(brand, color, year, typOfCar, numberOfPassengers);
        if(VehiclesController.addNewCar(newCar)) {
            System.out.println("New vehicle created: brand: " +brand+ " color: " +color+
                    " year: " +year + " type of car: " +typOfCar+ " number of passengers " +numberOfPassengers);
        } else {
            System.out.println("Can´´ add vehicle " +brand+ " it already excists");
        }
    }


}
