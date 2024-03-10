package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KLargestElements {

    public static void kLargest(Integer[] array , int k){
        // Sort the given array arr in reverse order
        // This method doesn't work with primitive data
        // types. So, instead of int, Integer type
        // array will be used

        Arrays.sort(array, Collections.reverseOrder());

        for (int i=0; i<k;i++){
            System.out.print(array[i] + " ");

        }


    }
    // This code is contributed by Niraj Dubey

    public static ArrayList<Integer> kLargest(int[] array , int k){
    // Convert using stream

        Integer[] obj_array = Arrays.stream(array).boxed().toArray(Integer[]::new);
        Arrays.sort(obj_array,Collections.reverseOrder());
        ArrayList <Integer> list = new ArrayList<>(k);
        for (int i =0; i<k;i++){
            list.add(obj_array[i]);

        }
        return list;
    }







    public static void main(String[] args) {
      Integer arr[] = new Integer[] { 1, 23, 12, 9, 30, 2, 50 };
        int k = 3;
       kLargest(arr, k);

      //   This code is contributed by Niraj Dubey
      //   What if primitive datatype array is passed and
       //  wanted to return in ArrayList<Integer>
        int[] prim_array = { 1, 23, 12, 9, 30, 2, 50 };
       // System.out.println(kLargest(prim_array, k));
    }
}
