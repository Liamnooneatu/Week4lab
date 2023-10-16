package ie.atu;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        System.out.println("hello");
        divide();
    }

    public static void divide ()
    {
        System.out.println("Please your first number :");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please your second number :");
        int secondNumber = inputs.nextInt();

        int total = firstNumber / secondNumber;
        System.out.println("The total is " + total);
    }

    public static void delete()
    {

    }
}