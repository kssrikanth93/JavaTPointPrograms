package com.srikanth;

import java.util.Scanner;

/**
 * Created by Srikanth on 1/18/2018.
 */
public class Palindrome {

    public static void Palindrome() {
        long s,temp,sum = 0;
        System.out.println("Enter the Palindrome Number: ");
        Scanner scan = new Scanner(System.in);
        long num = scan.nextLong();
        temp = num;

        while(num > 0){
            s = num%10;
            sum = (sum*10)+s;
            num = num/10;
        }
        if(temp == sum){
            System.out.println(temp+" is a Palindrome Number");
        }else{
            System.out.println(temp+" is not a Palindrome Number");
        }
    }
}
