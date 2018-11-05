package ch04;
import java.lang.reflect.*;
import java.util.*;

public class test_proxy {

    public static void main(String[] args) {
        // Create an object class
        Object[] values = new Object[1000];

        // Create a proxy object
        for (int i = 0; i < values.length; i++){
            Object value = new Integer(i);
            // Returns an instance of a proxy class for the specified interfaces that dispatches method invocations to the specified invocation handler.
            values[i] = Proxy.newProxyInstance(
                    // A class loader or null to use the default class loader
                    null,
                    // An array of Class object, one for each interface to be implemented
                    // Get the Comparable interface
                    value.getClass().getInterfaces(),
                    // Lambda expression for invocation handler
                    // Processes a method invocation on a proxy instance and returns the result.
                    (Object proxy, Method m, Object[] margs) -> {
                        // Redefined the interface method
                        System.out.println(value + "." + m.getName() + Arrays.toString(margs));
                        // Call the method interface by passing the object "value" with the given argument
                        return m.invoke(value, margs);
                    }
            );

        }

        // Searches the specified array for the specified object using the binary search algorithm.
        // values is a proxy object
        Arrays.binarySearch(values, new Integer(500));
    }

}
