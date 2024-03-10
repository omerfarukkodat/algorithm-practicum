package org.example;

public class KthSmallestElement {

    /**
     * You are given an array, write a function that accepts 2 parameters one is k and other is the array itself.
     * Function should return the kth smallest element out of all the elements in the given array.
     * <p>
     * findKthSmallest(3, [1, 3, 2, 3, 4, 5]) = 3
     * findKthSmallest(2, [0, 3, 1, 2]) = 1
     * findKthSmallest(1, [1, 2, 2, 10, 40, 10]) = 1
     * findKthSmallest(4, [1, 2, 3, 4, 5, 6]) = 4
     */

    //Another way to solve this problem easy and clean.
   /*


    public static int findKthSmallest(int k , int[] array){

        Arrays.sort(array);
        return array[k-1];    //return   kth element is equals to k-1 because of array's index starts with 0.


    }*/




//Selection sort with recursion
    //recursion helper method
    public static int[] sortArray(int[] array){

        return sortArray( array , 0 , array.length-1);
    }
    //main recursion method
    public static int[] sortArray( int[] array , int low , int high ){

        if (low<high){
            int indexOfMin = low;
            int min = array[indexOfMin];

            for (int i=low+1;i<=high;i++){

                if (array[i]<min){
                    indexOfMin = i;
                    min = array[i];
                }

            }
            array[indexOfMin] = array[low];
            array[low] = min;

            sortArray( array , low+1,high);

        }
        return array ;
    }

//find the kth smallest element method.
    public static int findKthSmallest(int k , int[] array){

        int[] sortedArray = sortArray(array);

        if (k <= sortedArray.length){
            return sortedArray[k-1];
        }
        else {
            return -1;
        }


    }


    public static void main(String[] args) {

        int[] array = {3,9,1,7,5,2,4};
        int k = 2;

        System.out.println(findKthSmallest(k,array));

    }



}
