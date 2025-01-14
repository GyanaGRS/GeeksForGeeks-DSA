//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            String line = br.readLine().trim();

            Solution obj = new Solution();

            System.out.println(obj.getMaxOccuringChar(line));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends



class Solution {
    // Function to find the maximum occurring character in a string.
    public static char getMaxOccuringChar(String s) {
        // Your code here
        char[] elements= s.toCharArray();
        Arrays.sort(elements);
        
        int count=1;
        int maxOccur=1;
        char maxChar= elements[0];
        
        for(int i=1; i<elements.length; i++){
            if(elements[i]==elements[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>maxOccur){
                maxOccur= count;
                maxChar= elements[i];
            }
        }
        return maxChar;
    }
}