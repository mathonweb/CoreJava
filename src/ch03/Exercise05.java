package ch03;

public class Exercise05 {

    public interface IntSequence {
        static void constant(int num){
            System.out.print(num);
        }
    }

    public interface action{
        void setAction(int iterNb, int num);
    }

    public class Sequence implements IntSequence{
        int number;
        int index;
        int[] argv;

        public Sequence(int[] argv){
            this.number = argv.length;
            this.index = 0;
            this.argv = argv;
        }

        public Sequence(){
            this.number = 0;
            this.index = 0;
            this.argv = new int[]{};
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

        public void setNext(int n){
            this.argv[(this.argv.length+1)] = n;
        }

    }

    public static void main(String[] args) {
        //Exercise #5
        System.out.println("Exercise #5");

        action loop  = (iterNb,num) -> {
            for(int i=0; i < iterNb; i++) {
                IntSequence.constant(1);
            }
        };

        loop.setAction(10,1);
    }
}
