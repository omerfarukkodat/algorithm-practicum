package org.example;

import java.util.Arrays;

public class RecursiveSelectionSort {

    public static int[] sort(int[] list){

        return sort(list , 0 , list.length-1);
    }

    public static int[] sort(int[] list , int low , int high){

        if (low < high){
            int indexOfMin = low;
            int min = list[low];

            for (int i= low + 1; i<= high;i++){

                if (list[i] < min){
                    indexOfMin = i;
                    min = list[i];
                }
            }
            list[indexOfMin] = list[low];
            list[low] = min;

            sort(list,low+1,high);

        }
        return list;

    }

    public static void main(String[] args) {
        int[] list = {9,12,3,5,7,2};
        System.out.println(Arrays.toString(sort(list)));
    }



}
