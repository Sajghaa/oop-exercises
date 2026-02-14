package com.serge.oop.utils;

import java.math.BigInteger;
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
    // 2. FactorialRecursive
    public static long factorialRecursive(int number){

        if(number < 0){
            throw new IllegalArgumentException("Number cannot be negative");
        }

        if (number <= 1){
            return 1;
        }

        return number * factorialRecursive(number -1);
    }
     // 3. By using BigInteger
    public static BigInteger factorialBig(int number){
       if (number < 0 ){
        throw new IllegalArgumentException("Number cannot be negative");
       }

       BigInteger result = BigInteger.ONE;

       for (int i =2; i <= number; i++){
        result = result.multiply(BigInteger.valueOf(i));
       }

       return result;
    }
}
