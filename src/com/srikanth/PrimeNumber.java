package com.srikanth;

/**
 * Created by Srikanth on 1/17/2018.
 */
public class PrimeNumber {

    public static void PrimeNumber(int n) {
        int m = 0, flag = 0;
        System.out.println("Entered prime Number: " + n);
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not a prime number");
        } else {
            for (int i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not a prime number");
                    flag = 1;
                    break;
                }
            }
        }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }
    }

