package com.lizogub.HomeWork_OOP_Generic;

public class GenClass<T> implements genClassInterface<T> {

    private T q[];
    private int putloc, getloc;

    public GenClass(T[] aRef){
        q = aRef;
        putloc = getloc = 0;
    }

    @Override
    public void put(T obj) throws QueueFullException {
        if(putloc == q.length){
            throw new QueueFullException(q.length);
        }
        q[putloc++] = obj;
    }

    @Override
    public T get() throws QueueEmptyException {
        if(putloc == getloc){
            throw new QueueEmptyException();
        }
        return q[getloc++];
    }
}
