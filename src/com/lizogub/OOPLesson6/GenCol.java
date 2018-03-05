package com.lizogub.OOPLesson6;

import javafx.beans.binding.ObjectExpression;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class GenCol<T> implements Iterable<T>{

    private final int INIT_SIZE = 5;
    private final int CUT_RATE = 4;

    private Object[] collection = new Object[INIT_SIZE];
    private int size = 0;

    public void add(T item){
        if(size == collection.length - 1){
            resize(collection.length * 2);
        }
        this.collection[this.size++] = item;
    }

    public T get (int index){
        return (T) this.collection[index];
    }

    public void remove(int  index){
        for(int i = index; i < this.size; i++){
            this.collection[i] = this.collection[i + 1];
        }
        this.collection[this.size] = null;
        size--;

        if(this.collection.length > INIT_SIZE && this.size < this.collection.length / CUT_RATE){
            resize(this.collection.length / 2);
        }
    }

    public int lentgh(){
        int c = 0;
        for(Object x : this.collection){
            if(x == null) return c;
            c++;
        }
        return c;
    }

    public void clear(){
        this.collection = new Object[INIT_SIZE];
        size = 0;
    }

    private void resize(int newLength){
        Object[] newCollection = new Object[newLength];
        System.arraycopy(this.collection,0,newCollection,0,this.size);
        this.collection = newCollection;
    }
    @Override
    public Iterator<T> iterator() {
        Iterator<T> it = new Iterator<T>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < size && collection[currentIndex] != null;
            }

            @Override
            public T next() {
                return (T) collection[currentIndex++];
            }
        };
        return it;
    }

    @Override
    public void forEach(Consumer<? super T> action) {

    }

    @Override
    public Spliterator<T> spliterator() {
        return null;
    }
}
