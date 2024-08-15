package org.example.recursions;

public class JosephusProblem {

    public static int josephus(int n, int k) {
        if (n == 1) return 1;
        return (josephus(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(josephus(5, 2));
    }
}
