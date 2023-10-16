package ie.atu;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("hello");
        add();
        divide();
        multiply();
        subtract();
    }

    public static void add()
    {
        System.out.println("Please your first number to add :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number to add :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;
        System.out.println("The total is " + total);
    }



    public static void divide ()
    {
        System.out.println("\n Please your first number to divide :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number to divide  :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total is " + total);
    }



    public static void multiply()
    {
        System.out.println("\n Please your first number to multiply :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number to multiply :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber * secondNumber;
        System.out.println("The total is " + total);
    }


    public static void subtract()
    {
        System.out.println("\n Please your first number to subtract:");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number to subtract  :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber - secondNumber;
        System.out.println("The total is " + total);
    }
    public static void delete()
    {

    }
}


