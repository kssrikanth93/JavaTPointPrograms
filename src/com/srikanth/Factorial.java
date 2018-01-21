package com.srikanth;

/**
 * Created by Srikanth on 1/20/2018.
 */
public class Factorial {
    public static int Factorial(int n){
        if (n == 0){
            return 1;
        }else
            return (n * Factorial(n-1));
    }
}
