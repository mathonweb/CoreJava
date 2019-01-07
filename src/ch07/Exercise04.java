package ch07;

import java.util.*;

public class Exercise04 {

    public static void main(String[] args) {
        //Exercise #04
        System.out.println("Exercise #04");

        List<String> stringsList = new ArrayList<>(Arrays.asList("hi","how","are","you"));

        ListIterator<String> iter1 = stringsList.listIterator();
        ListIterator<String> iter2 = stringsList.listIterator();

        iter1.add("hello");

        try {
            iter2.add("Hey");
        } catch (ConcurrentModificationException ex){
            System.out.println("Concurrent Modification Exception");
        }

        // Print result
        for(String element : stringsList){
            System.out.println(element);
        }
    }
}
