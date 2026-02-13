package com.yourname.oop.demo;

import com.yourname.oop.utils.MathUtils;
import com.yourname.oop.utils.StringUtils;
import com.yourname.oop.utils.ArrayUtils;
import com.yourname.oop.services.LogicService;
import com.yourname.oop.services.RealWorldService;

public class DemoService {
    public void run(){
        System.out.println("Factorial 5: " + MathUtils.factorial(5));
        System.out.println("Is 'level' palindrome? " + StringUtils.isPalindrome("level"));
    }
}

public class LogicService {
    
}
