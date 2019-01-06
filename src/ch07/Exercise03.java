package ch07;

import java.util.HashSet;
import java.util.Set;


public class Exercise03 {

    // Union made with addAll
    private static Set<Integer> union(Set<Integer> setNumbers1, Set<Integer> setNumbers2){
        Set<Integer> setResult = new HashSet<>();
        setResult.addAll(setNumbers1);
        setResult.addAll(setNumbers2);

        return setResult;
    }

    // Intersection made by retainAll
    private static Set<Integer> intersection(Set<Integer> setNumbers1, Set<Integer> setNumbers2){
        Set<Integer> setResult = new HashSet<>();
        setResult.addAll(setNumbers1);
        setResult.retainAll(setNumbers2);

        return setResult;
    }

    // Difference made by removeAll
    private static Set<Integer> difference(Set<Integer> setNumbers1, Set<Integer> setNumbers2){
        Set<Integer> setResult = new HashSet<>();
        setResult.addAll(setNumbers1);
        setResult.removeAll(setNumbers2);

        return setResult;
    }

    public static void main(String[] args) {
        //Exercise #03
        System.out.println("Exercise #03");

        // Create two sets
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(6);
        set2.add(2);
        set2.add(8);
        set2.add(4);
        set2.add(10);

        System.out.println("Create union on two sets");
        Set<Integer> setUnionResult = union(set1, set2);

        for(Integer element : setUnionResult){
            System.out.println(element.toString());
        }

        System.out.println("Create intersection on two sets");
        Set<Integer> setIntersectionResult = intersection(set1, set2);

        for(Integer element : setIntersectionResult){
            System.out.println(element.toString());
        }

        System.out.println("Create difference on two sets");
        Set<Integer> setDifferenceResult = difference(set1, set2);

        for(Integer element : setDifferenceResult){
            System.out.println(element.toString());
        }

    }
}
