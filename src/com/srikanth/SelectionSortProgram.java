package com.srikanth;

import java.util.Scanner;

/**
 * Created by Srikanth on 1/22/2018.
 */
public class SelectionSortProgram {
    static void SelectionSort(){
        int i,j,index;

        System.out.println("Enter the length of the Array for Selection Sort:");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a[] = new int[n];
        Scanner scan1 = new Scanner(System.in);
        for (i=0; i<n; i++){
            System.out.println("Enter a["+i+"} value: ");
            a[i] = scan1.nextInt();
        }
        System.out.println("Entered numbers before applying Selection Sort Technique:");
        for (i=0; i<n; i++){
            System.out.println("a["+i+"}: "+a[i]);
        }

        for(i=0; i<(n-1); i++){
            index = i;
            for (j=i+1 ; j<n; j++){
                if (a[j] < a[index]){
                    index = j;
                }
            }
            int SmallNumber = a[index];
            a[index] = a[i];
            a[i] = SmallNumber;
        }
        System.out.println("After applying Selection Sort Technique:");
        for (i=0; i<n; i++){
            System.out.println(a[i]+" ");
        }
    }
}
