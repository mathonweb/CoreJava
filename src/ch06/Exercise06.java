package ch06;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise06 {

    // Subtype wildcard
    private static <E> ArrayList<E> appendList(ArrayList<? extends E> listPrim, ArrayList listSec) {
        ArrayList<E> listAppended = new ArrayList<>(listPrim);
        listAppended.addAll(listSec);
        return listAppended;
    }

    // Supertype wildcard
    private static <E> ArrayList<E> appendListSuper(ArrayList<? super E> listPrim, ArrayList listSec) {
        ArrayList<E> listAppended = new ArrayList(listPrim);
        listAppended.addAll(listSec);
        return listAppended;
    }

    public static void main(String[] args) {
        //Exercise #06
        System.out.println("Exercise #06");
        ArrayList<Integer> listPrim = new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> listSec = new ArrayList<>(Arrays.asList(5,6,7));
        ArrayList<Integer> listAppend;

        listAppend = appendList(listPrim,listSec);
        System.out.println("List appended with subtype wildcard = "+listAppend);

        listAppend.clear();

        listAppend = appendListSuper(listPrim,listSec);
        System.out.println("List appended with supertype wildcard = "+listAppend);
    }
}
