package com.unitedcoder.collectiondatastructure;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] a = new int[]{20, 40, 10, 50, 60, 89, 66, 78, 56};
        int[] b = {10, 40, 30, 80, 90, 100};

        System.out.println(a[5]);
        System.out.println(a.length);
        System.out.println(b.length);
        System.out.println(b[3]);

        // sum    for loop
        int sum = 0;
        for (int i = 0; i < b.length; i++) {
            sum += b[i];
        }
        System.out.println(sum);

        // sum for each loop

        int sum1 = 0;
        for (int r : b) {
           sum1+=r;
        }
        System.out.println(sum1);
        System.out.println();

        // for loop
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
         //for each loop
        for (int c:b){
            System.out.print(c+" ");
        }


    }
}
