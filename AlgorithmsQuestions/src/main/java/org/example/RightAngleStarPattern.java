package org.example;

import java.util.Scanner;

public class RightAngleStarPattern {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("please enter number of lines:");
        int lines = keyboard.nextInt();
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
