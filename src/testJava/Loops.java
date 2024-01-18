package testJava;

import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
        /*
        * while(condition){
        *   statement
        * }
        */

        System.out.println("Enter a number");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        while(num <= 20) {
            System.out.println(num++);
        }

        System.out.println("After while loop");

    }
}
