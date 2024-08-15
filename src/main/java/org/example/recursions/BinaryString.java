package org.example.recursions;

import java.util.ArrayList;
import java.util.List;

public class BinaryString {

    public static void permute(List<String> ans, char[] chars, int index, int n) {
        if (index == n) {
            ans.add(String.valueOf(chars));
            return;
        }

        chars[index] = '1';
        permute(ans, chars, index + 1, n);

        if (index != 0 && chars[index - 1] == '0') {
            return;
        }

        chars[index] = '0';
        permute(ans, chars, index + 1, n);
    }

    public static List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        char[] chars = new char[n];
        permute(ans, chars, 0, n);
        return ans;
    }

    public static void main(String[] args) {
        for (String string : validStrings(3)) {
            System.out.print(string + " : ");
        }
    }
}
