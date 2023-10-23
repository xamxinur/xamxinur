package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class ArraysObjectDemo {
    public static void main(String[] args) {
        int[] arr1={98,67,44,23,10};
        int[] arr2={78,90,34,80,45};
        int[] arr3={98,67,44,23,10};

        // equals = سېلىشتۇرۇش
        boolean result1= Arrays.equals(arr1,arr2);
        boolean result2=Arrays.equals(arr1,arr3);
        System.out.println(result1);
        System.out.println(result2);

        Arrays.fill(arr2,20);
        System.out.println(Arrays.toString(arr2));

        // copy of array
        int[] arr4=Arrays.copyOf(arr1,5);
        System.out.println(Arrays.toString(arr4));

        // copy of two array
        int[] arr5=new int[arr1.length];
        for (int i=0; i<arr1.length; i++){
            arr5[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr5));


    }
}
