package ch07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Exercise02 {

    // Create an array list of strings
    private static ArrayList<String> createStringsList(){
        ArrayList<String> stringsList = new ArrayList<>(Arrays.asList("hi","how","are","you"));
        return stringsList;
    }

    // Iterator to convert strings into uppercase
    private static ArrayList<String> iteratorCaseConv(ArrayList<String> stringsList){
        Iterator<String> iter = stringsList.iterator();
        ArrayList<String> upperCaseStrings = new ArrayList<>();

        while(iter.hasNext()){
            upperCaseStrings.add(iter.next().toUpperCase());
        }
        return upperCaseStrings;
    }

    // Loop over the index values

    // replaceAll method

    public static void main(String[] args) {
        //Exercise #02
        System.out.println("Exercise #02");

        ArrayList<String> stringsList = createStringsList();

        ArrayList<String> upperCaseStrings = iteratorCaseConv(stringsList);

        for(String element : upperCaseStrings){
            System.out.println(element);
        }
    }
}
