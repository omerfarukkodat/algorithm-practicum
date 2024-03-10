package org.example;

import java.util.Scanner;

public class InvertedRightAngleStarPattern {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("please enter number of lines:");
        int lines = keyboard.nextInt();

       /* for (int i = 0; i < lines; i++) {
            for (int j = lines; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
              }*/

        for (int i = lines; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }

}
