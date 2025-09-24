package ie.atu.week2;

import java.util.Scanner;

public class BasicCalculator1 {

    public static void main(String[] args) {

        //Prompt the user for a second number
        //Display the total to the screen
        Scanner scan1 = new Scanner(System.in);

        //Input first number
        System.out.println("Enter your first number: ");
        double firstNum = scan1.nextDouble();
        System.out.println("You entered " + firstNum);

        //Input second number
        System.out.println("Enter your second number: ");
        double secondNum = scan1.nextDouble();
        System.out.println("You entered " + secondNum);

        double sum = firstNum + secondNum;
        System.out.println("The sum is " + sum);

        System.out.println("Choose Operator: ");
        String operation = scan1.next();

        double result = switch (operation) {
            case "add" -> {
                yield firstNum + secondNum;
            }
            case "subtract" -> {
                yield firstNum - secondNum;
            }
            case "multiply" -> {
                yield firstNum * secondNum;
            }
            case "divide" -> {
                yield firstNum / secondNum;
            }

            default -> {
                System.out.println("Invalid Input");
                yield 0;
            }

        };
        System.out.println("Result is: " + result);
    }
}
