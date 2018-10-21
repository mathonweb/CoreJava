package ch03;
import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;

public class Exercise10 {

    public static ArrayList<File> findDirectories(File path) {

        ArrayList<File> FilesList = new ArrayList<>();

        // Verify the validity of the path
        if (path == null || !path.isDirectory()) {
            throw new IllegalArgumentException(
                    String.format("You must enter a valid directory path")
            );
        }

        FileFilter filter = (file) -> file.isDirectory();

        // Get all subdirectories at the top level
        File[] subDirectories = path.listFiles(filter);

        // Verify if there is at least one subdirectory
        if (subDirectories != null) {
            for (int i = 0; i < subDirectories.length; i++) {
                // Add all subdirectories in the FileList array
                FilesList.add(subDirectories[i]);
            }
        }

        return FilesList;
    }

    public static void main(String[] args) {
        //Exercise #10
        System.out.println("Exercise #10");

        // Specify the directory
        File directory = new File("C:/Users/Mathieu/Projets/Training/CoreJava/");

        // Call method to parse all subdirectories under the top level directory
        ArrayList dirList = findDirectories(directory);

        // Print all subdirectories found
        for(int i=0; i < dirList.size(); i++) {
            System.out.println(dirList.get(i));
        }
    }
}
