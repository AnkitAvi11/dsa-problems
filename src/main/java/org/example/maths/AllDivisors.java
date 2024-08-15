package org.example.maths;

public class AllDivisors {

    public static void allDivisorsUnSorted(int n) {

        for (int i = 1; i * i <= n ; i++) {
            if (n % i == 0) {
                System.out.print(i + " : ");
                if (n / i != i) {
                    System.out.print((n / i) + " : ");
                }
            }
        }
    }

    public static void allDivisorsSorted(int n) {

        for (int i = 1; i * i < n ; i++) {
            if (n % i == 0) {
                System.out.print(i + " : ");
            }
        }

        for (int i = (int) Math.sqrt(n) ; i > 0 ; i--) {
            if (n % i == 0) {
                System.out.print((n / i) + " : ");
            }
        }
    }

    public static void main(String[] args) {
        allDivisorsSorted(25);
    }
}
