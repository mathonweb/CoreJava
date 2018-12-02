package ch05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;

public class Exercise03 {
    public static void main(String[] args) {
        //Exercise #03
        System.out.println("Exercise #03");
        String path = "C:/Users/Mathieu/Projets/Training/CoreJava/src/ch05/test_ex1.txt";
        try {
            Double sumValue = new Exercise02().sumOfValues(path);
            System.out.println("Sum of all values in the file= " + sumValue);

        } catch (FileNotFoundException ex){
            System.out.println("Problem to open the file");
        } catch (InputMismatchException ex) {
            System.out.println("Problem with the value type");
        } catch (IOException ex) {
            System.out.println("Other problem");
        }
    }
}
