package ch08;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise03 {
    public static void main(String[] args) {
        //Exercise #03
        System.out.println("Exercise #03");

        int[] values = {1,4,9,16};

        // Stream.of(values) return a sequential ordered stream
        Stream valueStreams = Stream.of(values);

        // Returns a Stream consisting of the elements of this Stream, each boxed to an Integer
        Stream<Integer> intValueStreams = IntStream.of(values).boxed();
    }
}
