package com.unitedcoder.loops;

public class ForLoopDemo2 {
    public static void main(String[] args) {
        // 1--10 sum


        int sum = 0;
        for (int i=1; i<=10; i++){
            sum+=i;  // sum =sum +i
            System.out.printf("i=%d sum=%d\n",i,sum);
        }
        System.out.println("1. Total Sum: "+sum);
        System.out.println();


        // 1--5 factorial   1*2*3*4*5
         int factorial = 1;
         for (int i=1; i<=5; i++){
            factorial*=i;  // factorial = factorial * i
             System.out.printf("i=%d factorial=%d\n",i,factorial);
         }
         System.out.print("2. Factorial: "+factorial);
        System.out.println();

        // Count even numbers
        int evenNumberCounts = 0;
        for (int j=0; j<=100; j++){
            if(j!=0&&j%2==0){
                //System.out.print(j+" ");
                evenNumberCounts++;
            }
        }
        System.out.println();
        System.out.println("3. Total even numbers is : "+evenNumberCounts);
        System.out.println();


    }
}
