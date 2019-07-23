package ch08;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise03 {
    public static void main(String[] args) {
        //Exercise #03
        System.out.println("Exercise #03");

        int[] values = {1,4,9,16};

        // Stream.of(values) return a sequential ordered stream
        Stream<int[]> valueStreams = Stream.of(values);
        valueStreams.forEach(e -> System.out.println(e));

        // Returns a Stream consisting of the elements of this Stream, each boxed to an Integer
        // Use boxed to convert a primitive type stream to an object stream
        Stream<Integer> intValueStreams = IntStream.of(values).boxed();
        intValueStreams.peek(e -> System.out.println(e));
    }
}
