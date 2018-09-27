package ch02;

import java.util.ArrayList;

public class Queue {
    private static class Node {
        String element;
    }

    public void add(String element){
        Node newElement = new Node();
        newElement.element = element;
        queueList.add(queueList.size(), newElement);
    }

    public void remove(){
        queueList.remove(0);
    }

    public void print(){
        for(int i = 0; i < queueList.size(); i++ ){
            System.out.printf("%s",queueList.get(i).element);
            System.out.println();
        }
    }

    private ArrayList<Node> queueList = new ArrayList<>();
}
