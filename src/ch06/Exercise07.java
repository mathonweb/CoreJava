package ch06;

public class Exercise07 {
    public static void main(String[] args) {
        //Exercise #07
        System.out.println("Exercise #07");

        Pair<Integer> pairVal = new Pair<>(3, 4);

        System.out.println("Val1 = "+pairVal.getFirstElement());
        System.out.println("Val2 = "+pairVal.getSecondElement());
    }
}

class Pair<E> {
    private E ele1;
    private E ele2;

    public Pair(E ele1, E ele2){
        this.ele1 = ele1;
        this.ele2 = ele2;
    }

    public E getFirstElement(){
        return this.ele1;
    }

    public E getSecondElement(){
        return this.ele2;
    }
}
