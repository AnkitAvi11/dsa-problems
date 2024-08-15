package org.example.recursions;

import java.util.Arrays;

public class StringPermutation {

    public static void permute(String str, int l, int r)
    {
        if (l == r)
            System.out.println(str);
        else
        {
            for (int i = l; i <= str.length() - 1; i++)
            {
                str = swap(str,l,i);
                permute(str, l+1, r);
                str = swap(str,l,i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param a string value
     * @param i position 1
     * @param j position 2
     * @return swapped string
     */
    public static String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void stringPermutation(String string, int[] counter, char[] result, int index) {
        if (index == string.length()) {
            StringBuilder ans = new StringBuilder();
            for (char ch : result) ans.append(ch);
            System.out.println(ans);
            return;
        }

        for (int i = 0 ; i < string.length() ; i++) {
            if (counter[i] == 0) {
                continue;
            } else {
                result[index] = string.charAt(i);
                counter[i] = 0;
                stringPermutation(string, counter, result, index + 1);
                counter[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Does not use extra spaces");
        permute("abc", 0, 2);

        int[] counter = new int[3];
        Arrays.fill(counter, 1);
        char[] result = new char[3];

        System.out.println("Uses extra spaces");
        stringPermutation("abc", counter, result, 0);
    }
}
