package com.dev.arr;

import java.util.Scanner;

public class Calculator {

    public double add(double number1, double number2) {
        return number1 + number2;
    }

    public double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return number1 / number2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result;
        char operator;
        boolean continueCalculation = true;

        while (continueCalculation) {
            System.out.println("\nCalculator Menu:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("\nEnter first number: ");
            number1 = scanner.nextDouble();

            System.out.print("Enter operator (+, -, *, /): ");
            operator = scanner.next().charAt(0);

            System.out.print("Enter second number: ");
            number2 = scanner.nextDouble();

            switch (operator) {
                case '+':
                    result = calculator.add(number1, number2);
                    System.out.printf("%.2f + %.2f = %.2f%n", number1, number2, result);
                    break;

                case '-':
                    result = calculator.subtract(number1, number2);
                    System.out.printf("%.2f - %.2f = %.2f%n", number1, number2, result);
                    break;

                case '*':
                    result = calculator.multiply(number1, number2);
                    System.out.printf("%.2f * %.2f = %.2f%n", number1, number2, result);
                    break;

                case '/':
                    try {
                        result = calculator.divide(number1, number2);
                        System.out.printf("%.2f / %.2f = %.2f%n", number1, number2, result);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            System.out.print("\nDo you want to perform another calculation? (y/n): ");
            char choice = scanner.next().charAt(0);
            continueCalculation = (choice == 'y' || choice == 'Y');
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();
    }
}
