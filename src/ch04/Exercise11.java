package ch04;

import java.lang.reflect.*;

public class Exercise11 {
    public static void main(String[] args) {
        //Exercise #11
        System.out.println("Exercise #11");

        try {
            // Get Field out
            Field f = java.lang.System.class.getField("out");
            // Get the object
            // Return the value of the field represented by this Field
            Object obj = f.get(null);
            // Get the method from Field out
            Method m = obj.getClass().getMethod("println",String.class);
            // Invoke the println
            m.invoke(obj,"Hello, World");

        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
