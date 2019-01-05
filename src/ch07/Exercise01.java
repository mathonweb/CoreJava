package ch07;

import java.util.BitSet;
import java.util.HashSet;
import java.util.Set;

public class Exercise01 {
    // Create the Set of numbers
    private static Set<Integer> createHashSet(int n){
        Set<Integer> numbersSet = new HashSet<>();
        for(int index = 2 ; index < n; index++){
            numbersSet.add(index);
        }
        return numbersSet;
    }

    // Create the BitSet
    private static BitSet createBitSet(int nbits){
        BitSet numbersSet = new BitSet();
        for(int index = 2 ; index < nbits; index++){
            numbersSet.set(index, true);
        }
        return numbersSet;
    }

    // Get the Prime numbers
    private static Set<Integer> getPrimeNumbers(Set<Integer> numbersSet, int n){
        int smallestValue = 0;
        int index = 0;

        while(Math.pow(smallestValue,2) <= n){
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

    // Get the Prime bit
    private static BitSet getPrimeBit(BitSet numberSet, int n){
        int index = 2 ;

        while(Math.pow(index,2) <= n) {
            for (int incr = index; (index*incr) <= n; incr++){
                numberSet.set(index*incr,false);
            }
            index ++;
        }
        return numberSet;
    }

    public static void main(String[] args) {
        //Exercise #01
        System.out.println("Exercise #01");
        System.out.println("Sieve of Eratosthenes");

        Set<Integer> numberSet = createHashSet(100);
        Set<Integer> primeNumbers = getPrimeNumbers(numberSet, 100);

        BitSet numberBitSet = createBitSet(100);
        BitSet primeNumbersBitSet = getPrimeBit(numberBitSet, 100);

        // Print all Prime numbers
        for(Integer element : primeNumbers){
            System.out.println(element.toString());
        }

        // Print all Prime numbers bits
        // It is represented by the True bit position.  Cleared bits are not shown.
        System.out.println(primeNumbersBitSet.get(0, 99));
    }
}
