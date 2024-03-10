package org.example;

import java.util.Scanner;

public class StringPalindrome {

    public static boolean checkPalindrome(String s){

        if (s.length()<=1){
            return true;
        }
        else if (s.charAt(0) != s.charAt(s.length()-1)) {
            return false;
        }
        else {
            return checkPalindrome(s.substring(1,s.length()-1));
        }


      /*  int j = s.length() - 1;
        int i = 0;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

    return true; */

    }

    public static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter the string:");
        String s = keyboard.next();
        System.out.println(checkPalindrome(s));
    }



}
