package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindOccurrence {
    /**
     * Write a program to find occurrences of each element in a given array
     *
     * Input : {8, 8, 4, 2, 1, 5, 4, 2, 3, 4, 3}
     *
     * <p>
     * 8 : 2
     * 4 : 3
     * 2 : 2
     * 1 : 1
     * 5 : 1
     * 3 : 2
     */

    public static void main(String[] args) {

      /*  int[] array = new int[]{1,1,2,2};
        int[] freq = new int[array.length];
        int visited = -1;

        for (int i = 0; i < array.length; i++) {
            int count = 1;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited)
                freq[i] = count;

        }
        for (int i= 0; i < freq.length ; i++){
            if (freq[i] != visited){
                System.out.println(" " + array[i] + " | " + freq[i]);
            }

           */

        int[] array = {1, 1, 2, 2};
    //using HashMap counting occurrence
        Map<Integer,Integer> occurrenceMap = new HashMap<>();

        for (int num: array){

            occurrenceMap.put(num , occurrenceMap.getOrDefault(num,0) + 1);
        }
        // Writing the solutions
        for (Map.Entry<Integer,Integer> entry : occurrenceMap.entrySet()){
            System.out.println(entry.getKey() + " | " + entry.getValue());

    }
}}


