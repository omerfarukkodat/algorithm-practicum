package org.example;

import java.util.Scanner;

public class SumDigits {

    public static int sumDigits(int k){

        int sum = 0;
        while (k>0) {
            sum += k % 10;
            k = k / 10;
        }
        return sum;
        //if(n==0)
        //return 0;
        // return k%10 + sumDigits(k/10);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the number:");
        int number = scanner.nextInt();
        System.out.println(sumDigits(number));

    }


}
