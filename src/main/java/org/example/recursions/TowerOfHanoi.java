package org.example.recursions;

public class TowerOfHanoi {

    public static long toh(int n, int from, int to, int aux) {
        long moves = 0L;

        if (n >= 1) {
            moves += toh(n - 1, from, aux, to);
            System.out.println("move disk " + n + " from rod " + from + " to rod " + to);
            moves += 1 + toh(n - 1, aux, to, from);
        }

        return moves;
    }

    public static void main(String[] args) {
        System.out.println(toh(3, 1, 3, 2));
    }
}
