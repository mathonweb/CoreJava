package ch05;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise01 {
    public static void main(String[] args) throws Throwable {
        //Exercise #01
        System.out.println("Exercise #01");
        String path = "C:/Users/Mathieu/Projets/Training/CoreJava/src/ch05/test_ex1.txt";

        Exercise01 ex1 = new Exercise01();
        ArrayList<Double> arrayValues = ex1.readValues(path);
        System.out.println(arrayValues);
    }

    public ArrayList<Double> readValues(String filename) throws IOException {
        ArrayList<Double> arrayValues = new ArrayList<>();

        File file = new File(filename);
        if (!file.exists()) {
            throw new FileNotFoundException(filename);
        }

        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNext()) {
                arrayValues.add(sc.nextDouble());
            }
        }
            return arrayValues;
    }
}
