package ch04;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Exercise12 {
    public static void main(String[] args) {
        //Exercise #12
        System.out.println("Exercise #12");

        try {
            // Get Field out
            Field f = java.lang.System.class.getField("out");
            // Get the object
            // Return the value of the field represented by this Field
            Object obj = f.get(null);
            // Get the method from Field out
            Method m = obj.getClass().getMethod("println",String.class);
            long timeBefore = System.currentTimeMillis();
            // Invoke the println
            m.invoke(obj,"Hello, World");
            long timeAfter = System.currentTimeMillis();
            long elapsed = timeAfter - timeBefore;
            System.out.println("Time to execute the method call via reflection: " + elapsed);

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }


        long timeBefore = System.currentTimeMillis();
        System.out.println("Hello World");
        long timeAfter = System.currentTimeMillis();
        long elapsed = timeAfter - timeBefore;
        System.out.println("Time to execute the regular method call : " + elapsed);
    }
}
