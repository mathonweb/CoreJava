import java.util.ArrayList;
import java.util.Arrays;

public class Exercise10 {

    public static void main(String[] args) {
        //Exercise #10
        System.out.println("Exercise #10");
        int array[] = {1,2,3,4,5};
        System.out.println("Random element for an array = " + RandomNumbers.randomElement(array));

        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(10,11,12,13,14));
        System.out.println("Random element for an array list = " + RandomNumbers.randomElement(arrayList));

        System.out.println("We cannot modify a primitive type like int, however it is possible for an ArrayList because" +
                "it is a class");
    }
}
