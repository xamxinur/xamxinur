package com.unitedcoder.conditions;

public class LogicalOperatorsAndBitwiseOperators {
    public static void main(String[] args) {
        // &&   &
//        System.out.println(9>10&&8<10);
//        System.out.println(9>10&8<10);
        boolean b1=false;
        int number=200;
        if(b1&&(number++>0)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("Value of number is: "+number);

        int number1=300;
        if(b1&(number1++>0)){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        System.out.println("Value of number is: "+number1);
    }
}
