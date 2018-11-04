package ch03;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class Exercise12 {

    // Method to extract the subdirectories and files
    public static ArrayList<File> findFilesDir(File path) {

        ArrayList<File> FilesList = new ArrayList<>();

        // Validate the path
        if (path == null || !path.isDirectory()) {
            throw new IllegalArgumentException(
                    String.format("You must enter a valid directory path")
            );
        }

        FileFilter dirFilter = (file) -> file.isDirectory();
        FileFilter fileFilter = (file) -> file.isFile();

        // Get all subdirectories at the top level
        File[] subDirectories = path.listFiles(dirFilter);

        // Add all subdirectories in the FileList array
        if (subDirectories != null) {
            for (int i = 0; i < subDirectories.length; i++) {
                FilesList.add(subDirectories[i]);
            }
        }

        // Get all files at the top level
        File[] files = path.listFiles(fileFilter);

        // Add all files in the FileList array
        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                FilesList.add(files[i]);
            }
        }

        return FilesList;
    }

    // Method to sort the directories and files separately
    public static ArrayList<File> sortFiles(ArrayList<File> filesList) {

        // Lambda for comparison
        Comparator<File> comp = (par1, par2) -> {
            if (par1.isDirectory() && par2.isDirectory()) {
                return par1.getName().compareTo(par2.getName());
            } else if (par1.isFile() && par2.isFile()) {
                return par1.getName().compareTo(par2.getName());
            } else return 0;
        };

        Collections.sort(filesList, comp);

        return filesList;
    }

    public static void main(String[] args) {
        //Exercise #12
        System.out.println("Exercise #12");

        // Create the path where the files are located
        File path = new File("C:/Users/Mathieu/Projets/Training/CoreJava/");

        // Get all directories and files in the path
        ArrayList<File> dirFilesList = findFilesDir(path);

        // Sort by pathname
        ArrayList<File> filesListSorted = sortFiles(dirFilesList);

        // Print the result
        for(int i=0; i < filesListSorted.size(); i++) {
            System.out.println(filesListSorted.get(i));
        }
    }
}
