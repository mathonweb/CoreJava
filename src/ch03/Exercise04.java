package ch03;

import java.util.Arrays;

public class Exercise04 {

    public interface IntSequence {
        boolean hasNext();
        int next();
        static IntSequence seqof(int[] n) {
            return new Exercise04().new Sequence(n) {
                public int[] getList() {return argv;}
            };
        }
    }

    public class Sequence implements IntSequence {
        int number;
        int index;
        int[] argv;

        public Sequence(int[] argv){
            this.number = argv.length;
            this.index = 0;
            this.argv = argv;
        }

        public boolean hasNext(){
            return number != 0;
        }

        public int next(){
            number--;
            int val = this.argv[index];
            index++;
            return val;
        }

        public int[] getList(){
            return this.argv;
        }


    }

    public static void main(String[] args) {
        //Exercise #4
        System.out.println("Exercise #4");
        IntSequence SeqNum = IntSequence.seqof(new int[]{10,34,45});
        System.out.println("List = ");
        for(int i = 0; SeqNum.hasNext(); i++) {
            System.out.print(SeqNum.next()+ " ");
        }
    }
}
