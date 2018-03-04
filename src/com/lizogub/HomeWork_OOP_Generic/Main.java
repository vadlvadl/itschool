package com.lizogub.HomeWork_OOP_Generic;

import javafx.beans.binding.DoubleExpression;

public class Main {
    public static void main(String[] args){
        String strArray[] = new String[4];
        Float floatArray[] = new Float[4];

        GenClass<String> sArr = new GenClass<String>(strArray);
        GenClass<Float> fArr = new GenClass<Float>(floatArray);

        try {
            sArr.put("line1");
            sArr.put("line2");
            sArr.put("line3");

            fArr.put(3.2f);
            fArr.put(1.3f);
            fArr.put(5.1f);

        } catch (QueueFullException e) {
            System.out.println(e);
        }

        try{
            for(int i = 0; i < 10; i++){
                System.out.println(sArr.get());
                System.out.println(fArr.get());
            }
        } catch (QueueEmptyException e){
            System.out.println(e);
        }
    }
}
