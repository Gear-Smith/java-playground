package com.galvanize;

class Program {
    static boolean isActive(String status){
        if (status.equals("active")) {
            return true;
        } else {return false;}
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

        String status = "active";
        int grade = 66;
        int n = 45;

        System.out.println(isActive(status));
        System.out.println(grade(grade));


        // Print numbers from 45 -> 50 to the console
        while (n <= 50) {
            System.out.println(n);
            n++;
        }

        // Print even numbers from 2 -> 6 to the console
        for (int i = 2; i <= 6; i += 2) {
            System.out.println(i);
        }




    }


}
