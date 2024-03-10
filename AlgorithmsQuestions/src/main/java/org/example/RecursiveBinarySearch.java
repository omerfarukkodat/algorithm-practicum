package org.example;

import java.util.Arrays;

public class RecursiveBinarySearch {

    public static int recursiveBinarySearch(int[] list , int key){
        int low = 0;
        int high = list.length-1;
        return recursiveBinarySearch(list,key,low,high);
    }


    public static int recursiveBinarySearch(int[] list , int key , int low , int high){

        if (low>high){
            return -1;
        }
        int mid = (low + high)/2;
        if (key<list[mid]){

            return recursiveBinarySearch(list,key,low,mid-1);
        } else if (key == list[mid]) {

            return mid;
        }
        else {

       return recursiveBinarySearch(list, key, mid+1, high);
        }




    }

    public static void main(String[] args) {
        int[] list = {9,12,3,5,7,2};
        Arrays.sort(list);
        System.out.println("the index of key value:"  +recursiveBinarySearch(list,2));

    }

}
