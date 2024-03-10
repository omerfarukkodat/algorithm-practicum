package org.example;

import java.util.Scanner;

public class CheckSpeedOnHighwayRains {
    /**
     * We have to make sure we drive at the right speed on and off highways.
     * When you are driving on highways you have to make sure you drive between 60 and 90 (inclusive).
     * Unless it's not raining, then the upper limit is 100 instead of 90.
     * Return true if you are driving at the right speed.
     * <p>
     * checkSpeed(50, false) → false
     * checkSpeed(100, false) → false
     * checkSpeed(100, true) → true
     * checkSpeed(95, true) → true
     * checkSpeed(59, true) → false
     * checkSpeed(59, false) → false
     * checkSpeed(90, false) → true
     * checkSpeed(90, true) → true
     * checkSpeed(60, false) → true
     * checkSpeed(50, true) → false
     * checkSpeed(70, false) → true
     * checkSpeed(95, false) → false
     * checkSpeed(105, true) → false
     */


    public static boolean checkSpeed(int speed , boolean isRaining){
      /*  if (isRaining){
            return speed >= 60 && speed <= 100;
        }
        else {
            return speed >= 60 && speed<=90;
        }*/
    return (isRaining ? (speed>=60 && speed<=100) : (speed>=60 && speed<=90));


    }


    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter int speed:");
        int speed = keyboard.nextInt();
        System.out.print("enter if is raining:");
        boolean isHighway = keyboard.nextBoolean();
        System.out.println(checkSpeed(speed,isHighway));


    }
}
