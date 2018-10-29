package ch03;
import java.util.Random;

public class Exercise15 {
    public static void main(String[] args) {
        //Exercise #15
        System.out.println("Exercise #15");

        // Create the Random object
        RandomSequence seq = new RandomSequence(0,10);

        // Call next random number
        int randomNumber = seq.next();

        // Print the random number
        System.out.println("Random number between 0 and 10= " + randomNumber);
    }

    // Create the nested class RandomSequence
    private static class RandomSequence {
        int low;
        int high;
        Random generator = new Random();

        public RandomSequence(int low, int high){
            this.low = low;
            this.high = high;
        }

        public int next() { return low + generator.nextInt(high - low +1);}
    }
}
