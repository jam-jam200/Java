package com.example;

import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        /*
        * switch(expression){
        *   case 1:
        *       statements;
        *   case 2:
        *       statements;
        *
        *   ...
        *
        *   default:
        *       statement;
        * }
        */

        System.out.println("Pick a number between 1-7");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Pick a number within the range of 1-7");
        }


    }
}
