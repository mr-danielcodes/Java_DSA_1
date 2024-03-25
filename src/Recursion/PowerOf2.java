package Recursion;

import java.util.Scanner;

public class PowerOf2 {
    public static int fibonacciWithLoop(int n){
       int first = 0;
       int second = 1;
       for(int i=1;i<=10;i++){
           System.out.println(first);
           int next = first+second;
           first = second;
           second = next;
       }
       return first;
    }
    //fibonacci series
    public static int fibonacci(int n) {
        if (n <2) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static int printCounting(int n){
        if(n == 0)
            return 1;
        printCounting(n-1);
        System.out.println();
        return 0;
    }

    public static int power(int n){
        if(n==0) {
            return 1;
        }
        return 2*power(n-1);
    }
    public static void main(String[] args) {
        System.out.println("Enter the Power........");
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //power 2^5
        //System.out.println(power(n));
        //print counting
        //System.out.println(printCounting(n));
        int n = 10; // You can change this to any non-negative integer
        System.out.println("Fibonacci of " + n + ": " + fibonacciWithLoop(n));
    }
}
