package ch03;

import java.util.*;

public class Exercise07 {

    // Comparator : Allow precise control over the sort order
    public static void luckySort(ArrayList<String> strings, Comparator<String> comp){

        int iteration = 0;

        if (strings == null || comp == null) {
            throw new NullPointerException();
        }

        System.out.println("Before = "+strings);

        ArrayList<String> stringToComp = new ArrayList<>(strings);
        Collections.sort(stringToComp,comp);

        while (!strings.equals(stringToComp) && (iteration < 15)) {
            iteration = iteration + 1;
            // Sort the specified array of objects according to the order induced by the specified comparator
            Collections.shuffle(strings);
        }

        System.out.println("After = "+strings);
    }

    public static void main(String[] args) {
        //Exercise #7
        System.out.println("Exercise #7");
        ArrayList<String> arrayList = new ArrayList<>(
                Arrays.asList("Allo","mon","coco")
        );

        Comparator<String> comp = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        };

        luckySort(arrayList, comp);

    }
}
