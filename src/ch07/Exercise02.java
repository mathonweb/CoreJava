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
    private static ArrayList<String> loopOverCaseConv(ArrayList<String> stringsList){
        ArrayList<String> upperCaseStrings = new ArrayList<>();

        for(int index = 0; index < stringsList.size(); index ++){
            upperCaseStrings.add(stringsList.get(index).toUpperCase());
        }
        return upperCaseStrings;
    }

    // replaceAll method
    private static ArrayList<String> replaceAllCaseConv(ArrayList<String> stringsList){

        ArrayList<String> upperCaseStrings = stringsList;

        upperCaseStrings.replaceAll((e)-> e.toUpperCase());

        return upperCaseStrings;
    }

    public static void main(String[] args) {
        //Exercise #02
        System.out.println("Exercise #02");

        ArrayList<String> stringsList = createStringsList();

        System.out.println("Using iterator");
        ArrayList<String> iteratorUpperCaseStrings = iteratorCaseConv(stringsList);

        // Print result
        for(String element : iteratorUpperCaseStrings){
            System.out.println(element);
        }

        System.out.println("Using Loop over");
        ArrayList<String> loopOverUpperCaseStrings = loopOverCaseConv(stringsList);

        // Print result
        for(String element : loopOverUpperCaseStrings){
            System.out.println(element);
        }

        System.out.println("Using replaceAll");
        ArrayList<String> replaceAllUpperCaseStrings = replaceAllCaseConv(stringsList);

        // Print result
        for(String element : replaceAllUpperCaseStrings){
            System.out.println(element);
        }
    }
}
