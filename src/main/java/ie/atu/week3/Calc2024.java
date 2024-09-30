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
        double fristNum = scan1.nextDouble();
        System.out.println("You Entered " + fristNum);

        System.out.println("Enter Second Number");
        double secondNum = scan1.nextDouble();
        System.out.println("You Entered " + secondNum);

        System.out.println("Enter an operation (add, subtract, multiply, divide): ");
        String operation = scan1.next();


        switch(operation){
            case "add": add(fristNum, secondNum); break ; // pass the firstNum and secondNum from the scanner
            case "subtract": subtract(fristNum, secondNum);break;
            default: System.out.println("Invalid operation");break;
        }

    }
    public static void add(double a, double b){
        double sum = a + b ;
        System.out.println("Result is " + sum);
    }

    public static void subtract(double a, double b){
        double sum = a - b ;
        System.out.println("Result is " + sum);
    }
}
