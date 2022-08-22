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

        String[] names = new String[]{"John", "", "James", "Joe"};
        AccumulatorPatterns accumulator = new AccumulatorPatterns();
        System.out.println(accumulator.toSentence(names));





        Scanner scanning = new Scanner(System.in);

        Motorcycle blueMotorcycle = new Motorcycle(1993,4,750,"Blue", "Honda", "Nighthawk");


        AccumulatorPatterns test = new AccumulatorPatterns();
        test.arraySum(new int[]{22,22,22,22});

        boolean programState = true;

        while(programState){

            System.out.println("\033[H\033[J");
            System.out.flush();
            blueMotorcycle.printBikeInfo();


            System.out.println("What do you want tot do with your bike: ");
            String action = scanning.nextLine();


            switch (action) {
                case "ignition on": {

                    blueMotorcycle.setIgnitionState("On");

                    break;
                }
                case "fuel on": {

                    blueMotorcycle.setFuelSelectorState("On");
                    break;
                }
                case "start engine": {
                    System.out.flush();

                    blueMotorcycle.startBike();
                    System.out.println("\nThe bike is running\n");
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