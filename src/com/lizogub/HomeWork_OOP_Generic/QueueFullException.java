package com.lizogub.HomeWork_OOP_Generic;

public class QueueFullException extends Exception {
    int size;

    QueueFullException(int s) {size = s;}

    @Override
    public String toString() {
        return "\n Очередь заполнена. Максимальный размер очереди: " + size;
    }
}
