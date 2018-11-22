package ch04;

import java.lang.reflect.*;
import java.util.Arrays;

public class Exercise10 {
    public static void main(String[] args) {
        //Exercise #10
        System.out.println("Exercise #10");

        int[] intArray = {1,2,3};
        printMethod(intArray);
    }

    // Methods for example p.161
    public static void printMethod(Object obj) {
        Class<?> cl = obj.getClass();
        while (cl != null){
            for (Method m : cl.getDeclaredMethods()) {
                System.out.println(
                  Modifier.toString(m.getModifiers()) + " " +
                        m.getReturnType().getCanonicalName() + " " +
                        m.getName() +
                        Arrays.toString(m.getParameters())
                );
            }
            cl = cl.getSuperclass();
        }
    }
}