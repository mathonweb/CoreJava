package ch06;

import java.util.Arrays;

public class Exercise05 {

    // Generic method
    public static <T> T[] swap(int i, int j, T... values){
        T temp = values[i];
        values[i] = values[j];
        values[j] = temp;
        return values;
    }

    public static void main(String[] args) {
        //Exercise #05
        System.out.println("Exercise #05");

        // No primitive type for Arrays class swap
        Double[] result = Exercise05.<Double>swap(0, 1, 1.5, 2.0, 3.0);

        System.out.println(Arrays.toString(result));
    }
}
