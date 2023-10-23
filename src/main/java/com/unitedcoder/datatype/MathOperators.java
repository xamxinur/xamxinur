package com.unitedcoder.datatype;

import java.util.Random;

public class MathOperators {
    public static void main(String[] args) {
        int i1=100;
        System.out.println(Math.max(100,150));
        System.out.println(Math.min(20,400));
        System.out.println(Math.abs(-90));
        System.out.println(Math.pow(3,4));
        // Random  range   0.0  -------  0.99999999999
        System.out.println(Math.random());
        // 0-10
        int randomNumbers = (int)(Math.random()*10)+1;
        System.out.println(randomNumbers);
        System.out.println("RRRRRRRRRRRRRRRRRRRRRRRRRRRRR");

        // Random Class
        Random random=new Random();
        System.out.println(random.nextInt());




    }
}
