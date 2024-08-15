package org.example.recursions;

public class PowerOfNumbers {

    private static final long modulo = 1000000007;

    public static long power(int N, int R) {
        if (R == 0) return 1;

        long y = power(N, R / 2);
        if (R % 2 == 0) {
            y = (y * y) % modulo;
        } else {
            y = N % modulo;
            y = (y * power(N, R - 1) % modulo) % modulo;
        }

        return ((y + modulo) % modulo);
    }

    public static void main(String[] args) {

    }
}
