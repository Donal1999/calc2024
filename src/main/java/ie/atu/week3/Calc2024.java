// Donal Ó Maoilchiaráin
// Assignment 2
// Using Github
//30.9.2024

package ie.atu.week3;

import java.util.Scanner;
public class Calc2024 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter Number");
        Double fristNum = scan1.nextDouble();
        System.out.println("You Entered " + fristNum);

        System.out.println("Enter Second Number");
        Double secondNum = scan1.nextDouble();
        System.out.println("You Entered " + secondNum);

        System.out.println("Enter an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();


    }
}
