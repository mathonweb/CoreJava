package ch03;
import java.io.File;
import java.util.ArrayList;

public class Exercise11 {
    public static ArrayList<String> findFiles(File path, String ext) {

        ArrayList<String> FilesList = new ArrayList<>();

        // Validate the path
        if (path == null || !path.isDirectory()) {
            throw new IllegalArgumentException(
                    String.format("You must enter a valid directory path")
            );
        }

        // Validate the extension
        if (ext == null) {
            throw new IllegalArgumentException(
                    String.format("You must enter a valid extension")
            );
        }

        // Get all files in the path with the given extension
        // path.list has FilenameFilter as parameter.
        // FilenameFilter is a functional interface.  It has one method accept(File dir, String name)
        for(String s: path.list((dir, name) -> name.endsWith("." + ext))) {
            FilesList.add(s);
        }

        return FilesList;
    }

    public static void main(String[] args) {
        //Exercise #11
        System.out.println("Exercise #11");

        // Create the path where the files are located
        File path = new File("C:/Users/Mathieu/Projets/Training/CoreJava/");

        // Call the findFiles method
        ArrayList filesList = findFiles(path, "iml");

        // Print all files with the given extension
        for(int i=0; i < filesList.size(); i++) {
            System.out.println(filesList.get(i));
        }
    }
}
