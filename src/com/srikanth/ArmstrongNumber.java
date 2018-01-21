package com.srikanth;
import java.util.Scanner;

/**
 * Created by Srikanth on 1/21/2018.
 */
public class ArmstrongNumber {
    public static void Armstrong(){
        int a,temp,c=0;
        System.out.println("Enter the number to check, whether it is an Armstrong Number or not: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        temp = num;
        while(num > 0){
            a = num % 10;
            num = num / 10;
            c = c + (a*a*a);
        }
        if (temp == c){
            System.out.println(temp+" is a Armstrong Number ");
        }else{
            System.out.println(temp+" is not a Armstrong Number");
        }
    }
}
