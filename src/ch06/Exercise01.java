package ch06;

import java.util.ArrayList;

public class Exercise01 {
    public static void main(String[] args) {
        //Exercise #01
        System.out.println("Exercise #01");

        Stack<Integer> arrayVal = new Stack<>();
        arrayVal.push(3);
        arrayVal.push(5);
        arrayVal.push(7);

        System.out.println("Check if the Array is empty = "+arrayVal.isEmpty());
        System.out.println("Get the last value written in the array = "+arrayVal.pop(2));

    }
}

class Stack<E> {
    private ArrayList<E> elements = new ArrayList<>();

    public void push(E element){
        elements.add(element);
    }

    public E pop(int index){
        return elements.get(index);
    }

    public boolean isEmpty(){
        return elements.isEmpty();
    }
}
