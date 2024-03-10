package org.example;

import java.util.Scanner;

public class CheckSpeedOnHighWay {

    /**
     * We have to make sure we drive at the right speed on and off highways.
     * When you are not driving on highways you have to make sure you drive between speeds of 40 and 60.
     * If you are driving on the highway there is no upper bound.
     * Return true if you are driving at the right speed.
     * <p>
     * checkSpeed(30, false) → false
     * checkSpeed(50, false) → true
     * checkSpeed(70, true) → true
     * checkSpeed(30, true) → false
     * checkSpeed(50, true) → true
     * checkSpeed(60, false) → true
     * checkSpeed(61, false) → false
     * checkSpeed(40, false) → true
     * checkSpeed(39, false) → false
     * checkSpeed(40, true) → true
     * checkSpeed(39, true) → false
     */

    public static boolean checkSpeed(int speed , boolean isHighWay){
        if (isHighWay) {
            return speed >= 40;
        }
        else return speed>=40 && speed<=60;

    // return (40 <= speed) && (speed <= 60 || isHighway)
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter int speed:");
        int speed = keyboard.nextInt();
        System.out.print("enter if is in highway:");
        boolean isHighway = keyboard.nextBoolean();
        System.out.println(checkSpeed(speed,isHighway));


    }


}
