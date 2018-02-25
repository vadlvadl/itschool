package com.lizogub.OOPLesson4;

public class MyCollection implements InterfaceMyCollection {
    private Integer[] collection = new Integer[1];
    private int size = 0;

    @Override
    public boolean add(int number) {
        if(size > collection.length - 1){
            increaseCollection();
        }
        collection[size] = number;
        size++;
        return true;
    }

    @Override
    public boolean addByIndex(int number, int index) {
        if ((index < 0) || (index > collection.length)) return false;

        if((size > collection.length - 1)){
            increaseCollection();
        }

        if(index == size){
            collection[index] = number;
        } else {
            Integer[] a = collection.clone();

            for (int i = 0; i <= size; i++) {
                if (i == index) {
                    collection[i] = number;
                } else if (i > index) {
                    collection[i] = a[i - 1];
                }
            }
        }
        size++;

        return true;
    }

    private boolean addByOne(int number){
        if(size > collection.length - 1){
            increaseCollection(1);
        }
        collection[size] = number;
        size++;
        return true;
    }

    @Override
    public void delete(int index) {
        if(index == size){
            collection[index] = null;
            size--;
            return;
        }

        int i = 0;
        for (; i < size; i++){
            if(i >= index){
                collection[i] = collection[i+1];
            }
            i++;
        }
        collection[size] = null;
        size--;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++){
            collection[i] = null;
        }
        size = 0;
    }

    @Override
    public int length() {
        return size;
    }

    public int lengthMemory(){
        return collection.length;
    }

    @Override
    public boolean ifContains(int number) {
        for (Integer x : collection){
            if(x == number){
                return true;
            }
        }
        return false;
    }

    @Override
    public MyCollection getCollection() {
        MyCollection result = new MyCollection();

        for(int i = 0; i < size; i++){
            result.addByOne(collection[i]);
        }
        return result;
    }

    @Override
    public int get(int index) {
        return collection[index];
    }

    @Override
    public int find(int number) {
        for(int i = 0; i < size; i++){
            if(collection[i] == number){
                return i;
            }
        }
        return 0;
    }

    @Override
    public int findLast(int number) {
        for(int i = size - 1; i >= 0; i--){
            if(collection[i] == number){
                return i;
            }
        }
        return 0;
    }

    @Override
    public boolean equals(MyCollection obj) {
        if(size != obj.length()) return false;

        for(int i = 0; i < size; i++){
            if(collection[i] != obj.get(i)) return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();

        result.append("\nLength: " + length() + "\nSize: " + lengthMemory() + "\n");
        result.append("{");
        for(int i = 0; i < length(); i++){
            if(i > 0) result.append(",");
            result.append(collection[i]);
        }
        result.append("}");

        return result.toString();
    }

    private void increaseCollection(){
        Integer[] a = new Integer[collection.length + 5];
        for (int i = 0; i < length(); i++){
            a[i] = collection[i];
        }
        collection = a;
    }

    private void increaseCollection(int count){
        Integer[] a = new Integer[collection.length + count];
        for (int i = 0; i < length(); i++){
            a[i] = collection[i];
        }
        collection = a;
    }
}
