package org.example.recursions;

public class DigitalRoot {

    public static int digitalRoot(int n) {
        if (n < 10) return n;

        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }

        return digitalRoot(s);
    }

    public static void main(String[] args) {
        System.out.println(digitalRoot(1000));
    }
}
