package com.unitedcoder.datatype;

public class PrePostIncrementAndDecrement {
    public static void main(String[] args) {
        // i++; post increment--  first execute the operation and then plus one
        // ++i; pre increment--   first plus one and then execute operation

        int a=30;
        int b=50+(++a);
        int c=++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        int a1=30;
        int b1=50+(a1++);
        int c1=a1++;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
        System.out.println("____________________________________");

        //Pre decrement
        //Post decrement
        int x1=10;
        int y1=--x1;
        System.out.println(x1); //9
        System.out.println(y1); //9

        int x2=20;
        int y2=(x2--)+90;
        int y3=(--x2)-20;
        int y4=--y3;
        int y5=y4--;
        System.out.println(x2); //18
        System.out.println(y2); //110
        System.out.println(y3); //-3
        System.out.println(y4);//-4
        System.out.println(y5);//-3


    }
}
