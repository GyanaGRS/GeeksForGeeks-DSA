//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        
        while(t--!=0){
            String s1=in.next(),
                   s2=in.next();
            
            Solution obj = new Solution();
            
            System.out.println(obj.concatenatedString(s1,s2));
        
System.out.println("~");
}
    }
}

// } Driver Code Ends

class Solution
{
    //Function to remove common characters and concatenate two strings.
    public static String concatenatedString(String s1,String s2)
    {
        // Your code here
        // Set<Character> hs1= new HashSet<>();
        // Set<Character> hs2= new HashSet<>();
        
        // StringBuilder res= new StringBuilder();
        
        // for(char ch: s1.toCharArray()){
        //     hs1.add(ch);
        // }
        // for(char ch: s2.toCharArray()){
        //     hs2.add(ch);
        // }
        
        // for(char ch: hs1){
        //     if(!hs2.contains(ch)){
        //         res.append(ch);
        //     }
        // }
        // for(char ch: hs2){
        //     if(!hs1.contains(ch)){
        //         res.append(ch);
        //     }
        // }
        
        // return res.toString();
        
        String res="";
        
        for(char ch: s1.toCharArray()){
            if(!s2.contains(String.valueOf(ch))){
                res+= ch;
            }
        }
        for(char ch: s2.toCharArray()){
            if(!s1.contains(String.valueOf(ch))){
                res+= ch;
            }
        }
        
        return res.isEmpty() ? "-1" : res;
    }
}
