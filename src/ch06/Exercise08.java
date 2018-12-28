package ch06;

public class Exercise08 {
    public static void main(String[] args) {
        //Exercise #08
        System.out.println("Exercise #08");

        PairEx08<Integer> pairVal = new PairEx08<>(3, 4);

        System.out.println("Val1 = "+pairVal.getFirstElement());
        System.out.println("Val2 = "+pairVal.getSecondElement());

        System.out.println("Max = "+pairVal.max());
        System.out.println("Min = "+pairVal.min());
    }
}

class PairEx08<E extends Comparable<E>> {
    private E ele1;
    private E ele2;

    public PairEx08(E ele1, E ele2){
        this.ele1 = ele1;
        this.ele2 = ele2;
    }

    public E getFirstElement(){
        return this.ele1;
    }

    public E getSecondElement(){
        return this.ele2;
    }

    public E max(){
        return (this.ele1.compareTo(this.ele2) > 0 ? this.ele1 : this.ele2);
    }

    public E min(){
        return (this.ele1.compareTo(this.ele2) < 0 ? this.ele1 : this.ele2);
    }
}