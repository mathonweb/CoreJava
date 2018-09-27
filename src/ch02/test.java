import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public interface lastNum2{
        default int cstReturn(){
            return 1;
        }

    }

    // Supertype
    public interface IntSequence {
        boolean hasNext();
        int next();
        public static IntSequence actual(int num) {
            return new test().new DigitSequence(num);
        }
        default int cstReturn(){
            return 2;
        }
    }

    interface compareLength {
        int compareLength(String first, String second);

    }

    public interface IntConsumer {
        void accept(int value);
    }

    // Subtype
    public class DigitSequence implements IntSequence, lastNum2 {
        private int i;

        public DigitSequence(int num){
            i = num;
        }

        public boolean hasNext() {
            return true;
        }
        public int next() {
            i++;
            return i;
        }
        public int last() {
            i--;
            return i;
        }

        public int cstReturn(){
            return lastNum2.super.cstReturn();
        }
    }

    public static double average(IntSequence val, int n){
        int sum = 0;

        for(int i = 0; i < n; i++) {
            if (val.hasNext()) {
                sum = sum + val.next();
                System.out.println(sum);
            }
        }
        return (sum / n);
    }

    public static void repeat(int n, IntConsumer action) {
        for (int i = 0; i < n; i++) action.accept(i);
    }

    public static void main(String[] args) {
        //Test
        System.out.println("Test");
        //DigitSequence num = new test().new DigitSequence(0);
        //DigitSequence num = (DigitSequence)IntSequence.actual(0);
        DigitSequence num = new test().new DigitSequence(1);
        //lastNum digits = (lastNum) num;
        System.out.println(average(num,5));
        //System.out.println(num.last());
        System.out.println(num.cstReturn());
        String[] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends);
        System.out.println(friends[0] + " " + friends[1] + " " + friends[2]);
        compareLength diffLength = (String first, String second) -> {
            return (first.length() - second.length());
            };
        System.out.print("Length diff between allo and toi: ");
        System.out.println(diffLength.compareLength("allo", "toi"));

        ArrayList list = new ArrayList<>();
        list.add(0,"allo");
        list.add(1, "mon");
        list.add(2, "coco");
        list.forEach(System.out::println);

        repeat(10,i -> System.out.println("Countdown:" + (9-i)));
    }
}
