package org.example;

import java.util.Scanner;

public class TriangleStarPattern {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("please enter number of lines:");
        int lines = keyboard.nextInt();

        for (int i = 1; i <= lines; i++) {
            for (int space = lines; space > i; space--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }

    }


}
