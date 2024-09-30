// Donal Ó Maoilchiaráin
// Assignment 2
// Using Github
//30.9.2024

package ie.atu.week3;

import java.util.Scanner;
public class Calc2024 {
    public static void main(String[] args) {
        // prompt user
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Enter Number");
        double fristNum = scan1.nextDouble();
        System.out.println("You Entered " + fristNum);

        System.out.println("Enter Second Number");
        double secondNum = scan1.nextDouble();
        System.out.println("You Entered " + secondNum);

        System.out.println("Enter an operation (add, subtract, multiply, divide, exponential): ");
        String operation = scan1.next();


        switch (operation) {
            case "add":
                add(fristNum, secondNum);
                break; // pass the firstNum and secondNum from the scanner
            case "subtract":
                subtract(fristNum, secondNum);
                break;
            case "multiply":
                multiply(fristNum, secondNum);
                break;
            case "divide":
                divide(fristNum, secondNum);
                break;
            case "exponential":
                exponential(fristNum, secondNum);
                break;
            default:
                System.out.println("Invalid operation");
                break;
        }

    }
    //add method
    public static void add(double a, double b) {
        double sum = a + b;
        System.out.println("Result is " + sum);
    }
    //subtract method
    public static void subtract(double a, double b) {
        double sum = a - b;
        System.out.println("Result is " + sum);
    }
    // multiply method
    public static void multiply(double a, double b) {
        double sum = a * b;
        System.out.println("Result is " + sum);
    }
    //divide method
    public static void divide(double a, double b) {
        if(b == 0){
            System.out.println("invalid operation");

        }
        else{
            double sum = a/b;
            System.out.println("Result is " + sum);
        }
    }
    //exponential method using math class pow
    public static void exponential(double a, double b) {
        double sum = (Math.pow(a,b));
        System.out.println("Result is " + sum);
    }


}
