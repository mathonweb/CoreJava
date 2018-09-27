import java.util.ArrayList;
import ch02.Queue;

public class Exercise16 {
    public static void main(String[] args) {
        //Exercise #16
        System.out.println("Exercise #16");
        System.out.println("The nested class Node could be static or not, but in my example it is static and I need to construct a new object every time I add an item");

        Queue queueString = new Queue();
        queueString.add("Allo");
        queueString.add("mon");
        queueString.add("coco");
        queueString.remove();
        queueString.print();
    }
}
