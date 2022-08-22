package com.galvanize;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Objects;

public class AccumulatorPatterns {
    /*
        Inputs:      Array of ints
        Output:      int - sum of all elements
        Constraints: None
        Edge Cases:  {Empty input, return 0}
     */

    public int arraySum(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    public boolean allPositive(ArrayList<Integer> nums){

        for (Integer num : nums) {
            if (num <= 0)
                return false;
        }

        return true;
    }


    public String reversedString(String stringToReverse){
        String reversedString = "";

        for (int i = stringToReverse.length() -1; i > 0  ; i--) {
            reversedString += stringToReverse.charAt(i);
        }

        return reversedString;
    }


    public HashMap<String, Integer> raffleCounter(ArrayList<String> tickets ){
        HashMap<String, Integer> counter = new HashMap<>();

        for (String name: tickets) {
            if (counter.containsKey(name)) {
                counter.replace(name, counter.get(name) + 1);
            }

            counter.put(name, 1);
        }
        return counter;
    }

    //  Below is the learn-content

    /*
        Determine the inputs/outputs for normal case
        Determine the inputs/outputs for empty case
        Define the method
        Define and initialize the accumulator
        Return the accumulator
        Iterate over the accumulator
     */
    public String toSentence(String[] input){
        String sentence = "";
        StringBuilder builder = new StringBuilder();

        for (String name : input) {
            // If empty string, add empty
            if (name == ""){
                sentence += name;
            } else if (name == input[input.length -1]) {
                sentence += "and " + name;
            } else if (name == input[input.length -2]) {
                sentence += name + " ";
            } else sentence += name + ", ";
        }

        return sentence;
    }
    // Write a method that takes in two arrays of ints and returns a new array with an element for each
    // element in the first array, added to each element in the second array. For example:
    // [1, 2], [2,3] would return [3,4,4,5]




    // write a method that takes in a number and uses the accumulator pattern to determine
    // what the number is, then return the number



    // write a method that takes in an array of strings and returns a single string with
    // each element separated by a space. Then add a period to the end. You can't may not use
    // any static String methods. Then return the string
}
