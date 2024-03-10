package org.example;

import java.util.Scanner;

public class FibonacciCalculateIndex {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("for calculating fibonacci number please enter a index number: ");
        int index= keyboard.nextInt();
        System.out.println( index + " index  is : " + fibIndex(index));
    }

    private static int fibIndex(int index) {

        if (index == 0){
            return 0;
        } else if (index ==1) {
            return 1;
        }
        else {
            return fibIndex(index-2) + fibIndex(index-1);
        }


    }


}
