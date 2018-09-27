package ch02;

import java.io.FileReader;
import com.opencsv.CSVReader;

public class Exercise13 {
    public static void main(String args[]) throws Exception{
        CSVReader csvFile = new CSVReader(new FileReader("C:/Users/Mathieu/Projets/Training/Java/resources/test.csv"));
        //List<String[]> readFile = csvFile.readAll();
        System.out.println("Exercise #13");
        String[] readLine = csvFile.readNext();
        if(readLine != null){
            System.out.println(readLine[0]+readLine[1]);
        }
        //System.out.println(readFile.get(2).toString());
        csvFile.close();
    }
}
