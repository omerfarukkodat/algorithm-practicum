package org.example;



// Java code for k largest elements in an array

import java.util.PriorityQueue;

public class KLargestElementWithQueue {

    public static void kLargestElement(int[] array , int n , int k){

        // Implementation using
        // a Priority Queue

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i=0 ; i<n ; i++){

            priorityQueue.add(array[i]);

            // If size of the priority
            // queue exceeds k

            if (priorityQueue.size()>k){
                priorityQueue.poll();
            }

        }

        while (!priorityQueue.isEmpty()){

            System.out.print(priorityQueue.peek()+ " ");
            priorityQueue.poll();
        }
        System.out.println();

    }




    public static void main(String[] args) {


        int a[] = { 11, 3, 2, 1, 15, 5, 4, 45, 88, 96, 50, 45 };
        int n = a.length;
        int k = 3;

        System.out.print(k + " largest elements are : ");
        // Function Call
        kLargestElement(a, n, k);

    }

}
