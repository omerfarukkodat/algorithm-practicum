package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateArray {

    public static int[] findDuplicates(int[] array) {
        int length = array.length;
        ArrayList<Integer> duplicateList = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] == array[j] && !duplicateList.contains(array[i])) {
                    duplicateList.add(array[i]);
                }
            }

        }
        if (duplicateList.isEmpty()) {
            return null;
        } else
            return duplicateList.stream().mapToInt(i -> i).toArray();


    }


    public static void main(String[] args) {
        int[] array = {1 , 2 , 3 , 4 , 22 , 12 , 21 , 11 , 5 , 6 , 3 , 7 , 7 , 8 , 9 , 5};

        int[] duplicates = findDuplicates(array);

        // Bulunan yinelenenleri yazdır
        System.out.println("Duplicate elements: " + Arrays.toString(duplicates));
    }
}

