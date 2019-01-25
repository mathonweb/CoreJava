package ch08;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise05 {
    public static void main(String[] args) {
        //Exercise #05
        System.out.println("Exercise #05");

        Stream<String> separateLetters = letters("Allo");
        separateLetters.forEach(System.out::println);
    }

    public static Stream<String> letters(String s){
        return IntStream.range(0, s.length()).boxed().map((i)->s.substring(i,i+1));
    }
}
