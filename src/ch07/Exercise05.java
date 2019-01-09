package ch07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class Exercise05 {

    public static void swap(List<?> list, int i, int j){

        if(list instanceof RandomAccess){
            System.out.println("List is an instance of RandomAccess");
            swapHelper(list,i,j);
        } else {
            System.out.println("List is not an instance of RandomAccess");
            swapHelperLinked(list,i,j);
        }
    }

    private static <T> void swapHelper(List<T> elements, int i, int j){
        T temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    private static <T> void swapHelperLinked(List<T> list, int i, int j){
        list.set(i, list.set(j, list.get(i)));
    }

    public static void main(String[] args) {
        //Exercise #05
        System.out.println("Exercise #05");

        //List<String> myList = new ArrayList<>();
        List<String> myList = new LinkedList<>();
        myList.add(0, "one");
        myList.add(1, "two");
        myList.add(2, "three");

        swap(myList,0,1);

        // Print result
        System.out.println(myList.get(0));
        System.out.println(myList.get(1));

    }
}
