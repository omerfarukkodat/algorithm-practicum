package org.example;

import java.util.Scanner;

public class Computing2powN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("x^n calculate");
        System.out.print("enter for x enter a number: ");
        int x = keyboard.nextInt();
        System.out.print("enter for n enter a number: ");
        int n = keyboard.nextInt();
        System.out.println(x + "^" + n + " is : " + xMethod(x, n));


    }

    public static int xMethod(int x, int n) {

        if (n == 1) {

            return x;
        } else {

            return x * xMethod(x, n - 1);
        }


    }


}
