package org.example;

import java.util.Scanner;

public class MixingStrings2 {

    public static String doMixingString(String a, String b) {
      /*  int length = a.length() + b.length();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i < a.length() && i < b.length()) {
                stringBuilder.append(a.charAt(i)).append(b.charAt(i));
            } else {
                if (i < b.length()) {
                    stringBuilder.append(b.charAt(i));
                } else if (i < a.length()) {
                    stringBuilder.append(a.charAt(i));
                }
            }
        }

        return stringBuilder.toString();*/
        int aLen = a.length();
        int bLen = b.length();
        int max = Math.max(aLen, bLen);
        String word = "";


        for (int i = 0; i < max; i++) {
            if (i <= aLen - 1) {
                word += a.substring(i, i + 1);
            }
            if (i <= bLen - 1) {
                word += a.substring(i, i + 1);
            }


        }
        return word;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the first string:");
        String string1 = keyboard.next();
        System.out.print("enter the second string:");
        String string2 = keyboard.next();

        System.out.println(doMixingString(string1, string2));
    }
}
