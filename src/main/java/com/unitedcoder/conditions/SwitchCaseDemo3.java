package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. switch   break    default
        String number=input.next();
        if(StringUtils.isNumeric(number)){
            switch (number.length()){
                case 1:
                    System.out.println("One digit");
                    break;
                case 2:
                    System.out.println("Two digits");
                    break;
                case 3:
                    System.out.println("Three digits");
                    break;
                default:
                    System.out.println("Number is greater than 1000");
            }

            }
             else{
                   System.out.println("Please enter digit numbers!");
        }


             // 2.  if  els if
//        int number=input.nextInt();
//        if(number>=0&&number<10){
//            System.out.println("one digit");
//        }
//        else if (number>=10&&number<100) {
//            System.out.println("Two digit");
//
//        }
//        else if(number>=100&&number<1000){
//            System.out.println("Three digits");
//        }
//        else {
//            System.out.println("Number is greater than 1000");
//        }
    }
}
