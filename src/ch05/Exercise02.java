package ch05;

import java.io.IOException;
import java.util.ArrayList;

public class Exercise02 {
    public static void main(String[] args) throws Throwable {
        //Exercise #02
        System.out.println("Exercise #02");

        String path = "C:/Users/Mathieu/Projets/Training/CoreJava/src/ch05/test_ex1.txt";
        Exercise02 ex2 = new Exercise02();
        Double sumValue = ex2.sumOfValues(path);
        System.out.println("Sum of all values in the file= " + sumValue);

    }

    public double sumOfValues(String filename) throws IOException {
        Exercise01 ex1 = new Exercise01();
        ArrayList<Double> arrayValues = ex1.readValues(filename);
        Double sum = 0.0;
        for (Double val: arrayValues) {
            sum = val + sum;
        }
        return sum;
    }
}
