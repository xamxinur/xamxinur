package com.unitedcoder.collectiondatastructure;

public class ArrayDemo1 {
    public static void main(String[] args) {
        // integer array
        int[] arr=new int[13];  // can stir 12 value / element 0 1 2 3 ...... 11
        arr[0]=10;      arr[1]=25;
        arr[2]=15;      arr[3]=20;
        arr[4]=200;     arr[5]=880;
        arr[6]=40;      arr[7]=50;
        arr[8]=206;     arr[9]=90;
        arr[10]=130;    arr[11]=2100;
        arr[12]=89;

        System.out.println(arr[8]);
        System.out.println(arr[12]);
        System.out.println(arr.length);
        //System.out.println(arr[13]);

        // for loop
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // for each loop
        for(int a:arr){
            System.out.print(a+" ");
        }

    }
}
