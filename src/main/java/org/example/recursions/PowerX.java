package org.example.recursions;

public class PowerX {

    public double compute(double x, int n) {
        //  anything to the power 0 is 1
        if (n == 0) return 1;

        double temp = compute(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        }

        return temp * temp * ( 1 / x);
    }

    public double computePositive(double x, int n) {
        //  anything to the power zero is 1
        if (n == 0)
            return 1;

        double temp = computePositive(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return temp * temp * x;
        }
    }

    public double myPow(double x, int n) {
        if (n < 0) return compute(x, n);
        return computePositive(x, n);
    }

    public static void main(String[] args) {
        PowerX power = new PowerX();
        System.out.println(power.computePositive(2.0000, 10));
    }
}
