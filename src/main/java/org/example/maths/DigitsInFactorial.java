package org.example.maths;

public class DigitsInFactorial {

    public static int digitsInFactorial(int N) {
        if (N <= 0) return 1;
        if (N == 1) return 1;

        double count = 0;
        for (int i = 1; i <= N; i++) {
            count += Math.log10(i);
        }

        return 1 + (int) Math.floor(count);
    }

    public static void main(String[] args) {

    }
}
