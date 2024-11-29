package com.dev;
//Wap to reverse given string : 2*50+3-10, output : 10-3+50*2
public class ReverseStringExpression {
    public static void main(String[] args) {
        String expression = "2*50+3-10";
        String reversedExpression = reverseExpression(expression);
        System.out.println("Reversed Expression: " + reversedExpression);
    }

    private static String reverseExpression(String expression) {
        StringBuilder result = new StringBuilder();
        StringBuilder number = new StringBuilder();

        // Traverse the expression from right to left
        for (int i = expression.length() - 1; i >= 0; i--) {
            char ch = expression.charAt(i);

            // If current character is a digit, build the number
            if (Character.isDigit(ch)) {
                number.insert(0, ch); // Insert digit at the start of number
            } else {
                // If an operator is found, append the number (if any) and the operator
                if (number.length() > 0) {
                    result.append(number);
                    number.setLength(0); // Reset the number
                }
                result.append(ch); // Append the operator
            }
        }

        // Append the last number if any
        if (number.length() > 0) {
            result.append(number);
        }

        return result.toString();
    }
}

