package com.unitedcoder.conditions;

import java.util.Scanner;

public class StudentGradeDemo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score");
        int score = input.nextInt();
        // Nested if   شەرت ئ‍چىدە شەرت
        if (score <= 100) {

            if (score >= 90 && score <= 100) {
                System.out.println("Great!!Good job!! your grade is 'A'!! You win an Ipad!!!");
            } else if (score >= 80 && score < 90) {
                System.out.println("Good Job!!! Your Grade is 'B',You win an Iphone!!!");
            } else if (score >= 70 && score < 80) {
                System.out.println("You grade is 'C'!");
            } else if (score >= 60 && score < 70) {
                System.out.println("Your grade is 'D'!");
            } else {
                System.out.println("You failed the exam, Please work hard!!");
            }
        }
        else {
            System.out.println("Wrong score!!! Please enter score between 0-100!!!");
        }
    }
}
