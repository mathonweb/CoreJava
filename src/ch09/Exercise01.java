package ch09;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise01 {

    private static void copyStream(InputStream inStream, OutputStream outStream) {
        try {
            byte[] inFile = inStream.readAllBytes();
            outStream.write(inFile);
            outStream.close();
        } catch  (IOException e) {
            System.out.println("inStream does not exist" + e);
        }
    }

    public static void main(String[] args) {
        //Exercise #01
        System.out.println("Exercise #01");

        // Construct InputStream and OutputStream instances
        try{
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            System.out.println("Current directory is " + s);

            Path fileToTest = Paths.get("src", "ch09", "test_ex01.txt");
            InputStream in = Files.newInputStream(fileToTest);

            Path fileResult = Paths.get("src", "ch09", "test_ex01_result.txt");
            OutputStream out = Files.newOutputStream(fileResult);

            // Call copyStream
            copyStream(in, out);

            System.out.println("Copy is done");

        } catch (IOException  e) {
            System.out.println("An I/O error occurs during opening the file: " + e);
        }
    }
}
