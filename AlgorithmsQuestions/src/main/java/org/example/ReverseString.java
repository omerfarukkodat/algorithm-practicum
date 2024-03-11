package org.example;

import java.util.Scanner;

public class ReverseString {

  /*  public static String reverse(String string){
        String word = "";
        int length = string.length()-1;
        for (int i=length; i>=0; i--){
            word += string.charAt(i);
        }

        return word;
    }*/

    public static String reverse(String word){

        StringBuilder stringBuilder = new StringBuilder(word);
        stringBuilder.reverse();
        return stringBuilder.toString();


//        return new StringBuilder(word).reverse()
//                .toString();
    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = keyboard.nextLine();
        System.out.println(reverse(word));
    }
}
