package com.srikanth;

import java.util.Scanner;

/**
 * Created by Srikanth on 1/21/2018.
 */
public class BubbleSortProgram  {
    public static void BubbleSort() {

        int i,j,temp;
        System.out.println("Enter the length for Bubble Sort: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[]=new int[n];
        Scanner scan1 = new Scanner(System.in);
        for ( i=0; i<n; i++){
            System.out.println("Enter a["+i+"] value: ");
            a[i] = scan1.nextInt();
        }
        System.out.println("Entered numbers before applying Bubble Sort technique: ");
        for (i=0; i<n; i++) {
            System.out.println(a[i]+"");
        }
        for (i=0; i<n; i++){
            for (j=1; j<(n-i); j++){
                if (a[j-1]>a[j]){
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After applying Bubble Sort technique: ");
        for (i=0; i<n; i++) {
            System.out.println(a[i]+"");
        }
    }
}
