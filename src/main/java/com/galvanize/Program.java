package com.galvanize;
import java.util.Scanner;

class Program {
    static boolean isActive(String status){

        return status.equals("active");
    }

    static void printPositiveFrom45(int number){
        // Print numbers from 45 -> 50 to the console
        while (number <= 50) {
            System.out.println(number);
            number++;
        }
    }

    static void printEvenFrom2_6(){

        for (int i = 2; i <= 6; i += 2) {
            System.out.println(i);
        }
    }

    static String grade(int input) {

        if (input >= 90) {
            return "A";
        } else if (input >= 80) {
            return "B";
        } else if (input >= 70) {
            return "C";
        } else if (input >= 60) {
            return "D";
        } else if (input >= 0) {
            return "F";
        }
        return "Something went wrong.";
    }

    public static void main (String[] args) {

        Scanner scanning = new Scanner(System.in);

        Motorcycle blueMotorcycle = new Motorcycle(1993,4,750,"Blue", "Honda", "Nighthawk");
        blueMotorcycle.printBikeInfo();


        boolean programState = true;

        while(programState){

            System.out.println("What do you want tot do with your bike: ");
            String action = scanning.nextLine();


            switch (action) {
                case "ignition on": {
                    blueMotorcycle.setIgnitionState("On");
                    System.out.println("\ncode to turn on ignition\n");
                    blueMotorcycle.printBikeInfo();
                    break;
                }
                case "fuel on": {
                    blueMotorcycle.setFuelSelectorState("On");
                    blueMotorcycle.printBikeInfo();
                }
                case "start engine": {
                    blueMotorcycle.startBike();
                    System.out.println("\nThe bike is running\n");
                    blueMotorcycle.printBikeInfo();
                    break;
                }

                case "show bike": {
                    blueMotorcycle.printBikeInfo();
                    break;
                }

                case "exit": {
                    programState = false;
                }
            }
        }
    }
}