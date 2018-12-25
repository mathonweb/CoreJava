package ch06;

import java.util.Arrays;

public class Exercise02_b {
    public static void main(String[] args) {
        //Exercise #02b
        System.out.println("Exercise #02b");

        StackEx02b<Integer> arrayVal = new StackEx02b<>();
        arrayVal.push(3);
        arrayVal.push(5);
        arrayVal.push(7);

        System.out.println("Get the last value written in the array = "+arrayVal.pop());
        System.out.println("Get the last value written in the array = "+arrayVal.pop());
    }
}

class StackEx02b<E> {

    private Object[] arrayElement = (E[]) new Object[1];
    private int index = 0;

    public void push(E element){
        if(arrayElement.length == index){
            arrayElement = Arrays.copyOf(arrayElement, arrayElement.length+1);
        }
        arrayElement[index++] = element;
    }

    public Object pop(){
        return arrayElement[--index];
    }
}