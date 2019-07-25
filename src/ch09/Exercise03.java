package ch09;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercise03 {

    private static void findByteOrdering(InputStream inStream) {
        try {
            byte[] inFile = inStream.readAllBytes();
            if(inFile[0] == (short)Integer.parseInt("FEFF", 16)) {
                System.out.println("This is Big-Endian");
            } else if(inFile[0] == (short)Integer.parseInt("FFEF", 16)) {
                System.out.println("This is Little-Endian");
            } else {
                System.out.println("It is impossible to determine the Endianness");
            }
        } catch  (IOException e) {
            System.out.println("inStream does not exist" + e);
        }
    }

    public static void main(String[] args) {
        //Exercise #03
        System.out.println("Exercise #03");

        // Construct InputStream and OutputStream instances
        try {
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            System.out.println("Current directory is " + s);

            Path fileToTest = Paths.get("src", "ch09", "test_ex02_utf8.txt");

            InputStream in = Files.newInputStream(fileToTest);

            findByteOrdering(in);

        } catch (IOException e) {
            System.out.println("An I/O error occurs during opening the file: " + e);
        }
    }
}
