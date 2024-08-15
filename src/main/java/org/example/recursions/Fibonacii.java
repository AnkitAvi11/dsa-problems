package org.example.recursions;

public class Fibonacii {

    public static int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void printNos(int N) {
        if (N == 0) return;
        printNos(N - 1);
        System.out.print(N+" ");
    }

    public static int sumOfDigits(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static int countDigits(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {
        printNos(5);
    }
}
