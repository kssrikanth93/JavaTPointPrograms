package com.srikanth;

/**
 * Created by Srikanth on 1/17/2018.
 */
public class Fibonacci {

    public static void Fibonacci(int fn) {
        if ( fn > 2) {
            System.out.println("Fibonacci Series:");
            int s1 = 0, s2 = 1;
            System.out.println(s1 + "\n" + s2);
            for (int i = 2; i < fn; i++) {
                int s3 = s2 + s1;
                System.out.println(s3);
                s1 = s2;
                s2 = s3;
            }
        } else {
            System.out.println("Invalid Fibonacci number, minimum number for" +
                    "fibonacci series is 3");
        }
    }
}
