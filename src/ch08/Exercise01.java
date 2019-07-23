package ch08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Exercise01 {
    public static void main(String[] args) {
        //Exercise #01
        System.out.println("Exercise #01");

        List<String> words = new ArrayList<>(Arrays.asList("one","two","three","four","five","six","seven","eight",
                "nine","ten"));

        Stream<String> firstFiveLongWord = words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .limit(5);

        firstFiveLongWord.forEach(System.out::println);

    }
}
