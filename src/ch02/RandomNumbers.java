import java.util.Random;
import java.util.ArrayList;

public class RandomNumbers {
    private static Random generator = new Random();
    public static int nextInt(int low, int high) {

        return low + generator.nextInt(high - low + 1);
    }

    public static int randomElement(int[] array){
        if(array == null || array.length == 0) {
            return 0;
        } else {
            return array[generator.nextInt(array.length)];
        }
    }

    public static int randomElement(ArrayList<Integer> array){
        if(array == null || array.size() == 0) {
            return 0;
        } else {
            return array.get(generator.nextInt(array.size()));
        }
    }
}