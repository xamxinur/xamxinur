package com.unitedcoder.conditions;

import java.util.Scanner;

public class ATMDemo2 {
    public static void main(String[] args) {
        int correctPin=1234;
        // Pin number
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your pin number");
        int pin=input.nextInt();

        if(String.valueOf(pin).length()==4&&pin==correctPin){
            System.out.println("Correct pin length");
            System.out.println("Your account number is 786544688");
            System.out.println("Your account balance is 10000 $");
        }
        else {
            System.out.println("Your entered wrong pin number");
            System.out.println("Please try again with correct pin number");
        }
    }
}
