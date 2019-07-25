package ch09;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {

    private static void setAlphaFile(Path inPath, OutputStream outStream) {
        ArrayList<String> wordsList = new ArrayList<>();
        Writer out = new OutputStreamWriter(outStream);

        try {
            // Read all words from the inStream
            Scanner in = new Scanner(inPath);
            while(in.hasNextLine()) {
                Scanner s2 = new Scanner(in.nextLine());
                while(s2.hasNext()) {
                    wordsList.add(s2.next());
                }
            }

            // Alphabetize the list of words with is line numbers in which each word occurs
            //wordsList.stream().sorted(String::compareToIgnoreCase).forEach((s) -> {int line = wordsList.indexOf(s);
            //    System.out.println("word = " + s + ", is found on line " + line);});
            wordsList.stream().sorted(String::compareToIgnoreCase).forEach((s) -> {int line = wordsList.indexOf(s);
            try {
                out.write("word = " + s + ", is found on line " + line + "\n");
            } catch (IOException eWriting) {
                System.out.println("A problem happened when writing the file: " + eWriting);
            }});

            try {
                out.close();
            } catch (IOException eClosing) {
                System.out.println("A problem happened when closing the file: " + eClosing);
            }


        } catch (IOException e) {
            System.out.println("A problem happened when reading the file: " + e);
        }
    }

    public static void main(String[] args) {
        //Exercise #02
        System.out.println("Exercise #02");

        // Construct InputStream and OutputStream instances
        try{
            Path currentRelativePath = Paths.get("");
            String s = currentRelativePath.toAbsolutePath().toString();
            System.out.println("Current directory is " + s);

            Path fileToTest = Paths.get("src", "ch09", "test_ex02.txt");
            //InputStream in = Files.newInputStream(fileToTest);

            Path fileResult = Paths.get("src", "ch09", "test_ex02_result.toc");
            OutputStream out = Files.newOutputStream(fileResult);

            // Call setAlphaFile
            setAlphaFile(fileToTest, out);

            System.out.println("Alphabetization is done");

        } catch (IOException e) {
            System.out.println("An I/O error occurs during opening the file: " + e);
        }
    }
}
