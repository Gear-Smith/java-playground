package com.galvanize;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class listsAndArrays {

    public static void main(String[] args) {
        sortArray(args);
    }


    public static ArrayList<String> sortArray(String[] inputArray) {
        ArrayList<String> sortedAL = new ArrayList<>();

        for (String element : inputArray ) {
            sortedAL.add(element);
        }
        sortedAL.sort(Comparator.naturalOrder());
        return sortedAL;
    }

    public HashMap<Integer, String> genHashmap() {
        HashMap<Integer, String> addedToMap = new HashMap<>();

        addedToMap.put(747, "Airplane");
        addedToMap.put(10, "Laphroaig");

        return addedToMap;
    }
}
