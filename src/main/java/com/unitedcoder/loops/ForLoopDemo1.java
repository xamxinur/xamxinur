package com.unitedcoder.loops;

public class ForLoopDemo1 {
    public static void main(String[] args) {

       // 1 - 100
        for(int i=1; i<=100; i++){
            System.out.print(i+" ");
        }
        System.out.println("****************************************************************");
        // 100  -1
        for (int i=100;i>=1; i--){
            System.out.print(i+" ");
        }
        System.out.println("#################################################################");

        // 0-100 jup sanlar
        for(int j=0; j<=100; j=j+2){
            System.out.print(j+" ");
        }
        System.out.println("___________________________________________________________________");
        for (int j=0; j<=100; j++){
            if(j!=0&&j%2==0){
                System.out.print(j+" ");
            }
        }

    }
}
