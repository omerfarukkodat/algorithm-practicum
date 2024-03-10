package org.example;

import java.util.Scanner;

public class ReverseTriangleStarPattern {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("please enter number of lines:");
        int lines = keyboard.nextInt();

        for (int i = 0; i < lines; i++) {

            for (int space = 0; space < i; space++) {
                System.out.print(" ");
            }

            for (int j = lines; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();


        }


    }
}
