package com.lizogub.OOPLesson5;

interface MyCollectionGenInterface<T> {
    void add(T o); // Добавить элемент в конец коллекции
    void addByIndex(T o, int  index); // Добавить элемент по индексу
    void delete(int index); // Удалить элемент по индексу
    void clear(); // Очистить коллекцию
    int length(); // Получить размер коллекции (без хвоста)
    boolean ifContains(T o); // Проверить содержится ли элемент в коллекции
    MyCollectionGeneric<T> getCollection(); // Вернуть копию массива в коллекции (хвост обрезать)
    T get(int index); // Получить элемент коллекции по индексу
    int find(T o); // Получить индекс первого вхождения элемента
    int findLast(int number); // Получить индекс последнего вхождения элемента
    boolean equals(MyCollectionGeneric<T> obj); // Сравнить с другим обьектом этого же класса
    String toString(); // Возвращает элементы в виде строки
}