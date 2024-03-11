package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

    public class TwoSum {

public static int[] twoSum(int[] array , int target){
    ArrayList<Integer> arrayList = new ArrayList<>();

    for (int i = 0; i<array.length;i++){

        for (int j = i+1; j<array.length;j++){

            if (array[i] + array[j] == target && arrayList.isEmpty()){
                  arrayList.add(array[i]);
                  arrayList.add(array[j]);
            }

        }

    }
    return arrayList.stream().mapToInt(i ->i).toArray();
}




    public static int[] getTwoSum(int[] array , int target){
        Map<Integer,Integer> visitedNumbers = new HashMap<>();
    for (int i=0; i<array.length;i++){
        int delta = target - array[i];
        if (visitedNumbers.containsKey(delta)){
            return new int[] {i , visitedNumbers.get(delta)};
        }
        visitedNumbers.put(array[i],i);


    }





       return new int[] {-1 ,-1};
                }







    public static void main(String[] args) {

    int[] array = {1,2,3,4,5,6,7,8,9};
    int target = 12;

        System.out.println(Arrays.toString(twoSum(array, target)));


    }
}
