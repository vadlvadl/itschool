package com.lizogub.HomeWork_OOP_Generic;

interface genClassInterface<T> {
    void put(T ch) throws QueueFullException;
    T get() throws QueueEmptyException;
}
