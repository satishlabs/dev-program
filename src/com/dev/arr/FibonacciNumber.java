package com.dev.arr;

public class FibonacciNumber {
    public static void main(String[] args) {
        FibonacciNumber fibonacciNumber = new FibonacciNumber();
        fibonacciNumber.fibonacciNumber(10);
    }

private void fibonacciNumber(int n) {
    int firstNum = 0;
    int secondNum = 1;
    System.out.print("Fibonacci Series up to " + n + " numbers: ");

    for (int i = 1; i <= n; i++) {
        System.out.print(firstNum + " ");
        int nextNum = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = nextNum;
    }
}
}
