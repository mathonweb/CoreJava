package ch08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise02 {
    public static void main(String[] args) {
        //Exercise #02
        System.out.println("Exercise #02");

        List<String> words = new ArrayList<>(Arrays.asList("one","two","three","four","five","six","seven","eight",
                "nine","ten"));

        Long timeStart = System.currentTimeMillis();
        Long countLongWord = words.stream().count();
        Long timeStop = System.currentTimeMillis();
        Long diffTime = timeStop - timeStart;

        System.out.println("Count Long Word using stream = " + countLongWord);
        System.out.println("Diff time for Stream = "+ diffTime+"ms");

        timeStart = System.currentTimeMillis();
        countLongWord = words.parallelStream().count();
        timeStop = System.currentTimeMillis();
        diffTime = timeStop - timeStart;

        System.out.println("Count Long Word using parallelStream= " + countLongWord);
        System.out.println("Diff time for ParallelStream = "+ diffTime+"ms");
    }
}
