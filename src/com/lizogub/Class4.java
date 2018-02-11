package com.lizogub;

import java.util.Arrays;
import java.util.Scanner;

public class Class4 {
    public static void task1(){
        for (int i = -10; i <= 25; i++){
            System.out.println(i);
        }

        int c = -10;
        do{
            System.out.println(c++);
        } while (c <= 25);

        c = -10;
        while(c <= 25){
            System.out.println(c++);
        }
    }

    public static void task2(){
        for(int i = 1; i <= 100; i++){
            if((i % 5) == 0) {
                System.out.println(i);
            }
        }
    }

    public static void task4(){
        int[] arr = {2,3,1,-1,-3,5,92,0};

        int minValue = arr[0];
        int maxValue = arr[0];
        int minIndex = 0, maxIndex = 0, sum = 0;

        for (int i = 0; i < arr.length; i++){
            if(arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }

            if(arr[i] > maxValue){
                maxValue = arr[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if((i == minIndex) || (i == maxIndex)) continue;
            sum += arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальный элемент: " + minValue);
        System.out.println("Максимальный элемент: " + maxValue);
        System.out.println("Cумма: " + sum);
    }

    public static void task5(){
        int[] arr = {1,2,3,4};

        int[] arr2 = arr.clone();
        for(int i=0; i < arr.length; i++){
            arr2[i] = arr[arr.length - i - 1];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
    }

    public static void task6(){
        int size = 0;

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        size = scn.nextInt();

        int max = size * 2 + 1;

        int[] arr = new int[max];
        for(int i = 0; i < max; i++){
            arr[i] = size;
            if((size > 0) && (i < max / 2)){
                size--;
            } else {
                size++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void task7(){
        int[] arr = {12,0,3,1,4,3,8};

        int maxCount = 0, count = 0, maxValue = arr[0];
        Integer value = 0;

        for(int i = 0; i < arr.length; i++){
            value = arr[i];
            count = 0;
            for (int j = i + 1; j < arr.length; j++){
                if(value.equals(arr[j])){
                    count++;
                }
            }
            if(count > maxCount){
                maxValue = value;
                maxCount = count;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Наиболее часто встречается число: " + maxValue);
    }

    public static void main(String[] args){
        task2();
    }
}
