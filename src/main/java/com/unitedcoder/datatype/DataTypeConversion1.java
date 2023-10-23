package com.unitedcoder.datatype;

public class DataTypeConversion1 {
    public static void main(String[] args) {
        // widening casting -- convert small data to large
        int i1=100;
        long l1=i1;
        System.out.println(l1);

        int i2=300;
        double d1=i2;
        System.out.println(i2);
        System.out.println(d1);

        char c1='B';
        int i3=c1;
        System.out.println(i3);

        // Narrowing casting
        long l2=1000;
        int i4=(int) l2;
        System.out.println(i4);

        long l=1000;
        byte b=(byte) l;
        System.out.println(b);

        double d2=26.98;
        int i5=(int) d2;
        System.out.println(i5);



    }
}
