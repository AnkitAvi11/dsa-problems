package org.example.maths;

public class PrimeFactors {

    public static void printPrimeFactors(int n) {
        if (n <= 1) throw new IllegalArgumentException("Number can not be less than 2");

        while ( n > 0 && n % 2 == 0) {
            System.out.print(2 + " : ");
            n = n / 2;
        }

        while (n > 0 && n % 3 == 0) {
            System.out.print(3 + " : ");
            n = n / 3;
        }

        for (int i = 5 ; i <= Math.sqrt(n) && n > 0 ; i += 6) {
            while (n > 0 && n % i == 0) {
                System.out.print(i + " : ");
            }
            while (n > 0 && n % i == 0) {
                System.out.print(i + " : ");
            }
        }

        if (n > 3)
            System.out.print(3);
    }

    public static void main(String[] args) {

    }
}
