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

    // 4. Prime number
    public static boolean isPrime(int number){

        if (number <=1){
            return false; //coz we'll not accept neg numbers
        }

        if (number == 2){
            return true; 
        }

        if (number % 2 == 0){
            return false;
        }

        for (int i = 3; i <=Math.sqrt(number); i += 2){
            if (number % i == 0){
                return false;
            }
        }

        return true;

    }
    // 5. Sum of Digits

    public static int sumOfDigits(int number){
        number = Math.abs(number);
        int sum = 0;

        while(number > 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    // 6. ReverseNumber
    public static int reverseNumber(int number){
        int reversed =0;
        int temp = Math.abs(number); 

        while(number > 0){
            int digits = temp %10;
            reversed = reversed * 10 + digits;
            temp /= 10;
        }

        return reversed;
    }
    // check also palindrome
    public static boolean isPalindromeNumber(int number){
        return number == reverseNumber(number);
    }
}
