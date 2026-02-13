package com.serge.oop.utils;
public class MathUtils {
    // 1. factorial program with simple loop
    public static long factorial(int number){   
        // I like to start with simple validation
        if (number < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }

        long result = 1;

        for (int i = 1; i <= number; i++){
            result *= i; 
        }

        return result;

     }

    public static long recursive(int number){

        if(number < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }

        if (number <= 1){
            return 1;
        }

        return number * recursive(number -1);
    }
}
