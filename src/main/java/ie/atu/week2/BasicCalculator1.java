package ie.atu.week2;

import java.util.Scanner;

public class BasicCalculator1 {

    public static void main(String[] args) {

        //Prompt the user for a second number
        //Display the total to the screen
        Scanner scan1= new Scanner(System.in);

        //Input first number
        System.out.println("Enter first number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

        //Input second number
        System.out.println("Enter second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        double sum = firstNum + secondNum;
        System.out.println("The sum is " + sum);
    }
}
