//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String A = sc.next();
            String B = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.uncommonChars(A, B));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends




class Solution {
    String uncommonChars(String s1, String s2) {
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        String result = "";

        // Check for characters in s1 not in s2
        for (char ch : arr1) {
            if (s2.indexOf(ch) == -1 && result.indexOf(ch) == -1) { // Not in s2 and not already added
                result += ch;
            }
        }

        // Check for characters in s2 not in s1
        for (char ch : arr2) {
            if (s1.indexOf(ch) == -1 && result.indexOf(ch) == -1) { // Not in s1 and not already added
                result += ch;
            }
        }

        // Sort the result to match the expected order
        char[] resultArr = result.toCharArray();
        java.util.Arrays.sort(resultArr);

        return new String(resultArr);
    }
}
