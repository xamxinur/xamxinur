package com.unitedcoder.collectiondatastructure;

import java.util.Arrays;

public class CharArrayDemo {
    public static void main(String[] args) {
        String city="Amsterdam";
        char[] c=new char[city.length()];
        for (int i=0; i<city.length(); i++){
            c[i]=city.charAt(i);
        }
        System.out.println(Arrays.toString(c));

    }
}
