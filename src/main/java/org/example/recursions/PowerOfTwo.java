package org.example.recursions;

public class PowerOfTwo {

    public static boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) return true;

        if (n <= 0 || n % 2 != 0)
            return false;

        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(3));
    }
}
