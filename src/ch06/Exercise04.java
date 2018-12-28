package ch06;

import java.util.ArrayList;

public class Exercise04 {
    public static void main(String[] args) {
        //Exercise #04
        System.out.println("Exercise #04");

        TableEx04<String, Integer> elementTable = new TableEx04<>();

        // Add key / Value in the table
        elementTable.putValue("Mathieu", 37);
        elementTable.putValue("Jean", 40);
        elementTable.putValue("Martin", 45);

        // Retrieve the Jean's age
        Integer jeanAge = elementTable.getValue("Jean");
        System.out.println("The Jean's is "+ jeanAge);

        // Remove Martin from the list
        elementTable.removeKey("Martin");

        // Test removing if it is successful
        elementTable.getValue("Martin");

        // Retrieve the Mathieu's age
        Integer mathieuAge = elementTable.getValue("Mathieu");
        System.out.println("The Mathieu's is "+ mathieuAge);
    }
}

class TableEx04<K, V>{
    private ArrayList<EntryEx04> elementList = new ArrayList<>();

    public V getValue(K key) {
        for(int index = 0; index < elementList.size(); index++){
            if(elementList.get(index).getKey() == key){
                return (V) elementList.get(index).getValue();
            }
        }
        System.out.println("The key is not found");
        return null;
    }

    public boolean putValue(K key, V value){
        for(int index = 0; index < elementList.size(); index++){
            if(elementList.get(index).getKey() == key){
                elementList.get(index).setValue(value);
                return true;
            }
        }
        System.out.println("The key is not found");
        System.out.println("The key and value will be added");
        elementList.add(new EntryEx04(key, value));
        return true;
    }

    public boolean removeKey(K key){
        for(int index = 0; index < elementList.size(); index++) {
            if (elementList.get(index).getKey() == key) {
                elementList.remove(index);
                return true;
            }
        }
        System.out.println("The key is not found");
        return false;
    }

    static class EntryEx04<K, V> {
        private K key;
        private V value;

        public EntryEx04(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public void setKey(K key){
            this.key = key;
        }

        public void setValue(V value){
            this.value = value;
        }

        public K getKey(){
            return this.key;
        }

        public V getValue(){
            return this.value;
        }
    }
}


