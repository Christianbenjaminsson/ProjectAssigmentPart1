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
}
