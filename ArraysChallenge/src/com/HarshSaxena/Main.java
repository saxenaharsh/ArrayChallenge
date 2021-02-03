package com.HarshSaxena;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] myIntegerArray = getIntegers(5);
        int[] mysortedArray = sortedArray(myIntegerArray);
        printArray(mysortedArray);


    }

    public static int[] getIntegers(int capacity){
        System.out.println("Enter " + capacity + " random numbers\r");
        int[] array = new int[capacity];
        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array){
        for(int i = 0; i< array.length; i++){
            System.out.println("Element " + i + " has value " + array[i]);
        }
    }

    public static int[] sortedArray(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i + 1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;


    }

}
