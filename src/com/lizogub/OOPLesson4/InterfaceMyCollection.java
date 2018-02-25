package com.lizogub.OOPLesson4;

interface InterfaceMyCollection {
    boolean add(int number); // Добавить элемент в конец коллекции
    boolean addByIndex(int number, int  index); // Добавить элемент по индексу
    void delete(int index); // Удалить элемент по индексу
    void clear(); // Очистить коллекцию
    int length(); // Получить размер коллекции (без хвоста)
    boolean ifContains(int number); // Проверить содержится ли элемент в коллекции
    MyCollection getCollection(); // Вернуть копию массива в коллекции (хвост обрезать)
    int get(int index); // Получить элемент коллекции по индексу
    int find(int number); // Получить индекс первого вхождения элемента
    int findLast(int number); // Получить индекс последнего вхождения элемента
    boolean equals(MyCollection obj); // Сравнить с другим обьектом этого же класса
    String toString(); // Возвращает элементы в виде строки
}
