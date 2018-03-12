package com.lizogub.InputOutputLesson1;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.lizogub.OOPLesson5.MyCollectionGeneric;
import com.lizogub.OOPLesson6.EmployeeHourlyPay;
import com.lizogub.OOPLesson6.EmployeeMonthlyPay;
import com.lizogub.OOPLesson6.Worker;
import com.lizogub.Person;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();

    public static void main(String[] args){
        Person person = new Person("Ivan","Ivanov",23,"blue");

        MyCollectionGeneric<Worker> employees = new MyCollectionGeneric<>();

        employees.add(new EmployeeHourlyPay("Susy"));
        employees.add(new EmployeeHourlyPay("Daniel"));
        employees.add(new EmployeeMonthlyPay("Ivan"));
        employees.add(new EmployeeMonthlyPay("Dmitriy"));

        String str = GSON.toJson(employees);

        System.out.println(str);
        saveToFile(employees);
    }

    public static void saveToFile(Object SavedObject){
        String path = "C://savedObjects//";

        File folder = new File(path);
        if(!folder.exists()){
            folder.mkdir();
        }

        String json = GSON.toJson(SavedObject);

        try(FileWriter savingObject = new FileWriter(path + SavedObject.getClass().getSuperclass() + SavedObject.getClass().getSimpleName() + ".json")){
            savingObject.write(json);
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}


