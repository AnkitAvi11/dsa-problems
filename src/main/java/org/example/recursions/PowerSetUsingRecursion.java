package org.example.recursions;


import java.util.ArrayList;
import java.util.Comparator;

public class PowerSetUsingRecursion {

    /**
     * Function to generate a list of string containing all the elements of the powerset for the given string
     * @param string string for which the powerset is to be generated
     * @param ans contains list of all the elements of the powerset
     * @param index to track the index of the current element from the string
     * @param curr to keep the current generated string
     */
    public static void computePowerSet(String string, ArrayList<String> ans, int index, String curr) {
        int n = string.length();

        if (index == n) {
            ans.add(curr);
            return;
        }

        computePowerSet(string, ans, index + 1, curr + string.charAt(index));
        computePowerSet(string, ans, index + 1, curr);
    }

    /**
     * Driver function for the console program
     * @param args command line arguments (if any)
     */
    public static void main(String[] args) {
        String input = "abc";
        ArrayList<String> ans = new ArrayList<>();
        computePowerSet(input, ans, 0, "");

        ans.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for (String string : ans) {
            System.out.print(string + " : ");
        }
    }
}
