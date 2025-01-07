//{ Driver Code Starts
// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(in.readLine().trim());
        while (t-- > 0) {
            String line = in.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;

            int key = Integer.parseInt(in.readLine().trim());
            Solution ob = new Solution();
            out.println(ob.kthSmallest(arr, key));
            out.println("~");
        }
        out.flush();
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public static int kthSmallest(int[] arr, int k) {
        // Your code here
        if (arr == null || k > arr.length || k <= 0) {
            return -1;
        }
        
        // Sort the array
        Arrays.sort(arr);

        // To track distinct elements
        int count = 1;

        // If k == 1, we directly return the first element
        if (k == 1) {
            return arr[0];
        }

        // Iterate through the array, skipping duplicates
        for (int i = 1; i < arr.length; i++) {
            // Skip duplicates
            if (arr[i] != arr[i - 1]) {
                count++;
            }

            // When count reaches k, return the element
            if (count == k) {
                return arr[i];
            }
        }

        // If there are less than k distinct elements, return -1
        return -1;
    }
}
