package com.example;

public class BreakAndContinue {
    public static void main(String[] args){

        for (int i = 1; i <= 10; i++){

            if (i == 7) {
//                break; will stop at condition
                continue; //will skip the condition and continue to the next line
            }

            System.out.println(i);
        }
        System.out.println("Outside loop, final statement");

    }
}
