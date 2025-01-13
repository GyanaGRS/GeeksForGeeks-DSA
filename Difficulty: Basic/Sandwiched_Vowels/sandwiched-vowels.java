//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    String s = br.readLine().trim();
		  
		    Complete obj = new Complete();
		    
		    System.out.println(obj.Sandwiched_Vowel(s));
		        
		
System.out.println("~");
}
		
	}
}



// } Driver Code Ends


//User function Template for Java

class Complete{
    
   
    public static String Sandwiched_Vowel(String str) 
    { 
        // Complete function
        Set<Character> vowels= new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        StringBuilder sb= new StringBuilder(str);
        for(int i=1; i<sb.length()-1; i++){
            if(vowels.contains(sb.charAt(i))){
                if(!vowels.contains(sb.charAt(i-1)) && !vowels.contains(sb.charAt(i+1))){
                    sb.deleteCharAt(i);
                    i--; //for adjusting the index after removing one element;
                }
            }
        }
        
        return sb.toString();
    } 
}
