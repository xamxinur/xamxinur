package com.unitedcoder.conditions;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a number from 1 to 12 for a month");
        String  month=input.next();
        if(StringUtils.isNumeric(month)) {
            switch (Integer.parseInt(month)) {
                case 1:
                    System.out.println("It is January!");
                    break;
                case 2:
                    System.out.println("It is February!");
                    break;
                case 3:
                    System.out.println("It is March");
                    break;
                case 4:
                    System.out.println("April!");
                    break;
                case 5:
                    System.out.println("May!");
                    break;
                case 6:
                    System.out.println("June!");
                    break;
                case 7:
                    System.out.println("July!");
                    break;
                case 8:
                    System.out.println("August!");
                    break;
                case 9:
                    System.out.println("September!");
                    break;
                case 10:
                    System.out.println("October!");
                    break;
                case 11:
                    System.out.println("November!");
                    break;
                case 12:
                    System.out.println("December!");
                    break;
                default:
                    System.out.println("Please enter a valid number for month!!!");
            }
        }else {
            System.out.println("Please enter a valid digit number for month!!!");

        }
    }
}

