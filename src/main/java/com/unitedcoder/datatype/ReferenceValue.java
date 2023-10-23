package com.unitedcoder.datatype;

public class ReferenceValue {
    public static void main(String[] args) {
        int x=900;
        int y=100;
        // y=900  x=100
        int tempValue=x;
        x=y;
        y=tempValue;
        System.out.println("Value of X is: "+x);
        System.out.println("Value of Y is: "+y);
    }
}
