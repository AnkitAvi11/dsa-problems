package org.example.recursions;

public class StringToInteger {

    public static int myatoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int index = 0;
        char first = s.charAt(index);
        if (first == '-') {
            sign = -1;index++;
        } else if (first == '+'){
            index++;
        }

        long ans = 0;
        for (int i = index ; i < s.length() ; i++) {
            //  break out of the loop if not a digit
            if (!Character.isDigit(s.charAt(i))) {
                break;
            }

            int digit = s.charAt(i) - '0';
            ans = (ans * 10) + digit;

            if (sign == 1 && ans > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && ans < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }

        return (int) ans * sign;
    }

    public static void main(String[] args) {
        String input = "42";
        System.out.println(myatoi(input));
    }
}
