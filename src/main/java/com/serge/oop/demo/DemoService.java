package com.serge.oop.demo;

import com.serge.oop.utils.MathUtils;
import com.serge.oop.utils.StringUtils;
import com.serge.oop.utils.ArrayUtils;
import com.serge.oop.services.LogicService;
import com.serge.oop.services.RealWorldService;


public class DemoService{
    public void run(){
        System.out.println("Factorial of 5: " + MathUtils.factorial(5));
        System.out.println("FactorialRecursive of 5: " + MathUtils.factorialRecursive(5));
        System.out.println("FactorialBig of 5: " + MathUtils.factorialBig(5));
        System.out.println("Prime number of 15: " + MathUtils.isPrime(15));
    }
}

