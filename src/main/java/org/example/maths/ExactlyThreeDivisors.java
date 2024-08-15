package org.example.maths;

public class ExactlyThreeDivisors {

    public static boolean isPrime(int N) {
        if (N <= 1) return false;

        if (N == 2 || N == 3) return true;
        if (N % 2 == 0 || N % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(N); i+=6) {
            if (N % i == 0 || N % (i + 2) == 0) return false;
        }

        return true;
    }

    /**
     * Function to find the numbers from 1 to N which has exactly three divisors
     * @param N the range till which we need to find the number
     * @return the total count of numbers which has exactly three divisors
     */
    public static int exactlyThreeDivisors(int N) {
        int count = 0;

        for (int i = 1; i <= Math.sqrt(N) ; i++) {
            if (isPrime(i) && i * i <= N)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

    }
}
