package org.example;

import java.util.Scanner;

public class FindBobTest {

    public static boolean findBob(String s) {

        int i = 0;
        int j = i + 2;
        int length = s.length() - 1;

        while (j <= length) {

            if (s.charAt(i) == s.charAt(j)) {
                return true;
            } else
                i++;
                j++;
        }
        return false;

    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the string:");
        String s = keyboard.next();
        System.out.println(findBob(s));
    }


}
