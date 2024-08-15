package org.example.maths;

public class ComputingPower {

    public static long computePower(int n, int pow) {
        if (pow == 0) return 1;
        long temp = computePower(n, pow / 2);

        if (pow % 2 == 0) {
            return temp * temp;
        }

        return temp * temp * n;
    }

    public static long computePowerIterative(int n, int pow) {
        if (pow == 0) return 1;
        long ans = 1;
        while (pow > 0) {
            if (pow % 2 == 1) {
                ans *= n;
            }
            pow /= 2;
            n = n * n;
        }

        return ans;
    }

    public static long computePowerRecursive(int N, int R) {
        if (R == 0) return 1;

        long temp = computePower(N, R / 2);
        if (R % 2 == 0)
            return temp * temp;

        return temp * temp * N;
    }

    public static void main(String[] args) {
        System.out.println("Answer = " + computePower(5, 0));
    }
}
