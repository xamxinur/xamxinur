package com.unitedcoder.collectiondatastructure;

public class SplitArrayDemo {
    public static void main(String[] args) {
        String school="United_Coder";
        String s="Hello,World";

        String[] arr1=school.split("_");

        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println("________________________________________");
        // for each loop
        for(String a:arr1){
            System.out.println(a);
        }
        String[] s1=s.split(",");
        for(String b:s1) {
            System.out.println(b);
        }

    }
}
