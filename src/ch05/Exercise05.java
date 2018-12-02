package ch05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        //Exercise #05
        System.out.println("Exercise #05");

        ArrayList<String> lines = new ArrayList<>(Arrays.asList("Hello", "World"));
        PrintWriter out = null;
        try {
            out = new PrintWriter("C:/Users/Mathieu/Projets/Training/CoreJava/src/ch05/output.txt");
            for (String line : lines) {
                out.println(line.toLowerCase());
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error during file creation");
        } finally {
            if (out != null)
            out.close();
        }

        String path = "C:/Users/Mathieu/Projets/Training/CoreJava/src/ch05/output.txt";
        Scanner sc = null;
        try {
            File file = new File(path);
            sc = new Scanner(file);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Error during file opening");
        } catch (IllegalStateException | NoSuchElementException ex) {
            ex.printStackTrace();
        } finally {
            if (sc != null)
            sc.close();
        }
    }
}
