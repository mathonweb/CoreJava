package ch04;

import java.lang.reflect.*;

public class Exercise09 {

    public static void main(String[] args) {
        //Exercise #9
        System.out.println("Exercise #7");

        // Create an object
        Empl empl1 = new Empl("Math");

        // Print the variables
        System.out.println(toString(empl1));
    }

    public static String toString(Object obj) {
        StringBuffer sb = new StringBuffer();
        String newline = "\r\n";
        for (Field f : obj.getClass().getDeclaredFields()) {
            int mod = f.getModifiers();
            f.setAccessible(true);
            try {
                Object value = f.get(obj);
                sb.append(newline + Modifier.toString(mod) + " " + f.getType().getSimpleName() + " " + f.getName() + " " + value);
            } catch (IllegalAccessException e){     // Exception variable "e" refers to the exception object
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
}

class Empl {

    private String name;
    protected String salary;
    String nbYears;
    static String id;

    public Empl(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
