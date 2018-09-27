package ch02;

import java.util.ArrayList;

public class Exercise03 {
    public static void main(String[] args) {
        //Exercise #3
        System.out.println("Exercise #3");
        System.out.println("For a mutator method, we can return something than void");
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Test");
        System.out.println("An accessor method with a return void is irrelevant.");
    }
}
