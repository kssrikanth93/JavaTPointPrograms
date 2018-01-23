package com.srikanth;
import java.util.Scanner;

/**
 * Created by Srikanth on 1/23/2018.
 */
public class InsertionSortProgram {
    static void InsertionSort(){

        int i,j,n;

        System.out.println("Enter the length of the Array: ");
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int a[] = new int[n];

        Scanner scan1 = new Scanner(System.in);
        for (i =0; i<n; i++ ){
            System.out.println("Enter a["+i+"} value: ");
            a[i] = scan1.nextInt();
        }
        System.out.println("After applying Insertion sort technique:");
        for (j=1; j<n; j++){
            int key = a[j];
             i = j-1;
            while((i>-1)&&(a[i]>key)){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
        for (i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
