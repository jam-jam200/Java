package com.example;

public class DoWhile {
    public static void main(String[] args){
        /* Do {
         *  statement
         * } while(condition)
         */

        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while(i < 10);
        System.out.println("outside do while loop");
    }
}
