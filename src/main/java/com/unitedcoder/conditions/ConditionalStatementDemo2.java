package com.unitedcoder.conditions;

import java.util.Scanner;

public class ConditionalStatementDemo2 {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("Welcome to the Game!!!");
        System.out.println("Please enter your age");
        int age=number.nextInt();

        // if
        if(age>=18){ // boolean data type
            // if block
            System.out.println("Congratulations!!! You can continue with your game!!!");
        }
        //System.out.println("***************");
        else {
            System.out.printf("You are not qualified for this Game!");  // els block
        }
    }
}
