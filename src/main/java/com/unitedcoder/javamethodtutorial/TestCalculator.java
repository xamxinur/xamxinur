package com.unitedcoder.javamethodtutorial;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        calculator.calculatorInfo();
        System.out.println(calculator.addMultipleNumbers(100,200,90,80,70,50,30,20,10));
        calculator.addTwoNumbers("100","300");
        calculator.sum(30,40);
        FindMaxValueMethod method = new FindMaxValueMethod();
        System.out.println(method.findMaxValue(new int[]{30,10,70,20,50,90,40}));

    }
}
