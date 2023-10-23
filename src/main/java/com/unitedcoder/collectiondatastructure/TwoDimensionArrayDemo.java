package com.unitedcoder.collectiondatastructure;

public class TwoDimensionArrayDemo {
    public static void main(String[] args) {
        int[][] a1=new int[4][];
        // int[] a2[]={};           index   0,1,2,3,
                                //  length  1,2,3,4,
        int[][] arr={
                {1,2,3},
                {6,9,10,70},
                {30,90},
                {20,80,30,5,8,10}
        };
        System.out.println(arr.length);     // 4
        System.out.println(arr[1].length);  // 4
        System.out.println(arr[3].length);  // 6
        System.out.println(arr[1][1]);      // 9
        System.out.println(arr[3][2]);      // 30
        System.out.println(arr[2][1]);     //  90
        System.out.println("_______________________________________");

        int sum=0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
                sum+=arr[i][j];
            }
            System.out.println("Each Sum: "+sum);
        }



    }
}
