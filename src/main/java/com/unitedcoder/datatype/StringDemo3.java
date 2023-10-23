package com.unitedcoder.datatype;

public class StringDemo3 {
    public static void main(String[] args) {
        // trim
        String result=" All Test Passed ";
        System.out.println(result.length()); // 17
        System.out.println((result.trim()).length()); //15
        // replace
        result=result.replace(" ",""); // 13
        System.out.println(result.length());

        //String format
        String course="United Coder";
        String course1="Selenium Master";
        String course2="Java Selenium Course";
        // Welcome to
        System.out.println(String.format("Welcome to %s",course2)); // %s = course,course1,course2

        int i1=100;
        int i2=200;
        int i3=i1+i2;
        System.out.println(i1+i2); //300
        System.out.println(String.format("%d+%d=%d",i1,i2,i3));// 100+200=300
        System.out.println(String.format("I am learning Arithmetic Operation Plus in %s: %d + %d = %d ",course,i1,i2,i3));
        System.out.printf("%d+%d=%d\n",i1,i2,i3);
        System.out.println("*************************");

        boolean b1=true;
        boolean b2=false;
        System.out.println(String.format("Login Test Passed %b",b1));



    }
}
