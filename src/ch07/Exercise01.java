package ch07;

import java.util.HashSet;
import java.util.Set;

public class Exercise01 {
    // Create the Set of numbers
    private static Set<Integer> createSet(int n){
        Set<Integer> numbersSet = new HashSet<>();
        for(int index = 2 ; index < n; index++){
            numbersSet.add(index);
        }
        return numbersSet;
    }

    // Get the Prime numbers
    private static Set<Integer> getPrimeNumbers(Set<Integer> numbersSet, int n){
        int smallestValue = 0;
        int index = 0;

        while(Math.pow(smallestValue,2) < n){
            smallestValue = (Integer)numbersSet.toArray()[index];

            // Look for value associated to s^2, s*(s+1), s*(s+2), and so on
            for(int incr = smallestValue; (smallestValue*incr) <= n; incr++ ){
                // If present, remove the value from the list
                if(numbersSet.contains(smallestValue*incr)){
                    numbersSet.remove(smallestValue*incr);
                }
            }

            index++;
        }
        return numbersSet;
    }

    public static void main(String[] args) {
        //Exercise #01
        System.out.println("Exercise #01");
        System.out.println("Sieve of Eratosthenes");

        Set<Integer> numberSet = createSet(100);
        Set<Integer> primeNumbers = getPrimeNumbers(numberSet, 100);

        // Print all Prime numbers
        for(Integer element : primeNumbers){
            System.out.println(element.toString());
        }
    }
}
