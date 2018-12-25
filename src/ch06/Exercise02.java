package ch06;

import java.util.Arrays;

public class Exercise02 {
    public static void main(String[] args) {
        //Exercise #02
        System.out.println("Exercise #02");

        StackEx02<Integer> arrayVal = new StackEx02<>();
        arrayVal.push(3);
        arrayVal.push(5);
        arrayVal.push(7);

        System.out.println("Get the last value written in the array = "+arrayVal.pop());
    }
}

class StackEx02<E> {

    private E[] arrayElement = (E[]) new Object[1];
    private int index = 0;

    public void push(E element){
        if(arrayElement.length == index){
            arrayElement = Arrays.copyOf(arrayElement, arrayElement.length+1);
        }
        arrayElement[index++] = element;
    }

    public E pop(){
        return arrayElement[--index];
    }

}
