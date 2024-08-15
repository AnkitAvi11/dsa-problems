package org.example.maths;

public class PrimalityTest {

    public boolean isPrime(int N) {
        int num = N;
        if (num <= 1) return false;

        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        for (int i = 5; i <= Math.sqrt(num); i+=6) {
            if (num % i == 0 || num % (i + 2) == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
