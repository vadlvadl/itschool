package com.lizogub;
/*
    Домашнее задание. Одномерные массивы в Java
*/

import javax.swing.*;
import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3 {

    public void task1(){
        int[] books = this.getIntArray(35,0,10000);
        int sum = 0;

        // Посчиаем кол-во книг во всех разделах
        for (int b: books){
            sum += b;
        }

        if((sum < 1000000) && (sum > 100000)){
            System.out.println("Общее кол-во книг: " + sum + "\nЭто шестизначное число");
        } else {
            System.out.println("Общее кол-во книг: " + sum + "\nЭто не шестизначное число");
        }

    }

    public void task2(){
        int[] points = this.getIntArray(10,0,5); // 10 оценок по 5-тибальной шкале
        int minPoints = 20; // Проходной бал
        int sum = 0;

        for (int p: points){
            sum += p;
        }
        if(sum >= minPoints){
            System.out.println("Сумма балов: " + sum + "\nСпортсмен прошел в следующий тур!!!");
        } else {
            System.out.println("Сумма балов: " + sum + "\nСпортсмен может ехать домой((((");
        }
    }

    public void task3(){
        int[] points = this.getIntArray(18,0,10); // 18 оценок по 10-тибальной шкале
        int[] sum = new int[3];
        int maxValue = 0, maxIndex = 0;

        for (int i = 0; i < points.length; i++){
            if(i < 7){
                sum[0] += points[i];
            } else if (i < 13) {
                sum[1] += points[i];
            } else {
                sum[2] += points[i];
            }
        }

        maxValue = sum[0];

        for(int i = 1; i < sum.length; i++){
            if(maxValue < sum[i]){
                maxValue = sum[i];
                maxIndex = i;
            }
        }

        switch (maxIndex){
            case 0: System.out.println("Лучший результат по обязаельной программе. Полученный бал: " + maxValue);
                    break;
            case 1: System.out.println("Лучший результат по короткой программе. Полученный бал: " + maxValue);
                break;
            case 2: System.out.println("Лучший результат по произвольной программе. Полученный бал: " + maxValue);
                break;
        }
        System.out.println(sum[0] + " + " + sum[1] + " + " + sum[2]);
    }

    public void task4(){
        int count = 1, max = 0;

        int[] array = {23,24,12,15,126,137,18,-23,-22,-21,3,4};

        for (int i = 0; i < array.length - 1; i++){
            if((array[i] > 0) && (array[i] == (array[i+1] - 1))){
                count++;
            } else {
                if(max < count){
                    max = count;
                }
                count = 1;
            }
        }

        System.out.println("Максимальное число последовательных элементов: " + max);
    }

    public void task5(){
        boolean inputActive = true;
        int size = 0;
        Scanner scn = new Scanner(System.in);

        while (inputActive) {
            System.out.println("Введите количество элементов массива (от 2 до 100):");
            size = scn.nextInt();
            if((size >= 2) && (size <= 100)) inputActive = false;
        }

        int[] data = this.getIntArray(size,0,100);

        for(int i = 0; i < data.length; i++){
            if(this.checkIfSimple(data[i])){
                System.out.println("[" + i + "] => " + data[i]);
            }
        }
    }

    public boolean checkIfSimple(int x){
        boolean isSimple = true;

        if(x < 2) isSimple = false;
        for (int i = 2; i < x; i++){
            if((x % i) == 0){
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public void task6(){
        int[] arr = this.getIntArray(10,5,60);

        int max = arr[0], min = arr[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                maxIndex = i;
            }
            if(min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        arr[maxIndex] = 0;
        arr[minIndex] = 0;
        System.out.println(Arrays.toString(arr));
    }

    public void task7(){
//        int[] arr = this.getIntArray(10,5,60);
        int[] arr = {12,4,2,3,2,4,3,23,12};

        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] == arr[i]){
                    arr[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void task8(){
        int n = 20; // Заменить нулями элементы больше 8
        int n1 = 5, n2 = 7;
        int[] arr = this.getIntArray(10,-15,60);

        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if((arr[i] < 0) || (arr[i] > n)) arr[i] = 0;
            if((i >= n1) && (i <= n2)) arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void task9(){
        int[] arr = this.getIntArray(20,-15,60);

        System.out.println(Arrays.toString(arr));
        for(int i = 0; i < arr.length; i++){
            if(((i % 2) == 1) && ((arr[i] % 2) == 0)){
                arr[i] = 0;
            }
            if(((arr[i] % 3) == 0) || ((arr[i] % 5) == 0)){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public int[] getIntArray(int size, int min, int max){
        int[] array = new int[size];
        // заполняем массив
        for (int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * (max - min + 1) + min); // в одном разделе может быть до 10000 книг
        }

        return array;
    }

    public void printIntArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("[" + i + "] => " + array[i]);
        }
    }

    public void run() {
//        System.out.println("Homework2 :: Task1");
//        this.task1();
//        this.task2();
//        this.task3();
//        this.task4();
//        this.task5();
//        this.task6();
//        this.task7();
//        this.task8();
        this.task9();
    }
}
