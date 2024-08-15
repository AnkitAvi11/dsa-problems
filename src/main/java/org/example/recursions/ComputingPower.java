package org.example.recursions;

public class ComputingPower {

    public static int recursivePower(int n, int p) {
        if (p == 0) return 1;

        int ans = recursivePower(n, p / 2);

        if (p %  2 == 0) {
            return ans * ans;
        } else {
            return ans * ans * n;
        }
    }
}
