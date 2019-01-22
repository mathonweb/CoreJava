package ch08;

import java.util.stream.Stream;

public class Exercise04 {
    public static void main(String[] args) {
        //Exercise #04
        System.out.println("Exercise #04");

        final long seed = 1;
        final long a = 25214903917L;
        final int c = 11;
        final long m = new Double(Math.pow(2,48)).longValue();

        Stream<Long> randomNumber = Stream.iterate(seed, (x) -> (a*x+c) % m).limit(100);

        randomNumber.forEach(System.out::println);
    }
}
