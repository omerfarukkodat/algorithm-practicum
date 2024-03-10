package org.example;

public class UnluckyNumber {

    public static int unluckyNumbers(int a, int b, int c) {
/*
        if (a == 20) {
            return 0;
        }
        else if (b == 20) {
            return a;
        }
        else if (c == 20) {
            return a + b;
        }
        else {
            return a + b + c;
        }*/
        return (a == 20) ? 0 : (b == 20) ? a : (c == 20) ? (a + b) : (a + b + c);

    }

    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        int c = 20;

        System.out.println(unluckyNumbers(a, b, c));


    }
}
