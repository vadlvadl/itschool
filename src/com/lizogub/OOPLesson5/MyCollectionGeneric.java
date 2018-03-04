package com.lizogub.OOPLesson5;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

//public class MyCollectionGeneric<T> implements MyCollectionGenInterface{
public class MyCollectionGeneric<T>{
    private final static int CAPACITY_INCREMENT = 5;
    private T[] collection;
    private int size = 0;

    public MyCollectionGeneric(T[] collection){
        this.collection = collection;
        size = length();
    }


    public void add(T obj) {
        checkCapacity();
        collection[size++] = obj;
    }

//    @Override
    public void addByIndex(T o, int index) {
        checkCapacity();

        if(index < 0){
            throw new IndexOutOfBoundsException(index);
        } else if(index > size){
            throw new IndexOutOfBoundsException(index);
        }

        for(int i = 0; i < size; i++){
            if(i == index){
                collection[i] = o;
            } else if(i > index){
                collection[i+1] = collection[i];
            }
        }
        size++;
    }

//    @Override
    public void delete(int index) {
        for (int i = 0; i < size - 1; i++){
            if(i == index){
                collection[i] = collection[i+1];
            }
        }
        size--;
        collection[size] = null;
    }

//    @Override
    public void clear() {
        for (int i = 0; i < size; i++){
            collection[i] = null;
        }
        size = 0;
    }

//    @Override
    public int length() {
        int l = 0;
        for(T x : collection){
            if (x == null){
                return l;
            }
            l++;
        }
        return l;
    }

//    @Override
    public boolean ifContains(T obj) {
        for(T x : collection){
            if(x.equals(obj)){
                return true;
            }
        }
        return false;
    }

//    @Override
    public T[] getCollection() {
        return Arrays.copyOf(collection,size);
    }

//    @Override
    public T get(int index) {
        return collection[index];
    }

//    @Override
    public int find(T obj) {
        for (int i = 0; i < size; i++){
            if (collection[i].equals(obj))
                return i;
        }
        return -1;
    }

//    @Override
    public int findLast(T obj) {
        for (int i = size - 1; i >= 0; i--){
            if (collection[i].equals(obj))
                return i;
        }
        return -1;
    }

//    @Override
//    public boolean equals(T obj) {
//        return false;
//    }

    private void checkCapacity(){
        if(size >= (collection.length - 1)){
            int newSize = size + CAPACITY_INCREMENT;
            collection = Arrays.copyOf(collection,newSize);
        }
    }
}
