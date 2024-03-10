package org.example;

import java.util.Random;
import java.util.Scanner;

public class MixingStrings {

    public static String doMixing(String string1 , String string2){

        String chars = string1 + string2;

        int length = string1.length() + string2.length();

        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i=0; i<length;i++){
            int index = random.nextInt(chars.length());
            char randomChar = chars.charAt(index);
            randomString.append(randomChar);

        }
    return randomString.toString();

    }






    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the first string:");
        String string1 = keyboard.next();
        System.out.print("enter the second string:");
        String string2 = keyboard.next();

        System.out.println(doMixing(string1,string2));

    }
}
